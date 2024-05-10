package Observer.JogoDeNaves.observer;

import java.util.ArrayList;
import java.util.List;

public class NaveJogador implements Subject {

    List<Observer> observers; // A Nave inimiga observa a nave jogador, varias naves inimigas
    private Acao acao;
    String nome;


    public NaveJogador(String nome) {
        this.observers = new ArrayList<>();
        this.nome = nome;
    }

    @Override
    public void adicionar(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(acao);
        }
    }

    @Override
    public void setAcao(Acao acao) {
        this.acao = acao;
        notifyObservers();
    }
}
