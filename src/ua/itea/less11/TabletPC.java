package ua.itea.less11;

public class TabletPC {
	
	String mark;
	String model;
	int diag;
	int cpu;
	
	
	
	public TabletPC(String mark, String model, int diag, int cpu) {
		this.mark = mark;
		this.model = model;
		this.diag = diag;
		this.cpu = cpu;
	}



	void getInfo(){
		System.out.print("Mark: "+mark+"; Model: "+model+"; Diag: "+diag+"; CPU: "+cpu);
	}

}
