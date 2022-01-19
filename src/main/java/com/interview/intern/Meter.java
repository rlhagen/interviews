package com.interview.intern;

/**
 * We need to make this more manageable!!! Lot's of regressions every time we add a new meter.  Please help!
 */
public class Meter {
	private Type type;

	public enum Type {
		ANSI,
		GE,
		IEC
	}

	public Meter(Type type) {
		this.type = type;
	}

	public boolean supportsOnDemand() {
		if (type.equals(Type.ANSI)) {
			return true;
		} else if (type.equals(Type.GE)) {
			return true;
		} else if (type.equals(Type.IEC)) {
			return false;
		}

		return false;
	}

	public void process(byte[] payload) {
		if (type.equals(Type.ANSI)) {
			//100 lines of code
		} else if (type.equals(Type.GE)) {
			//100 lines of code
		} else if (type.equals(Type.IEC)) {
			//100 lines of code
		}
	}

	// 1000s of lines of code removed here...

}
