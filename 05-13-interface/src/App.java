import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        listaVeiculos.add(new Carro("Fusca"));
        System.out.println("Digite o aro da bicicleta");
        listaVeiculos.add(new Bicicleta(sc.nextDouble()));

        for(Veiculo v : listaVeiculos){
            v.acelerar();
            v.frear();
            System.out.println(v.obteTipo());
        }
        sc.close();
    }
}
