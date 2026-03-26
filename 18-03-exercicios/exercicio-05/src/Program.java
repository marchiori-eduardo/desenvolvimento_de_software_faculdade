import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numFun = 0;
        double media, soma = 0;

        System.out.printf("Quantos funcionários possui a empresa? ");
        numFun = sc.nextInt();
        System.out.println();

        double salary[] = new double[numFun];

        for (int i = 0; i <= numFun - 1; i++){
            System.out.printf("Digite o salário do %d° funcionário: ", i +1);
            salary[i] = sc.nextDouble();

            soma += salary[i];
        }

        media = soma / numFun;

        for (int i = 0; i <= numFun -1; i++){
            
        }



        sc.close();
    }
}
