package Multithreading;
class WorkThread implements Runnable{
    int data;

    public WorkThread(final int data) {
        this.data = data;
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.data + " X " + i + " = " + this.data * i);
        }
    }
}
public class basic1_5nums {
    public static void main(final String[] args) {
        System.out.println("Start");
        WorkThread w1=new WorkThread(2);
        final Thread t1=new Thread(w1);
        t1.start();
        t1.setName("THREAD-1");

        WorkThread w2=new WorkThread(3);
        final Thread t2=new Thread(w2);
        t2.start();
        t2.setName("THREAD-2");

        WorkThread w3=new WorkThread(4);
        final Thread t3=new Thread(w3);
        t3.start();
        t3.setName("THREAD-3");

        WorkThread w4=new WorkThread(5);
        final Thread t4=new Thread(w4);
        t4.start();
        t4.setName("THREAD-4");

        System.out.println("Ended");
    }
}
