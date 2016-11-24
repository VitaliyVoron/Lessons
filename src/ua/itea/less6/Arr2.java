package ua.itea.less6;



public class Arr2 {

	public static void main(String[] args) {
		/*int[][] a = new int[3][3];
		System.out.println(a[2][0]);
		System.out.println(a);
		System.out.println(Arrays.toString(a[1]));*/
		
		/*int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print((b[i][j]));
			}
			System.out.println();
		}*/
		
		/*int[][] a = new int[4][];
		a[0] = new int[3];
		int[] c ={6,5,4};
		a[1] = c;
		System.out.println(Arrays.deepToString(a));*/
		
		/*int[][] arr = new int[(int)(Math.random()*10)][(int)(Math.random()*10)];
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				arr[i][j] = (int)(Math.random()*100);
			}
		}
		System.out.println(Arrays.deepToString(arr));*/
		
		/*String[][] data = {{"Oksana","Kiev","24"},{"Emma","Bucha","20"},{"Max","Irpen","24"}};
		Scanner in = new Scanner(System.in);
		System.out.println("Enter query:");
		String str = in.nextLine();
		boolean check = false;
		for(int i = 0; i<data.length;i++){
			for(int j = 0; j<data[i].length;j++){
				if(data[i][j].contains((str))){
					System.out.println(Arrays.toString(data[i]));
					check=true;
					break;
				}
			}
		}
		if(!check)System.out.println("No result!");*/
		
		//Forrmating
		//System.out.printf("%-10d %-10d %-10d %-20s %5.2f",5,10,20,"Hello",20.4);
		
		/*System.out.printf("%c %10s %10s %20s",'#',"Currency", "Rate", "Description\n");
		System.out.printf("%12s %10s %20s","--------", "----", "-----------\n");
		System.out.printf("%d %5s %15.2f %14s",1,"USA", 24.5, "Blala\n");
		System.out.printf("%d %4s %16.2f %14s",2,"EU", 27.3, "Blala\n");
		System.out.printf("%d %5s %15.2f %13s",3,"RUR", 150.0, "Blala");*/
		
		//System.out.printf("%2$s %1$s", "Hello","hi");
		
		//Date date = new Date();
		//System.out.printf(" Сегодня %1$td %1$tB %1$tY год, %1$tA %1$tH час %1$tM минут %1$tS секунд", date);
	}

}
