package saxValidation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class DogM {

	public static void main(String[] args) {
		/*File file=new File("C:/Dog.xml");
		PrintWriter pr=null;
		try {
			pr=new PrintWriter(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pr.write("<Hello>");
		pr.close();

		Dog dog=new Dog();
		XStream xs=new XStream(new StaxDriver());
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("C:/MyDog.xml");
			xs.toXML(dog,fos);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		Dog dog=new Dog();
		XStream xs=new XStream(new DomDriver());
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("C:/MyDog.xml");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		xs.fromXML(fis,dog);
		System.out.println(dog.name);
		
		System.out.println("Success");
		
	}

}
