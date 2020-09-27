package classes;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.*;

public class SelectCount_extnd extends Thread {
    String part;
    private static AtomicInteger cnt = new AtomicInteger(0);
    Object lock = new Object();
    private static int counter = 1;

    public SelectCount_extnd(String part, String connection){
        this.part = part;
    }
    public void run() {
        try {
            sleep(new Random().nextInt(3000)+3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(part + " selected, count: "+cnt.incrementAndGet());
//        synchronized(lock){
//            counter++;
//            System.out.println(part + " selected, count: "+counter);
//
//        }
    }
}
