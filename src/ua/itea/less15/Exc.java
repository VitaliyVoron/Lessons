package ua.itea.less15;

public class Exc {

	public static void main(String[] args) {
		int a = 5;
		// int b = 0;
		int[] i = new int[0];
		try{
		System.out.println(a/i[1]);
		} catch (Exception e){
			System.out.println("Arithmetic");
			System.out.println(e.getMessage());
		} finally{
			System.out.println("blala");
		}
		//Integer.
	}

}
