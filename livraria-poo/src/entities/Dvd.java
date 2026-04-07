package entities;

public class Dvd extends Produto{
    private double duracao;



    public Dvd(String name, double preco, int quantidade, double duracao, String codBarra) {
        super(name, preco, quantidade, codBarra);
        this.duracao = duracao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }


    @Override
    public String toString() {
        return super.toString() +
        "Dvds{" +
                "duracao=" + duracao +
                '}';
    }
}
