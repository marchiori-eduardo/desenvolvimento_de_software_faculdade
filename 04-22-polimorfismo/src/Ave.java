public class Ave extends Animal{
    public Ave() {
    }

    public Ave(String nome, Integer patas, Double velocidade, Integer localizacao) {
        super(nome, patas, velocidade, localizacao);
    }

    public void mover() {
        System.out.println("Peixe " + this.getNome() + "movendo ------>");
        int localAtual = getLocalizacao();
        localAtual+= 5;
        super.setLocalizacao(localAtual);

    }
}
