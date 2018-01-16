package lt.baltictalents.uzdaviniai;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main {

    synchronized static void method(long t, int i) throws InterruptedException {
        Thread.sleep(t);
        System.out.print(i);
    }

    public static void main(String[] args) throws InterruptedException {

        Object o = new Object();

        new Thread(() -> {
            synchronized(o) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {}
            }
            System.out.print(1);
        }).start();

        Thread.sleep(100);

        new Thread(() -> {
            synchronized(o) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {}
            }
            System.out.print(2);
        }).start();

        System.out.print(3);
    }



}
