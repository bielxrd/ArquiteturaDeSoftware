package Factory.ProjetoFabricaCarros.cliente;


import Factory.ProjetoFabricaCarros.fabrica.*;

public class Cliente {
    public static void main(String[] args) {

        Carro carro = FabricaVW.metodoFabrica(ListaCarrosVW.FOX);

        System.out.println(carro.getPreco());
        System.out.println(carro.getModelo());
        System.out.println(carro);

    }
}
