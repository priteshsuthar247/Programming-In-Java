class HelloThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class WorldThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("World");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class _34 {
    public static void main(String[] args) {
        new HelloThread().start();
        new WorldThread().start();
    }
}
