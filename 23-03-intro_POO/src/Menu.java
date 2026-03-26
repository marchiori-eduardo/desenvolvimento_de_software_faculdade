import entities.Conta;

import java.util.Scanner;

public class Menu {
    public static void menu() {
        Conta conta1 = new Conta();
        System.out.println( "1. Cadastrar conta \n" +
                "2. Ver dados cadastrados\n"
                + "3. Saque \n" +
                "4. Depósito \n" +
                "5. Sair \n");

        System.out.println("Opção escolhida: ");
        int num;
        do {
             num = entradaMenu();
        } while (num > 5 || num < 1);


        switch (num){
            case 1: {
                cadastrarCliente();
                break;
            }
            case 2: {
                System.out.println(conta1.toString());
                break;
            }
            case 3: {
                Scanner sc = new Scanner(System.in);

                double valor;
                System.out.printf("Entre com o valor: ");
                valor = sc.nextDouble();
                if (conta1 != null) {
                    conta1.saque(valor);
                    break;
                } else {
                    System.out.println("Conta não criada!");
                }
            }
            case 4 : {
                Scanner sc = new Scanner(System.in);

                double valor;
                System.out.printf("Entre com o valor: ");
                valor = sc.nextDouble();
                if (conta1 != null && valor > 0) {
                conta1.depositar(valor);
                    break;
                } else {
                    System.out.println("Conta não criada!");
                }
            }
        }

    }
    public static int entradaMenu() {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        sc.close();
        return num;
    }


    public static Conta cadastrarCliente() {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- CADASTRO ----");
        System.out.printf("Digite o nome do cliente: ");
        String nome = sc.nextLine();

        System.out.printf("Digite o numero do cliente: ");
        int numero = sc.nextInt();

        System.out.printf("Digite o saldo do cliente: ");
        double saldo = sc.nextDouble();

        System.out.printf("Digite o limite do cliente: ");
        double limite = sc.nextDouble();

        System.out.println();

        Conta conta1 = new Conta(nome, numero, saldo, limite);



        return conta1;
    }

}
