package ua.itea.less7;

public class CatBox {
	int width;
	int height;
	int depth;
	
	void setDimensions(){
		width=10;
		height=10;
		depth=10;
	}
	
	void getInfo(){
		System.out.println("Width: "+width);
		System.out.println("Height: "+height);
		System.out.println("Depth: "+depth);
	}

}
