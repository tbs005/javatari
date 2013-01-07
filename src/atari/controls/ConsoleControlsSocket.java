// Copyright 2011-2012 Paulo Augusto Peccin. See licence.txt distributed with this file.

package atari.controls;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import atari.controls.ConsoleControls.Control;

public class ConsoleControlsSocket implements ConsoleControlsInput {

	@Override
	public void controlStateChanged(Control control, boolean state) {
		for (ConsoleControlsInput input : forwardedInputs)
			input.controlStateChanged(control, state);
	}

	@Override
	public void controlStateChanged(ConsoleControls.Control control, int position) {
		for (ConsoleControlsInput input : forwardedInputs)
			input.controlStateChanged(control, position);
	}

	@Override
	public void controlsStateReport(Map<Control, Boolean> report) {
		for (ConsoleControlsInput input : forwardedInputs)
			input.controlsStateReport(report);
	}

	public void addForwardedInput(ConsoleControlsInput input) {
		forwardedInputs = new ArrayList<ConsoleControlsInput>(forwardedInputs);	// To prevent comodification
		forwardedInputs.add(input);
	}
	
	public void removeForwardedInput(ConsoleControlsInput input) {
		forwardedInputs = new ArrayList<ConsoleControlsInput>(forwardedInputs);	// To prevent comodification
		forwardedInputs.remove(input);
	}
	public void addRedefinitionListener(ConsoleControlsRedefinitionListener listener) {
		redefinitonListener.add(listener);
	}
	
	public void controlsStatesRedefined() {
		for (ConsoleControlsRedefinitionListener listener : redefinitonListener)
			listener.controlsStatesRedefined();
	}
	
	
	private List<ConsoleControlsInput> forwardedInputs = new ArrayList<ConsoleControlsInput>();
	private List<ConsoleControlsRedefinitionListener> redefinitonListener = new ArrayList<ConsoleControlsRedefinitionListener>();

}
