package classes;

public class SelectCount_Intrfc implements Runnable {
    private Thread t;
    private String threadName;

    public SelectCount_Intrfc(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println(threadName + " selected");
    }

    public void start () {
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}
