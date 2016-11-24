package ua.itea.less8;

public class PowerSupply {

	boolean state;
	int inputV;
	int outPutV1;
	int outPutV2;

	public void setOn(int v) {
		setInputV(v);
	}

	public void setOFF() {
		state = false;
		outPutV1 = 0;
		outPutV2 = 0;
	}

	public void setInputV(int inputV) {
		this.inputV=inputV;
		if (inputV >= 200 && inputV <= 250) {
			outPutV1 = 5;
			outPutV2 = 12;
			state = true;
		} else {
			setOFF();
		}
	}

	void getInfo() {
		System.out.println("State -" + (state ? "ON" : "OFF") + "; InputV: " + inputV + "; outputV1: " + outPutV1
				+ "; outputV2: " + outPutV2);
	}

}
