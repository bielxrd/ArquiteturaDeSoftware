package Observer.JogoDeNaves.observer;

public class NaveInimiga implements Observer {

    private String nome;


    public NaveInimiga(String nome, Subject subject) {
        this.nome = nome;
        subject.adicionar(this);
    }


    @Override
    public void update(Acao acao) {
        System.out.println(nome + " - "+acao);
    }
}
