import java.util.Scanner;

public class Atividade_2 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        //=-============atividade 2=========================

        double nota1 = 1;
        double nota2 = 0;
        double nota3 = 0;
        int codigo;
        double media = 0;

        do{
            System.out.printf("Digite o código do aluno: ");
            codigo = sc.nextInt();
            System.out.println("Digite a nota 1");
            nota1 = sc.nextDouble();
            System.out.println("Digite a nota 2");
            nota2 = sc.nextDouble();
            System.out.println("Digite a nota 3");
            nota3 = sc.nextDouble();

            media = (nota1 + nota2 + nota3) / 3;

            System.out.println();
            System.out.printf("A média do aluno %s é: ", codigo, + media);
            System.out.println();
        }while (nota1 != 0 ||nota2 != 0 || nota3 != 0);
        sc.close();
    }
}
