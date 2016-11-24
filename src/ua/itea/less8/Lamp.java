package ua.itea.less8;

public class Lamp {

	boolean state;
	boolean dim;
	int brightness;

	void setON() {
		state = true;
		brightness = 100;
	}

	void setOFF() {
		state = false;
		setDimOFF();
	}

	void setDimON() {
		if (state) {
			dim = true;
			setBrightness(20);
		}
	}

	void setDimOFF() {
		dim = false;
	}

	void setBrightness(int brightness) {
		if (state && brightness > 0 && brightness <= 100) {
			this.brightness = brightness;
		}
	}

	String getInfo() {
		String str = "State " + (state ? "ON" : "OFF") + "; Brightness " + brightness + ": Dim " + (dim ? "ON" : "OFF");
		return str;
	}
}
