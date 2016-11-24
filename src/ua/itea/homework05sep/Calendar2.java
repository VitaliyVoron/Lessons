package ua.itea.homework05sep;

import java.util.Arrays;

public class Calendar2 {

	public static void main(String[] args) {
		int[] arr = new int[12];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 28 + ((i + 1) + ((i + 1) / 8)) % 2 + 2 % (i + 1) + 1 / (i + 1);
		}
		System.out.println(Arrays.toString(arr));
	}

}
