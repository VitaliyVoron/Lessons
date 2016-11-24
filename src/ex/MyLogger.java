package ex;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {

	public static void main(String[] args) throws SecurityException, IOException {
		System.out.println("Start");
		Logger logger=Logger.getLogger(MyLogger.class.getName());
		FileHandler fh=new FileHandler("C:/AuthLog/MyLog.xml");
		logger.setUseParentHandlers(false);
		logger.addHandler(fh);
		
		try{
			
			System.out.println(5/0);
		}catch(Exception e){
			logger.log(Level.WARNING, e.getMessage());
		}
		
		System.out.println("End");
	}

}
