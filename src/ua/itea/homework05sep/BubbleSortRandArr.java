package ua.itea.homework05sep;

import java.util.Arrays;

public class BubbleSortRandArr {
	public static void main(String[] args) {
		int max = 12;
		int min = 7;
		int[] arr = new int[min+(int)(Math.random()*((max-min)+1))];
		//int[] arr = new int[(int) (Math.random() * 6 + 7)];
		System.out.println("Array length = " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		System.out.println("Array - " + Arrays.toString(arr));
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
		}
		System.out.println("Sort array - " + Arrays.toString(arr));
	}

}
