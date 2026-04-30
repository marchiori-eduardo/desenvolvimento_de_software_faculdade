public class Peixe extends Animal {
    private int tipoAgua;

    public Peixe() {
    }

    public Peixe(int tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public Peixe(String nome, Integer patas, Double velocidade, Integer localizacao, int tipoAgua) {
        super(nome, patas, velocidade, localizacao);
        this.tipoAgua = tipoAgua;
    }

    public int getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(int tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public void mover() {
        System.out.println("Peixe " + this.getNome() + " se movendo ------>");
        int localAtual = getLocalizacao();
        localAtual+= 2;
        super.setLocalizacao(localAtual);
    }

    @Override
    public String toString() {
        return "Peixe{" +
                super.toString() +
                "tipoAgua=" + tipoAgua +
                '}';
    }
}
