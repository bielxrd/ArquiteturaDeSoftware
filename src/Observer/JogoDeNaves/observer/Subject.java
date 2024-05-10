package Observer.JogoDeNaves.observer;

public interface Subject { //Subject quer dizer o assunto

    void adicionar(Observer observer);

    void notifyObservers();

    void setAcao(Acao acao);
}
