package entities;

import java.util.Objects;

public class Produto {
    private String name;
    private double preco;
    private Integer quantidade;
    private String codBarra;

    public Produto() {
    }

    public Produto(String name, double preco, int quantidade, String codBarra) {
        this.name = name;
        this.preco = preco;
        this.quantidade = quantidade;
        this.codBarra = codBarra;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(codBarra, produto.codBarra);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codBarra);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

        @Override
    public String toString() {
        return "Produto: nome: " + name
                + ", preco: " + preco
                + ", quantidade: " + quantidade +
                "Código de barras: " + codBarra +
                " ";
    }
}
