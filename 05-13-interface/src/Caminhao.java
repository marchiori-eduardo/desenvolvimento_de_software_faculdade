import java.util.Scanner;

public class Caminhao implements Veiculo {
    private Double capacidadeCarga;
    private Double Tara;

    public Caminhao(Double capacidadeCarga, Double tara) {
        this.capacidadeCarga = capacidadeCarga;
        Tara = tara;
    }

    @Override
    public void acelerar() {
        System.out.println("Quanto quer acelerar a muriçoca?");
        Scanner sc = new Scanner(System.in);
        int quantidade = sc.nextInt();
        System.out.println("Acelerando a muriçoca no pique " + quantidade + "...");
    }

    @Override
    public void frear() {
        System.out.println("CABO O FREEEEEI!!!");
    }

    @Override
    public String obteTipo() {
        return "Caminhão";
    }

    public Double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(Double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public Double getTara() {
        return Tara;
    }

    public void setTara(Double tara) {
        Tara = tara;
    }
}
