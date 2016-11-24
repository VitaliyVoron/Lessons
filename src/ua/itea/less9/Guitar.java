package ua.itea.less9;

public class Guitar {
	
	String sound;

	Guitar(String sound, String mode) {
		this.sound = sound;
		new Combi(mode);
		getSound();
	}
	
	void getSound(){
		System.out.println(sound);
	}
	
	class Combi{
		String mode;
		Combi(String mode){
			this.mode=mode;
			setSound();
		}
		
		void setSound(){
			switch(mode){
			case "overdrive":
				sound=sound.toUpperCase();
				break;
			case "swing":
				StringBuilder sb = new StringBuilder(sound.length());
				for(int i=0;i<sound.length();i++){
					if(i%2==0) sb.append(sound.toUpperCase().charAt(i));
					else sb.append(sound.charAt(i));
				}
				sound=sb.toString();
			}
		}
	}
	
	
}
