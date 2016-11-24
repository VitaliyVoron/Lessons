package ua.itea.less7;

public class Timer {

	public static void main(String[] args) throws InterruptedException {
		int allSec = 28800;
		while(allSec > 0){
			System.out.println(allSec/3600+" "+allSec% 3600+" "+allSec%60%60);
			Thread.sleep(1000);
			allSec--;
		}
	}
}
