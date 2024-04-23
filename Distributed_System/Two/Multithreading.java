class Threads extends Thread {
    Threads() {
        super("User Threads");
        System.out.println("User thread is created" + this);
        start();
    }

    public void run() {
        try {
            for (int i = 0; i < 8; i++) {
                System.out.println("Printing the count of Child Thread" + i);
                Thread.sleep(800);
            }
        } catch (InterruptedException e) {
            System.out.println("User thread interrupted");
        }
        System.out.println("Child thread run is over");
    }
}

public class Multithreading {
    public static void main(String args[]) {
        Threads th = new Threads();
        try {
            while (th.isAlive()) {
                System.out.println("Parent thread will run till the Child thread is alive");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Parent thread interrupted");
        }
        System.out.println("Parent thread's run is over");
    }
}
