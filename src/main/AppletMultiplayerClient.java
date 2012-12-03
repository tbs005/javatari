package main;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import atari.network.RemoteReceiver;

import parameters.Parameters;
import pc.room.Room;
import pc.screen.PanelScreen;
import utils.Terminator;

public class AppletMultiplayerClient extends JApplet {

	@Override
	public void init() {
		// Builds an Array of args from the Applet parameters to mimic command line args
		ArrayList<String> args = new ArrayList<String>();
		for (int i = -1; i < 50; i++) {
			String paramName = "ARG" + (i >= 0 ? i : "");
			String paramValue = getParameter(paramName);
			if (paramValue != null) args.add(paramValue);
		}
		
		// Load Parameters from properties file and process arguments
		Parameters.init(args.toArray(new String[0]));

		// Process background color parameter if present
		String backgroundParam = getParameter("BACKGROUND");
		System.out.println("Background color: " + backgroundParam);
		Integer backColor = backgroundParam != null ? Integer.parseInt(backgroundParam) : null;

		// Create an Applet Room
		room = Room.buildAppletClientRoom();
		
		// Add the screen to the Applet and set the background color
		setContentPane((PanelScreen)room.screen());
		if (backColor != null) setBackground(new Color(backColor));
	}
	
	@Override
	public void start() {
		// Turn everything on
		room.powerOn();
		((PanelScreen)room.screen()).requestFocus();
		
		SwingUtilities.invokeLater(new Runnable() { @Override public void run() {
			// Start connection to P1 Server
			boolean success = askUserForConnection(room.clientCurrentConsole().remoteReceiver(), Parameters.mainArg);
			if (!success) Terminator.terminate();
		}});
	}
	
	@Override
	public void stop() {
		// Turn everything off
		room.powerOff();
		
		// Disconnect from P1 Server
		try {
			room.clientCurrentConsole().remoteReceiver().disconnect();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Error disconnecting from Server:\n" + ex, "javatari P2 Client", JOptionPane.ERROR_MESSAGE);
		}
	}

	@Override
	public void destroy() {
		// Destroy the Room
		room.destroy();
	}
	
	private static boolean askUserForConnection(RemoteReceiver remoteReceiver, String defaultServer) {
		String server = defaultServer;
 		while(true) {
			// Try connecting to server
 			if (server != null && !server.isEmpty()) {
 				try {
 					remoteReceiver.connect(server);
 					return true;
 				} catch(Exception ex) {
 					JOptionPane.showMessageDialog(null, "Unnable to connect to: " + server + "\n" + ex, "Atari Player 2 Client", JOptionPane.ERROR_MESSAGE);
 				}
 			}
			// If unsuccessful, ask for another address
	 		do {
				server = (String) JOptionPane.showInputDialog(
					null, "Atari Player 1 Server address[:port]:", "Atari Player 2 Client",
					JOptionPane.PLAIN_MESSAGE, null, null,
					server
				);
		 		if (server == null) return false;	// User chose cancel
		 		server = server.trim();
	 		} while(server.isEmpty());
 		}
	}

	private Room room;
	
	private static final long serialVersionUID = 1L;

}
