import java.util.Scanner;

public class Program {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);


        int min, max;
        int numeros[] = new int[10] ;
        int o = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        System.out.println();

        System.out.printf("digite o intervalo máximo: ");
        max  = sc.nextInt();
        System.out.printf("digite o intervalo mínimo: ");
        min  = sc.nextInt();
        System.out.println();

        boolean validator = false;

        for  (int i = 0; i <= numeros.length - 1; i++) {
            if (min <= numeros[i] && max >= numeros[i]){
                validator = true;
                break;
            }
            else {
                validator = false;
            }
        }
        if (validator == true) {
            do {
                if (min <= numeros[o] && max >= numeros[o]) {
                    System.out.println(numeros[o]);
                }
                o++;
            } while (o <= numeros.length - 1);
        }
        else {
            System.out.println("Intervalo de números escolhido não disponível! ):");
        }

    }
}
