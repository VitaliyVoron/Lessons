package ua.itea.less19;

/**
 * Created by Администратор on 07.11.2016.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Thread.activeCount());
        /*System.out.println(Thread.activeCount());
        MyThread01 mt = new MyThread01();
        Thread th = new Thread(mt,"MyThread");
        th.start();
        System.out.println(Thread.activeCount());*/

        new MyThread01();
        System.out.println(Thread.activeCount());

        new Thread(() -> System.out.println("dd")).start();

    }




}
