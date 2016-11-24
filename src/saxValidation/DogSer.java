package saxValidation;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DogSer {

	public static void main(String[] args) {
		Dog dog=new Dog();
		/*ByteArrayOutputStream baos=new ByteArrayOutputStream();
		ObjectOutputStream oos=null;
		try {
			oos=new ObjectOutputStream(baos);
			oos.writeObject(dog);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream ois=null;
		Dog cloneDog=null;
		try {
			ois=new ObjectInputStream(bais);
			cloneDog=(Dog) ois.readObject();
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cloneDog.name);
		*/
		
	
		ObjectOutputStream oos=null;
		try {
			oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("C:/MyDog.ser")));
			oos.writeObject(dog);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("written");
		ObjectInputStream ois=null;
		Dog cloneDog=null;
		try {
			ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream("C:/MyDog.ser")));
			cloneDog=(Dog) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cloneDog.name);
		
		
		
		
	}

}
