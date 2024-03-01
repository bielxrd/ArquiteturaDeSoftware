package Singleton.cliente;

import java.util.Scanner;

import Singleton.singleton.Singleton;

public class UsaSingleton {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
    
}
