

public class Main {
    public static void main(String[] args) {

        Carro car = new Carro("Gol", "preto", "AAA3E34", 2);
        Pessoa p1 =  new Pessoa("João", 33, 12345678901L);
        PseudoCalculadora pc = new PseudoCalculadora(5,8);

        System.out.println(pc.soma());
        System.out.println(pc.subtracao());
        System.out.println(pc.divisao());
        System.out.println(pc.multiplicacao());
    }
}



