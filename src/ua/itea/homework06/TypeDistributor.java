package ua.itea.homework06;

import java.util.Arrays;

/*—оздать массив байт, шорт и инт по 5 элементов каждый. 
*¬ начале цыкла генерируетьс€ рандомное число в положительном диапозоне инт.
*≈сли число шорт тогда попадает в массив типа шорт, если инт в масс инт и если байт то в массив байт. 
*¬ывести количество итераций.
*/
public class TypeDistributor {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long timeSpent = 0;
		int arraysLength = 5;
		byte[] byteArr = new byte[arraysLength];
		short[] shortArr = new short[arraysLength];
		int[] intArr = new int[arraysLength];
		byte byteMaxValue = 127;
		short shortMaxValue = 32767;
		int intMaxValue = 2147483647;
		boolean isFullByteArr = false;
		boolean isFullShortArr = false;
		boolean isFullIntArr = false;
		int count = 0;
		while (!isFullIntArr || !isFullShortArr || !isFullByteArr) {
			int randNum = (int) (Math.random() * intMaxValue);
			if (randNum > shortMaxValue && !isFullIntArr) {
				for (int i = 0; i < intArr.length; i++) {
					if (intArr[i] != 0 && i != intArr.length-1) {
						continue;
					} else if (intArr[intArr.length - 1] != 0) {
						isFullIntArr = true;
						System.out.println("Int count = "+count);
						System.out.println(Arrays.toString(intArr)); 
						break;
					} else {
						intArr[i] = randNum;
						break;
					}
				}
			} else if (randNum > byteMaxValue && randNum <= shortMaxValue && !isFullShortArr) {
				for (int i = 0; i < shortArr.length; i++) {
					if (shortArr[i] != 0 && i != shortArr.length-1) {
						continue;
					} else if (shortArr[shortArr.length - 1] != 0) {
						isFullShortArr = true;
						System.out.println("Short count = "+count);
						System.out.println(Arrays.toString(shortArr));
						break;
					} else {
						shortArr[i] = (short) randNum;
						break;
					}
				}
			} else if(randNum <= byteMaxValue && !isFullByteArr) {
				for (int i = 0; i < byteArr.length; i++) {
					if (byteArr[i] != 0 && i != byteArr.length-1) {
						continue;
					} else if (byteArr[byteArr.length - 1] != 0) {
						isFullByteArr = true;
						System.out.println("Byte count = "+count);
						break;
					} else {
						byteArr[i] = (byte) randNum;
						break;
					}
				}
			}
			count++;
		}
		timeSpent = System.currentTimeMillis() - startTime;
		System.out.println(Arrays.toString(byteArr));
		System.out.println("программа выполн€лась " + timeSpent);
	}
	
	

}
