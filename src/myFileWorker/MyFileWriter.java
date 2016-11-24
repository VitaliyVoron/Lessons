package myFileWorker;

import java.io.*;

/**
 * Created by Администратор on 09.11.2016.
 */
public class MyFileWriter {

    public void fileWriter(String string) {
        /*File file=new File("settings.xml");
        PrintWriter pr=null;
        try {
            pr=new PrintWriter("settings.xml");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        pr.write(string);
        pr.close();*/

        try {
            FileWriter fr = new FileWriter("settings.xml",false);
            fr.write(string);
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
