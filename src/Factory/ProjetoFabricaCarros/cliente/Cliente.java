package Factory.ProjetoFabricaCarros.cliente;


import Factory.ProjetoFabricaCarros.fabrica.*;

public class Cliente {
    public static void main(String[] args) {

        FabricaVW fabricaVW = new FabricaVW();
        FabricaFiat fabricaFiat = new FabricaFiat();

        Carro carro = fabricaVW.metodoFabrica(ListaCarrosVW.FOX);



        Carro carroFiat = fabricaFiat.metodoFabrica(ListaCarrosFiat.ARGO);

        System.out.println("Carro VW: ");
        System.out.println(carro);
        System.out.println("Carro FIAT: ");
        System.out.println(carroFiat);

    }
}
