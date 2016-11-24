package ua.itea.less9;

public class SmartPhone {
	
	double cpu;
	String matrix;
	int ram;
	int storage;
	
	SmartPhone(){
		cpu = 1.4;
		matrix = "IPS";
		ram = 2;
		storage = 8;
		getInfo();
	}
	
	SmartPhone(double cpu,String matrix,int ram,int storage){
		this.cpu = cpu;
		this.matrix = matrix;
		this.ram = ram;
		this.storage = storage;
		getInfo();
	}
	
	void getInfo(){
		System.out.println("CPU "+cpu+" Matrix "+matrix+" RAM "+ram+" Storage "+storage);
	}

}
