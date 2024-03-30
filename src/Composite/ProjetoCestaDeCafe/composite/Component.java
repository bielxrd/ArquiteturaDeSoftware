package Composite.ProjetoCestaDeCafe.composite;

public interface Component {
    // O Component no design pattern Composite,
    // descreve operacoes que sao comuns tanto para elementos simples como para elementos complexos da arvore,
    // ou seja, descreve operacoes em comuns tanto para a cesta de cafe como para o produto.
    public double getPreco();

}
