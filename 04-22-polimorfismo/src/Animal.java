public class Animal {
    private String nome;
    private Integer patas;
    private Double velocidade;
    private Integer localizacao;

    public Animal() {
    }

    public Animal(String nome, Integer patas, Double velocidade, Integer localizacao) {
        this.nome = nome;
        this.patas = patas;
        this.velocidade = velocidade;
        this.localizacao = localizacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPatas() {
        return patas;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    public Integer getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Integer localizacao) {
        this.localizacao = localizacao;
    }

    public void mover() {
        System.out.println("Animal " + this.nome + "se movendo ----->");
        this.localizacao++;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", patas=" + patas +
                ", velocidade=" + velocidade +
                ", localizacao=" + localizacao +
                '}';
    }
}
