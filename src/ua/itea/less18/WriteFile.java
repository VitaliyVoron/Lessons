package ua.itea.less18;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import java.io.*;

/**
 * Created by Администратор on 03.11.2016.
 */
public class WriteFile {

    public static void main(String[] args) {
        /*Dog dog = new Dog();
        XStream xs = new XStream(new StaxDriver());
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("C:/dog.xml");
            xs.toXML(dog,fos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/


        Dog dog = new Dog();
        XStream xs = new XStream(new DomDriver());
        FileInputStream fis = null;

        try {
            fis= new FileInputStream("C:/dog.xml");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        xs.fromXML(fis,dog);
        System.out.println(dog.name);

    }
}
