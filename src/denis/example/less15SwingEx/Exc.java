package denis.example.less15SwingEx;

public class Exc {
	void div(int a, int b) throws MyEx{
		if(b==0){
			MyEx myEx=new MyEx();
			throw myEx;
		}else System.out.println(a/b);
	}
	public static void main(String[] args) {
	/*	int a=5;
		int b=0;
		try{
		System.out.println(a/b);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Oops...");
			System.out.println(e.getMessage());
		}finally{
			System.out.println("adada");
		}*/
		Exc exc=new Exc();
		try {
			exc.div(5, 0);
		} catch (MyEx e) {
			System.out.println(e.getMessage());
		}
	}

}
