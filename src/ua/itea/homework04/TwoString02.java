package ua.itea.homework04;

public class TwoString02 {
	public static void main(String[] args) {
		// в какой строке больше слов
		String str1 = "Теперь воспользовавшись предыдущим советом вы можете иметь";
		int numWordsStr1 = 0;
		int numAstr1 = 0;
		int consonantsStr1 = 0;
		String str2 = "Если у вас класс с приличным количеством кода и вы хотите видеть два разных фрагмента кода из одного класса";
		int consonantsStr2 = 0;
		int numWordsStr2 = 0;
		int numAstr2 = 0;
		String consonants = "бвгджзйклмнпрстфхцчшщ";

		for (int i = 0; i < str1.length(); i++) {
			char temp = str1.toLowerCase().charAt(i);
			if (temp == ' ') {
				numWordsStr1++;
			} else if (temp == 'а') {
				numAstr1++;
			}
			for (int j = 0; j < consonants.length(); j++) {
				if (temp == consonants.charAt(j)) {
					consonantsStr1++;
				}
			}
		}
		for (int i = 0; i < str2.length(); i++) {
			char temp = str2.toLowerCase().charAt(i);
			if (temp == ' ') {
				numWordsStr2++;
			} else if (temp == 'а') {
				numAstr2++;
			}
			for (int j = 0; j < consonants.length(); j++) {
				if (temp == consonants.charAt(j)) {
					consonantsStr2++;
				}
			}
		}
		// определить какая cтрока длиннее
		System.out.println(str1.length() > str2.length() ? "str1 - longer" : "str2 - longer");
		System.out.println(numWordsStr1 > numWordsStr2 ? "str1 has more words" : "str2 has more words");
		System.out.println(numAstr1 > numAstr2 ? "str1 has more 'a'" : "str2 has more 'a'");
		System.out.println(consonantsStr1 > consonantsStr2 ? "str1 has more consonants" : "str2 has more consonants");
	}
}
