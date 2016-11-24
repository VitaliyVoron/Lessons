package ua.itea.less16;

import com.thoughtworks.xstream.XStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Scanner in=null;
		try {
			in=new Scanner(new File("/web.xml"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String host=null;
		String user=null;
		String password=null;
		while(in.hasNextLine()){
			String currentLine=in.nextLine();
			if(currentLine.contains("<host>")){
				host=currentLine.substring(currentLine.indexOf("<host>")+6,currentLine.indexOf("</host>"));
			}else if(currentLine.contains("<user>")){
				user=currentLine.substring(currentLine.indexOf("<user>")+6,currentLine.indexOf("</user>"));
			}else if(currentLine.contains("<psw>")){
				password=currentLine.substring(currentLine.indexOf("<psw>")+5,currentLine.indexOf("</psw>"));
			}
		}
		System.out.println(host+",   "+user);

		File file = new File("/web.xml");
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		pw.write(host);
		pw.write(user);
		pw.close();*/

	}

}


