package l05sep;

public class Car {
	String model;
	String mark;
	Owner[] owner;
	Car(String model,String mark,Owner[] owner){
		this.model=model;
		this.mark=mark;
		this.owner=owner;
	}
	void getInfo(){
		System.out.println("Mark: "+mark+"; Model: "+model);
		//owner.getName();
	}
	
}
