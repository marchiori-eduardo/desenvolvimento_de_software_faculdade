import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite um número de mês do ano para visualizar por extenso: ");

        int numMes = sc.nextInt();
        System.out.println();

        String mes [] = {"janeiro","fevereiro","março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

        while (0 >= numMes || numMes > 12) {
            System.out.printf("Mês inválido!!! Digite novamente:");
            numMes = sc.nextInt();
            System.out.println();
        }
        /*else {

            }*/

        System.out.println("Mês: " + mes[numMes - 1]);

       /* switch (numMes) {
            case 1:
                System.out.println(mes[0]);
                break;
            case 2:
                System.out.println(mes[1]);
                break;
            case 3:
                System.out.println(mes[2]);
                break;
            case 4:
                System.out.println(mes[3]);
                break;
            case 5:
                System.out.println(mes[4]);
                break;
            case 6:
                System.out.println(mes[5]);
                break;
            case 7:
                System.out.println(mes[6]);
                break;
            case 8:
                System.out.println(mes[7]);
                break;
            case 9:
                System.out.println(mes[8]);
                break;
            case 10:
                System.out.println(mes[9]);
                break;
            case 11:
                System.out.println(mes[10]);
                break;
            case 12:
                System.out.println(mes[11]);
                break;*//*
        }*/

    }
}
