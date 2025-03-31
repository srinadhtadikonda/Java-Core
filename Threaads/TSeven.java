import java.lang.*;

class TestThreadOne implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                Thread.sleep(1500);
                System.out.println(i);
            }
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
}

class Main {
    public static void main(String args[]) {
        TestThreadOne TTO = new TestThreadOne();
        Thread T = new Thread(TTO);
        T.start(); // Start the thread instead of calling run() directly
    }
}
