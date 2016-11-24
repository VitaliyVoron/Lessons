package ua.itea.less19;

/**
 * Created by Администратор on 07.11.2016.
 */
public class MyThre extends Thread {

    Thread th;
    MyThre(){
        th = new Thread(this,"MyThread");
        th.start();
    }

    public void run() {

    }
}
