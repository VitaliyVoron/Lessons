package ua.itea.less7;

public class Sleep  {

	public static void main(String[] args) throws InterruptedException {
		for(int i = 0; i < 5; i++){
			System.out.print("\r"+i);
			Thread.sleep(1000);
		}
	}
}
