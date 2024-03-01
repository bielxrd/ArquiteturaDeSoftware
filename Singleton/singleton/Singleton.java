package Singleton.singleton;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {}

    /**
     * Metodo global de acesso a variavel da classe
     * Singleton
     *
     * @return Singleton
     */
    public static Singleton getInstance() {
        return singleton;
    }
    
}
