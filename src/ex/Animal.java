package ex;

public abstract class Animal {
	String name;
	Animal(){
		System.out.println("Animal constructor");
	}
	abstract void getVoice();
	
	void getName(){
		System.out.println(name);
	}
}
