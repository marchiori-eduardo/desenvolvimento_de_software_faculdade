import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("digite os segundos: ");
        int seg =  sc.nextInt();

        System.out.println();

        double horas = seg / 3600;

        System.out.println("Em horas: " + horas);

        double  minutos = seg / 60;

        System.out.println("Em minutos: " + minutos);

        System.out.println("Em segundos: " + seg);
    }
}
