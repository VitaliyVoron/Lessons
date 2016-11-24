package ua.itea.less9;

public class Outer {
	
	public static String oPub = "oPub";
	private String oPri="oPri";
	
	Outer(){
		System.out.println("Outer");
		System.out.println(new Inner().iPri);
		System.out.println(Nested.nPub);
	}
	
	class Inner{
		public String iPub = "iPub";
		private String iPri="iPri";
		Inner(){
			System.out.println(oPri);
			System.out.println("Inner");
		}
	}
	
	static class Nested{
		public static String nPub = "nPub";
		private String nPri="nPri";
		Nested(){
			System.out.println(nPri);
			System.out.println("Inner");
		}
	}

}
