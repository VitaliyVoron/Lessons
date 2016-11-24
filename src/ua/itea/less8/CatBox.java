package ua.itea.less8;

public class CatBox {
	
	int width = 5;
	
	
	
	void setWidth(int w) {
		this.width = w;
	}

	void getWidth(){
		System.out.println("Width: "+width);
	}

	public static void main(String[] args) {
		CatBox box = new CatBox();
		int w = 10;
		box.setWidth(w);
		box.getWidth();
	}

}
