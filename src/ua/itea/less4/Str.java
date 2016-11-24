package ua.itea.less4;

public class Str {
	public static void main(String[] args) {
		/*
		 * String s1 ="Hello"; String s2 ="Hello"; String s3 = new
		 * String("Hello");
		 */
		/*
		 * System.out.println(s1==s2); System.out.println(s1==s3);
		 * System.out.println(s2==s3); System.out.println(s1.equals(s3));
		 * System.out.println(s1); System.out.println(s3);
		 */

		/*
		 * String ss=" Hello, World! "; System.out.println("!".concat("!"));
		 * System.out.println("!"+ss.trim()+"!");
		 * System.out.println(ss.length()); System.out.println(ss.charAt(8));
		 * System.out.println(ss.indexOf('l'));
		 * System.out.println(ss.lastIndexOf('l'));
		 * System.out.println(ss.toUpperCase());
		 * System.out.println(ss.indexOf('l'));
		 * System.out.println(ss.substring(4,8).indexOf('l'));
		 */
		
		/*
		String url = "http://ukr.net/news/index.html";
		String protocol;
		String host;
		String path;
		protocol = url.substring(0,url.indexOf(':'));
		url = url.substring(url.indexOf("//")+2);
		host = url.substring(0,url.indexOf("/"));
		path = url.substring(host.length()+1);
		System.out.println(protocol); 
		System.out.println(host);
		System.out.println(path);*/
		 

		//make Yanukovich V.F.
		/*String fullName = "ynukovich viktor fedorovich";
		String lastName = fullName.substring(0, fullName.indexOf(" "));
		lastName ="" + lastName.substring(0,1).toUpperCase() + lastName.substring(1,lastName.length());
		String firstName = fullName.substring(fullName.indexOf(" ")+1, fullName.indexOf(" ")+2).toUpperCase();
		String otherName = fullName.substring(fullName.lastIndexOf(" ") + 1,fullName.lastIndexOf(" ") + 2).toUpperCase();
		System.out.println(lastName+" "+firstName+"."+otherName);*/


		// show most longer word
		/*
		 * String str =
		 * "позволяет закоментировать выделенную кода закоментироватьddddddd";
		 * String maxWord = ""; String currentWord = ""; while(str.length() >
		 * 0){ if(str.indexOf(" ")==-1){ currentWord =
		 * str.substring(0,str.length()); str= str.substring(0,str.length()-1);
		 * } else { currentWord = str.substring(0,str.indexOf(" ")); str=
		 * str.substring(str.indexOf(" ")+1); }
		 * 
		 * if(maxWord.length() < currentWord.length()){ maxWord = currentWord; }
		 * 
		 * } System.out.println(maxWord);
		 */

		/*
		 * currentWord = str.substring(0, str.indexOf(" "));
		 * if(currentWord.length() > maxWord.length()){ maxWord=currentWord; }
		 * str = str.substring(str.indexOf(" ")+1); }
		 * System.out.println(maxWord);
		 */

		// Check login and password
		/*
		 * String login = "itea"; String password = "123"; int count = 3;
		 * Scanner in = new Scanner(System.in); while (count > 0) {
		 * System.out.println("Enter Login:"); String log = in.nextLine();
		 * System.out.println("Enter Pssword:"); String pass = in.nextLine(); if
		 * (login.equals(log) & password.equals(pass)) {
		 * System.out.println("Access is allowed"); } else {
		 * System.out.println("Wrong login or password"); } count--; }
		 * in.close(); if (count == 0) {
		 * System.out.println("Wait 5 minutes and try again!"); }
		 */
	}
}
