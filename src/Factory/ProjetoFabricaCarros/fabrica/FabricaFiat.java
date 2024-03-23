package Factory.ProjetoFabricaCarros.fabrica;

public class FabricaFiat implements Fabrica {
    @Override
    public Carro metodoFabrica(Enum carro) {
        if (carro.equals(ListaCarrosFiat.ARGO)) {
            return new Argo(80000, "Black");
        } else if (carro.equals(ListaCarrosFiat.CRONOS)) {
            return new Cronos(63000, "White");
        }

        return null;
    }
}
