import java.util.Scanner;

public class Bicicleta implements Veiculo{
    private Double aro;

    public Bicicleta(Double aro) {
        this.aro = aro;
    }

    @Override
    public void acelerar() {
        System.out.println("Qual a intensidade da aceleração?");
        Scanner sc = new Scanner(System.in);
        sc.next();
        int intensidade  = sc.nextInt();
        System.out.println("Pedalando a bike na intensidade " + intensidade + "...");
        sc.close();
    }

    @Override
    public void frear() {
        System.out.println("Freando bike no RL!!");
    }

    @Override
    public String obteTipo() {
        return "Bicicreta";
    }
}
