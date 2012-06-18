package pc.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class HelpDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUp;
	private JTextField txtRight;
	private JTextField txtLeft;
	private JTextField txtDown;
	private JTextField txtSpace;
	private JTextField txtIns;
	private JTextField txtT;
	private JTextField txtH;
	private JTextField txtF;
	private JTextField txtG;
	private JTextField txtA;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			HelpDialog dialog = new HelpDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setLocationRelativeTo(null);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public HelpDialog() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(HelpDialog.class.getResource("/pc/screen/images/Favicon.png")));
		setAlwaysOnTop(true);
		setTitle("javatari");
		setResizable(false);
		setSize(491, 324);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 13));
			tabbedPane.setBackground(UIManager.getColor("TabbedPane.background"));
			contentPanel.add(tabbedPane, BorderLayout.CENTER);
			{
				JPanel panel = new JPanel();
				panel.setBackground(UIManager.getColor("Panel.background"));
				tabbedPane.addTab("About", null, panel, null);
				panel.setLayout(null);
				{
					JLabel lblNewButton = new JLabel("");
					lblNewButton.setBounds(19, 19, 162, 158);
					panel.add(lblNewButton);
					lblNewButton.setIcon(new ImageIcon(HelpDialog.class.getResource("/pc/screen/images/LogoAbout.png")));
					lblNewButton.setPreferredSize(new Dimension(200, 250));
					lblNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				}
				
				JLabel lblVerion = new JLabel("version 1.10");
				lblVerion.setHorizontalAlignment(SwingConstants.CENTER);
				lblVerion.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblVerion.setBounds(58, 183, 85, 14);
				panel.add(lblVerion);
				
				JLabel lblCreate = new JLabel("Paulo Augusto Peccin");
				lblCreate.setHorizontalAlignment(SwingConstants.CENTER);
				lblCreate.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblCreate.setBounds(254, 52, 137, 21);
				panel.add(lblCreate);
				
				JLabel lblCreated = new JLabel("created by");
				lblCreated.setHorizontalAlignment(SwingConstants.CENTER);
				lblCreated.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblCreated.setBounds(254, 29, 137, 21);
				panel.add(lblCreated);
				{
					JLabel lblOfficialHomepage = new JLabel("official homepage:");
					lblOfficialHomepage.setHorizontalAlignment(SwingConstants.CENTER);
					lblOfficialHomepage.setFont(new Font("Tahoma", Font.PLAIN, 13));
					lblOfficialHomepage.setBounds(254, 115, 137, 21);
					panel.add(lblOfficialHomepage);
				}
				{
					JLabel lblHttpjavatariotg = new JLabel("http://javatari.org");
					lblHttpjavatariotg.setHorizontalAlignment(SwingConstants.CENTER);
					lblHttpjavatariotg.setForeground(Color.BLUE);
					lblHttpjavatariotg.setFont(new Font("Tahoma", Font.PLAIN, 14));
					lblHttpjavatariotg.setBounds(254, 139, 137, 21);
					panel.add(lblHttpjavatariotg);
				}
				{
					JLabel lblppeccin = new JLabel("@ppeccin");
					lblppeccin.setHorizontalAlignment(SwingConstants.CENTER);
					lblppeccin.setFont(new Font("Tahoma", Font.PLAIN, 13));
					lblppeccin.setBounds(254, 74, 137, 14);
					panel.add(lblppeccin);
				}
			}
			{
				JPanel panel = new JPanel();
				tabbedPane.addTab("Controls", null, panel, null);
				panel.setLayout(null);
				{
					JLabel lblNewLabel = new JLabel("");
					lblNewLabel.setIcon(new ImageIcon(HelpDialog.class.getResource("/pc/screen/images/Joystick.png")));
					lblNewLabel.setBounds(73, 77, 50, 60);
					panel.add(lblNewLabel);
				}
				
				txtUp = new JTextField();
				txtUp.setBorder(new LineBorder(Color.LIGHT_GRAY));
				txtUp.setFont(new Font("Tahoma", Font.PLAIN, 11));
				txtUp.setHorizontalAlignment(SwingConstants.CENTER);
				txtUp.setText("UP");
				txtUp.setBounds(78, 55, 40, 20);
				panel.add(txtUp);
				txtUp.setColumns(10);
				
				txtRight = new JTextField();
				txtRight.setBorder(new LineBorder(Color.LIGHT_GRAY));
				txtRight.setFont(new Font("Tahoma", Font.PLAIN, 11));
				txtRight.setText("RIGHT");
				txtRight.setHorizontalAlignment(SwingConstants.CENTER);
				txtRight.setColumns(10);
				txtRight.setBounds(127, 101, 40, 20);
				panel.add(txtRight);
				
				txtLeft = new JTextField();
				txtLeft.setBorder(new LineBorder(Color.LIGHT_GRAY));
				txtLeft.setFont(new Font("Tahoma", Font.PLAIN, 11));
				txtLeft.setText("LEFT");
				txtLeft.setHorizontalAlignment(SwingConstants.CENTER);
				txtLeft.setColumns(10);
				txtLeft.setBounds(29, 101, 40, 20);
				panel.add(txtLeft);
				
				txtDown = new JTextField();
				txtDown.setBorder(new LineBorder(Color.LIGHT_GRAY));
				txtDown.setFont(new Font("Tahoma", Font.PLAIN, 11));
				txtDown.setText("DOWN");
				txtDown.setHorizontalAlignment(SwingConstants.CENTER);
				txtDown.setColumns(10);
				txtDown.setBounds(78, 141, 40, 20);
				panel.add(txtDown);
				
				JLabel lblRight = new JLabel("Right");
				lblRight.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblRight.setHorizontalAlignment(SwingConstants.CENTER);
				lblRight.setBounds(128, 85, 38, 14);
				panel.add(lblRight);
				
				JLabel lblLeft = new JLabel("Left");
				lblLeft.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblLeft.setHorizontalAlignment(SwingConstants.CENTER);
				lblLeft.setBounds(31, 85, 36, 14);
				panel.add(lblLeft);
				
				JLabel lblDown = new JLabel("Down");
				lblDown.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblDown.setHorizontalAlignment(SwingConstants.CENTER);
				lblDown.setBounds(79, 163, 38, 14);
				panel.add(lblDown);
				
				JLabel lblUp = new JLabel("Up");
				lblUp.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblUp.setHorizontalAlignment(SwingConstants.CENTER);
				lblUp.setBounds(79, 39, 38, 14);
				panel.add(lblUp);
				
				txtSpace = new JTextField();
				txtSpace.setBorder(new LineBorder(Color.LIGHT_GRAY));
				txtSpace.setFont(new Font("Tahoma", Font.PLAIN, 11));
				txtSpace.setText("SPC");
				txtSpace.setHorizontalAlignment(SwingConstants.CENTER);
				txtSpace.setColumns(10);
				txtSpace.setBounds(29, 55, 40, 20);
				panel.add(txtSpace);
				
				JLabel lblFire = new JLabel("Fire 1");
				lblFire.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblFire.setHorizontalAlignment(SwingConstants.CENTER);
				lblFire.setBounds(30, 39, 38, 14);
				panel.add(lblFire);
				
				JLabel lblPlayer = new JLabel("Player 1");
				lblPlayer.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);
				lblPlayer.setBounds(61, 14, 74, 20);
				panel.add(lblPlayer);
				
				JLabel lblFire_1 = new JLabel("Fire 2");
				lblFire_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblFire_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblFire_1.setBounds(128, 39, 38, 14);
				panel.add(lblFire_1);
				
				txtIns = new JTextField();
				txtIns.setBorder(new LineBorder(Color.LIGHT_GRAY));
				txtIns.setFont(new Font("Tahoma", Font.PLAIN, 11));
				txtIns.setText("INS");
				txtIns.setHorizontalAlignment(SwingConstants.CENTER);
				txtIns.setColumns(10);
				txtIns.setBounds(127, 55, 40, 20);
				panel.add(txtIns);
				
				JTextPane txtpnAltJ_1 = new JTextPane();
				txtpnAltJ_1.setEditable(false);
				txtpnAltJ_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
				txtpnAltJ_1.setText("ALT + J : Swap P1<>P2\r\n\r\nALT + L : Toggle Paddles");
				txtpnAltJ_1.setOpaque(false);
				txtpnAltJ_1.setBounds(162, 160, 145, 48);
				panel.add(txtpnAltJ_1);
				
				JLabel label = new JLabel("");
				label.setIcon(new ImageIcon(HelpDialog.class.getResource("/pc/screen/images/Joystick.png")));
				label.setBounds(345, 77, 50, 60);
				panel.add(label);
				
				txtT = new JTextField();
				txtT.setBorder(new LineBorder(Color.LIGHT_GRAY));
				txtT.setFont(new Font("Tahoma", Font.PLAIN, 11));
				txtT.setText("T");
				txtT.setHorizontalAlignment(SwingConstants.CENTER);
				txtT.setColumns(10);
				txtT.setBounds(350, 55, 40, 20);
				panel.add(txtT);
				
				txtH = new JTextField();
				txtH.setBorder(new LineBorder(Color.LIGHT_GRAY));
				txtH.setFont(new Font("Tahoma", Font.PLAIN, 11));
				txtH.setText("H");
				txtH.setHorizontalAlignment(SwingConstants.CENTER);
				txtH.setColumns(10);
				txtH.setBounds(399, 101, 40, 20);
				panel.add(txtH);
				
				txtF = new JTextField();
				txtF.setBorder(new LineBorder(Color.LIGHT_GRAY));
				txtF.setFont(new Font("Tahoma", Font.PLAIN, 11));
				txtF.setText("F");
				txtF.setHorizontalAlignment(SwingConstants.CENTER);
				txtF.setColumns(10);
				txtF.setBounds(301, 101, 40, 20);
				panel.add(txtF);
				
				txtG = new JTextField();
				txtG.setBorder(new LineBorder(Color.LIGHT_GRAY));
				txtG.setFont(new Font("Tahoma", Font.PLAIN, 11));
				txtG.setText("G");
				txtG.setHorizontalAlignment(SwingConstants.CENTER);
				txtG.setColumns(10);
				txtG.setBounds(350, 141, 40, 20);
				panel.add(txtG);
				
				JLabel label_1 = new JLabel("Right");
				label_1.setHorizontalAlignment(SwingConstants.CENTER);
				label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
				label_1.setBounds(400, 85, 38, 14);
				panel.add(label_1);
				
				JLabel label_2 = new JLabel("Left");
				label_2.setHorizontalAlignment(SwingConstants.CENTER);
				label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
				label_2.setBounds(303, 85, 36, 14);
				panel.add(label_2);
				
				JLabel label_3 = new JLabel("Down");
				label_3.setHorizontalAlignment(SwingConstants.CENTER);
				label_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
				label_3.setBounds(351, 163, 38, 14);
				panel.add(label_3);
				
				JLabel label_4 = new JLabel("Up");
				label_4.setHorizontalAlignment(SwingConstants.CENTER);
				label_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
				label_4.setBounds(351, 39, 38, 14);
				panel.add(label_4);
				
				txtA = new JTextField();
				txtA.setBorder(new LineBorder(Color.LIGHT_GRAY));
				txtA.setFont(new Font("Tahoma", Font.PLAIN, 11));
				txtA.setText("A");
				txtA.setHorizontalAlignment(SwingConstants.CENTER);
				txtA.setColumns(10);
				txtA.setBounds(301, 55, 40, 20);
				panel.add(txtA);
				
				JLabel label_5 = new JLabel("Fire 1");
				label_5.setHorizontalAlignment(SwingConstants.CENTER);
				label_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
				label_5.setBounds(302, 39, 38, 14);
				panel.add(label_5);
				
				JLabel lblPlayer_1 = new JLabel("Player 2");
				lblPlayer_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblPlayer_1.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblPlayer_1.setBounds(333, 14, 74, 20);
				panel.add(lblPlayer_1);
				
				JLabel label_7 = new JLabel("Fire 2");
				label_7.setHorizontalAlignment(SwingConstants.CENTER);
				label_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
				label_7.setBounds(400, 39, 38, 14);
				panel.add(label_7);
				
				textField_5 = new JTextField();
				textField_5.setBorder(new LineBorder(Color.LIGHT_GRAY));
				textField_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
				textField_5.setHorizontalAlignment(SwingConstants.CENTER);
				textField_5.setColumns(10);
				textField_5.setBounds(399, 55, 40, 20);
				panel.add(textField_5);
			}
			
			JPanel panel = new JPanel();
			tabbedPane.addTab("Advanced", null, panel, null);
			panel.setLayout(null);
			
			JTextPane txtpnAltJ = new JTextPane();
			txtpnAltJ.setEditable(false);
			txtpnAltJ.setFont(new Font("Tahoma", Font.PLAIN, 12));
			txtpnAltJ.setBounds(18, 10, 78, 203);
			panel.add(txtpnAltJ);
			txtpnAltJ.setOpaque(false);
			txtpnAltJ.setText("CTR + 1-0 :\r\nALT + 1-0 :\r\n\r\nALT + ENT :\r\nALT + V :\r\nALT + R :\r\nALT + Q :\r\n\r\nALT + D :\r\nALT + C :\r\nALT + P :\r\nALT + F :\r\nTAB :");
			
			JTextPane txtpnFullscreenNtsc = new JTextPane();
			txtpnFullscreenNtsc.setEditable(false);
			txtpnFullscreenNtsc.setText("Save State\r\nLoad State\r\n\r\nFullscreen\r\nNTSC / PAL\r\nCRT Modes\r\nFilter\r\n\r\nDebug Modes\r\nCollisions\r\nPause\r\nNext Frame\r\nFast Speed");
			txtpnFullscreenNtsc.setOpaque(false);
			txtpnFullscreenNtsc.setFont(new Font("Tahoma", Font.PLAIN, 12));
			txtpnFullscreenNtsc.setBounds(95, 10, 82, 203);
			panel.add(txtpnFullscreenNtsc);
			
			JTextPane txtpnAltF = new JTextPane();
			txtpnAltF.setEditable(false);
			txtpnAltF.setText("ALT + F1 :\r\n\r\nALT + F5 :\r\nALT + F6 :\r\nF7 :\r\n");
			txtpnAltF.setOpaque(false);
			txtpnAltF.setFont(new Font("Tahoma", Font.PLAIN, 12));
			txtpnAltF.setBounds(218, 10, 71, 81);
			panel.add(txtpnAltF);
			
			JTextPane txtpnFryConsoleLoad = new JTextPane();
			txtpnFryConsoleLoad.setEditable(false);
			txtpnFryConsoleLoad.setText("Fry Console\r\n\r\nLoad Cartridge\r\nwith no Power Cycle\r\nRemove Cartridge");
			txtpnFryConsoleLoad.setOpaque(false);
			txtpnFryConsoleLoad.setFont(new Font("Tahoma", Font.PLAIN, 12));
			txtpnFryConsoleLoad.setBounds(287, 10, 127, 81);
			panel.add(txtpnFryConsoleLoad);
			
			JTextPane txtpnCtraltArrows = new JTextPane();
			txtpnCtraltArrows.setEditable(false);
			txtpnCtraltArrows.setText("CTR-ALT + Arrows :\r\nCTR-SHT + Arrows :\r\nALT-SHT + Arrows :\r\n\r\nBACKSPACE :\r\n");
			txtpnCtraltArrows.setOpaque(false);
			txtpnCtraltArrows.setFont(new Font("Tahoma", Font.PLAIN, 12));
			txtpnCtraltArrows.setBounds(218, 130, 121, 81);
			panel.add(txtpnCtraltArrows);
			
			JTextPane txtpnAlsoPossibleDo = new JTextPane();
			txtpnAlsoPossibleDo.setEditable(false);
			txtpnAlsoPossibleDo.setText("Drag/Drop or Copy/Paste of files and URLs");
			txtpnAlsoPossibleDo.setOpaque(false);
			txtpnAlsoPossibleDo.setFont(new Font("Tahoma", Font.PLAIN, 12));
			txtpnAlsoPossibleDo.setBounds(218, 100, 240, 21);
			panel.add(txtpnAlsoPossibleDo);
			
			JTextPane txtpnDisplayOriginDisplay = new JTextPane();
			txtpnDisplayOriginDisplay.setEditable(false);
			txtpnDisplayOriginDisplay.setText("Display Origin\r\nDisplay Size\r\nDisplay Scale\r\n\r\nDefault Display");
			txtpnDisplayOriginDisplay.setOpaque(false);
			txtpnDisplayOriginDisplay.setFont(new Font("Tahoma", Font.PLAIN, 12));
			txtpnDisplayOriginDisplay.setBounds(343, 130, 100, 81);
			panel.add(txtpnDisplayOriginDisplay);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("  OK  ");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	
	private static final long serialVersionUID = 1L;

}
