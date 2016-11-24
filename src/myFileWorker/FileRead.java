package myFileWorker;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Администратор on 10.11.2016.
 */
public class FileRead {

    public String fileReader(String fileName){
        String str = "";

        try(FileReader reader = new FileReader(fileName))
        {
            int c;
            while((c=reader.read())!=-1){

                str+= (char)c;
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        //System.out.println(str);
        return str;
    }

}
