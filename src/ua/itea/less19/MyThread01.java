package ua.itea.less19;

/**
 * Created by Администратор on 07.11.2016.
 */
public class MyThread01 extends Thread {
    Thread th;
    MyThread01(){
        th = new Thread(this,"MyThread");
        th.start();
    }

    public void run() {
        System.out.println("Hello from a thread!");
    }


}
