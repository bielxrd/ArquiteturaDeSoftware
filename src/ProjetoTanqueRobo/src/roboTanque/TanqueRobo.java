package ProjetoTanqueRobo.src.roboTanque;

public class TanqueRobo implements Canhao, Cor, Posicao {

    private int x;
    private int y;
    private CoresRGB corTanque;
    private CoresRGB corCanhao;
    private String name;

    public TanqueRobo() {

    }

    public TanqueRobo(int x, int y, CoresRGB corTanque, CoresRGB corCanhao, String name) {
        this.x = x;
        this.y = y;
        this.corTanque = corTanque;
        this.corCanhao = corCanhao;
        this.name = name;
    }

    @Override
    public void movLeste() {
        x++;
    }

    @Override
    public void movOeste() {
        x--;
    }

    @Override
    public void movSul() {
        y--;
    }

    @Override
    public void movNorte() {
        y++;
    }

    @Override
    public int retPosicaoX() {
        return x;
    }

    @Override
    public int retPosicaoY() {
        return y;
    }

    @Override
    public void atribCorTanque(CoresRGB corTanque) {
        this.corTanque = corTanque;
    }

    @Override
    public void atribCorCanhao(CoresRGB corCanhao) {
        this.corCanhao = corCanhao;
    }

    @Override
    public CoresRGB retCorTanque() {
        return corTanque;
    }

    @Override
    public CoresRGB retCorCanhao() {
        return corCanhao;
    }

    @Override
    public void atirar(long cadencia) {
        for (int i = 0; i < 5; i++) {
            esperar(cadencia * 1000);
            System.out.println("Atirando...");
        }
    }

    @Override
    public void atirar() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Atirando...");
        }
    }

    private void esperar(long cadencia) {
        try {
            if (cadencia > 5000) {
                throw new IllegalArgumentException("Invalid input");
            }
            Thread.sleep(cadencia);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "TanqueRobo [x=" + x + ", y=" + y + ", corTanque=" + corTanque + ", corCanhao=" + corCanhao + ", name="
                + name + "]";
    }

}