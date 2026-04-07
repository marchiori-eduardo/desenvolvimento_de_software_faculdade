package entities;

public class Livro extends Produto {
    private String autor;

    public Livro(String name, double preco, Integer quantidade, String autor, String codBarra) {
        super(name, preco, quantidade, codBarra);
        this.autor = autor;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    @Override
    public String toString(){
        return super.toString() +
                "Livro{" + "autor=" + autor + '}';
    }
}
