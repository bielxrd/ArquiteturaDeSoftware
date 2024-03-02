package Singleton.Aula1.cliente;

import Singleton.Aula1.singleton.Singleton;

public class UsaSingleton {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

    }
    
}
