import java.util.Scanner;

public class Atividade_3 {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        //========================atividade 03================================

        int maiorValor = 0;
        int menorValor = 0;
        int n;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite um valor: ");
            n = sc.nextInt();
            if (n > maiorValor) {
                maiorValor = n;
            }
            if (menorValor == 0) {
                menorValor = n;
            }
            if (n < menorValor) {
                menorValor = n;
            }
        }

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);

        sc.close();
    }
}
