package Observer.JogoDeNaves.jogo;


import Observer.JogoDeNaves.observer.*;

public class Jogo {
    public static void main(String[] args) {
        NaveJogador naveJogador = new NaveJogador("Gabriel");
        Observer naveInimiga1 = new NaveInimiga("Inimigo 1", naveJogador);
        naveJogador.setAcao(Acao.AVANCAR);
        Observer naveIminiga2 = new NaveInimiga("Inimigo 2", naveJogador);
        naveJogador.setAcao(Acao.ESQUERDA);


    }
}
