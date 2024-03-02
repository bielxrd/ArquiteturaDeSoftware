package threads;

public class UsaThreads {
    public static void main(String[] args) {
        NumerosImpares numerosImpares = new NumerosImpares();
        NumerosPares numerosPares = new NumerosPares();
        MultiplosPorTres multiplosPorTres = new MultiplosPorTres();
        numerosImpares.start();
        numerosPares.start();
        multiplosPorTres.start();

    }

}
