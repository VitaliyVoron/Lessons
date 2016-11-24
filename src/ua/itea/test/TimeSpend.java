package ua.itea.test;

import java.util.Arrays;

public class TimeSpend {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long timeSpent = 0;
		int[] arr = new int[1000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*100);
		}
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length - 1; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					arr[j] += arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] -= arr[j + 1];
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
			timeSpent = System.currentTimeMillis() - startTime;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("программа выполнялась " + timeSpent);
	}

}
