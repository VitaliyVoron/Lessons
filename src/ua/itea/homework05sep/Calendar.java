package ua.itea.homework05sep;

import java.util.Arrays;

public class Calendar {

	public static void main(String[] args) {
		int[] arr = new int[12];
		int days = 30;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i != 0 ? (i <= arr.length / 2 ? (i == 1 ? days - 1 : (i % 2 != 0 ? days : days + 1))
					: (i % 2 != 0 ? days + 1 : days)) : days + 1;
		}
		System.out.println(Arrays.toString(arr));
	}

}
