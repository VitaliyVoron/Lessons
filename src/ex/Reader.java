package ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {

	public static void main(String[] args) {
		Scanner in=null;
		try {
			in=new Scanner(new File("C:/AuthLog/config.xml"));
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
		ConConf con=new ConConf(host,user,password);
		con.getCon();
	}

}
