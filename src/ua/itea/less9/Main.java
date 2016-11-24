package ua.itea.less9;

public class Main {

	public static void main(String[] args) {
		//new Car("Shkoda","Blala", 1.6, "Black");
		//new SmartPhone();
		//new SmartPhone(2.4,"Blala", 6, 32);
		
		Eurasia eu = new Eurasia(){
			void getInfo(){
				for(String s:eurasia){
					if(s.equals("Russia")){
						continue;
						}
					System.out.println(s);
				}
			}
		};
		eu.getInfo();
		
	}

}
