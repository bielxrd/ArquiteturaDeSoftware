package ProjetoTanqueRobo.src.arena;

import ProjetoTanqueRobo.src.roboTanque.CoresRGB;
import ProjetoTanqueRobo.src.roboTanque.TanqueRobo;

public class Arena {
    public static void main(String[] args) {
        TanqueRobo tanqueRobo = new TanqueRobo(0, 0, CoresRGB.GREEN, CoresRGB.BLUE, "Canhao");

        tanqueRobo.movNorte();
        tanqueRobo.movLeste();
        tanqueRobo.movLeste();
        System.out.println(tanqueRobo);
        try {
            tanqueRobo.atirar(6);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
