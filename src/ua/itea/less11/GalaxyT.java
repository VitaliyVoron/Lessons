package ua.itea.less11;

public class GalaxyT extends TabletPC {

	String gPS;
	

	public GalaxyT(String mark, String model, int diag, int cpu, String gPS) {
		super(mark, model, diag, cpu);
		this.gPS = gPS;
		getInfo();
	}

	/*GalaxyT() {
		mark = "Samsung" ;
		model = "Galaxy";
		diag = 5;
		cpu = 8;
		GPS = "Yes";
		getInfo();
	}*/

	@Override
	void getInfo() {
		super.getInfo();
		System.out.print("; GPS: " + gPS);
	}

}
