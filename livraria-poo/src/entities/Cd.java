package entities;

public class Cd extends Produto{
    private Integer numFaixas;

    public Cd(String name, Double preco, Integer quantidade, String codBarra){
        super(name, preco, quantidade, codBarra);
    }

    public Cd(String name, Double preco, Integer quantidade, Integer numFaixas, String codBarra){
        super(name, preco, quantidade, codBarra);
        this.numFaixas = numFaixas;
    }

    public Integer getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(Integer numFaixas) {
        this.numFaixas = numFaixas;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Cds{" +
                "numFaixas=" + numFaixas +
                '}';
    }
}
