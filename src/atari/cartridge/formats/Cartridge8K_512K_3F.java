// Copyright 2011-2012 Paulo Augusto Peccin. See licence.txt distributed with this file.

package atari.cartridge.formats;

import atari.cartridge.Cartridge;
import atari.cartridge.CartridgeFormat;
import atari.cartridge.CartridgeFormatOption;

/**
 * Implements the 8K-512K "Enhanced 3F" Tigervision format
 */
public class Cartridge8K_512K_3F extends CartridgeBankedByBusMonitoring {

	protected Cartridge8K_512K_3F(byte[] content, String contentName, CartridgeFormat format) {
		super(content, contentName, format);
		selectableSliceMaxBank = (content.length - BANK_SIZE) / BANK_SIZE - 1;
		fixedSliceAddressOffset = content.length - BANK_SIZE * 2;
	}

	@Override
	public byte readByte(int address) {		
		maskAddress(address);
		if (maskedAddress >= FIXED_SLICE_START_ADDRESS)			// Fixed slice
			return bytes[fixedSliceAddressOffset + maskedAddress];	
		else
			return bytes[bankAddressOffset + maskedAddress];	// Selectable slice	
	}

	@Override
	public void monitorByteRead(int address, byte data) {
		// Nothing
	}

	@Override
	public void monitorByteWritten(int address, byte data) {
		// Perform bank switching as needed
		if (address <= 0x003f) {
			int bank = data & 0xff;		// unsigned
			if (bank <= selectableSliceMaxBank)
				bankAddressOffset = bank * BANK_SIZE;
		}
	}

	@Override
	protected void performBankSwitchOnMonitoredAccess(int address) {
		// Bank switching is done only on monitored writes
	}

	protected final int selectableSliceMaxBank; 
	protected final int fixedSliceAddressOffset;		// This slice is fixed at the last bank 


	protected static final int BANK_SIZE = 2048;
	protected static final int MIN_SIZE = 4 * BANK_SIZE;
	protected static final int MAX_SIZE = 256 * BANK_SIZE;
	protected static final int FIXED_SLICE_START_ADDRESS = 2048;

	public static final CartridgeFormat FORMAT = new CartridgeFormat("3F", "8K-512K Tigervision") {
		@Override
		public Cartridge create(byte[] content, String contentName) {
			return new Cartridge8K_512K_3F(content, contentName, this);
		}
		@Override
		public CartridgeFormatOption getOption(byte content[], String contentName) {
			if (content.length % BANK_SIZE != 0 || content.length < MIN_SIZE || content.length > MAX_SIZE) return null;
			return new CartridgeFormatOptionHinted(112, this, contentName);
		}
		private static final long serialVersionUID = 1L;
	};

	public static final long serialVersionUID = 1L;

}