public class Carro {
    private String tipo;
    private String cor;
    private String placa;
    private int portas;

    public Carro(String tipo, String cor, String placa, int portas) {
        this.tipo = tipo;
        this.cor= cor;
        this.placa = placa;
        this.portas = portas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "tipo='" + tipo + '\'' +
                ", cor='" + cor + '\'' +
                ", placa='" + placa + '\'' +
                ", portas=" + portas +
                '}';
    }
}
