package l05sep;

public class Notebook {
	private Software soft;
	void addSoft(Software soft){
		this.soft=soft;
	}
	
	String getSoftName(){
		return soft.getName();
	}
	
}
