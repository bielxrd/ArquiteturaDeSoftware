package threads;

public class MultiplosPorTres extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}