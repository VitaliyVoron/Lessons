package ua.itea.homework04;

/* 1) �������� 2 ������ 
* �) +���������� ����� �������,
* �) +� ����� ������ ����
* �) +� ����� ������ ���� "a"(��������� � ������� ������������)
* �) � ����� ������ ��������� ����
*/

public class TwoStrings {

	public static void main(String[] args) {
		// � ����� ������ ������ ����
		String str1 = "������ ���������������� ���������� ������� �� ������ ����� ���������������";
		int numWordsStr1 = 0;
		int numAstr1 = 0;
		int consonantsStr1 = 0;
		String str2 = "���� � ��� ����� � ��������� ����������� ���� � �� ������ ������ ��� ������ ��������� ���� �� ������ ������";
		int consonantsStr2 = 0;
		int numWordsStr2 = 0;
		int numAstr2 = 0;
		String consonants = "���������������������";
		char symbol = '�';
		int h = 0;
		while (h < str1.length() || h < str2.length()) {
			for (int i = 0; i < consonants.length(); i++) {
				if (str1.length() > h) {
					char temp = str1.toLowerCase().charAt(h);
					if (temp == consonants.charAt(i)) {
						consonantsStr1++;
					} else if (temp == ' ') {
						numWordsStr1++;
					} else if (temp == symbol) {
						numAstr1++;
					}
				}
				if (str2.length() > h) {
					char temp = str2.toLowerCase().charAt(h);
					if (temp == consonants.charAt(i)) {
						consonantsStr2++;
					} else if (temp == ' ') {
						numWordsStr2++;
					} else if (temp == symbol) {
						numAstr2++;
					}
				}
			}
			h++;
		}
		// ���������� ����� c����� �������
		System.out.println(str1.length() > str2.length() ? "str1 - longer" : "str2 - longer");
		System.out.println(numWordsStr1 > numWordsStr2 ? "str1 has more words" : "str2 has more words");
		System.out.println(numAstr1 > numAstr2 ? "str1 has more 'a'" : "str2 has more 'a'");
		System.out.println(consonantsStr1 > consonantsStr2 ? "str1 has more consonants" : "str2 has more consonants");

	}
}
