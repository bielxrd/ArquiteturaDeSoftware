package Factory.ProjetoFabricaCarros.fabrica;

public class FabricaVW {

    public static Carro metodoFabrica(Enum listaCarrosVW) {
        if (listaCarrosVW.equals(ListaCarrosVW.FOX)) {
            return new Fox(50000, "Urban");
        } else if (listaCarrosVW.equals(ListaCarrosVW.JETTA)) {
            return new Jetta(38000, "CAVALO");
        }

        return null;
    }
}
