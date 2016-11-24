package ua.itea.less9;

public class Array {
	public static void main(String[] args) {
		new Array().array(new int[]{1,2,5,7,8,6,4,8}); //анонимный массив 
	}
	
	void array(int...arr){
		int n = 1;
		for(int i : arr){
			System.out.println(n+" = "+i);
		n++;
		}
	}
	
	

}
