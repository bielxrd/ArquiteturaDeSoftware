package threads;

public class NumerosPares extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 2000; i += 2) {
            System.out.print(i + " ");
        }
    }
}
