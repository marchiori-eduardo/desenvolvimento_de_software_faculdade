import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        double preco = 0;
        int quantidade = 0;

        System.out.println("Digite o nome do produto: ");
        nome = sc.nextLine();
        System.out.println("Digite o valor do produto: ");
        preco = sc.nextDouble();
        System.out.println("Digite a quantidade do produto: ");
        quantidade = sc.nextInt();

        double valorTotal = preco * quantidade;

        double valorDesconto = 0;

        if (quantidade > 10 && quantidade < 21) {
            valorDesconto = valorTotal - valorTotal * 0.1;
        }
        else if (quantidade > 20 && quantidade < 51) {
            valorDesconto = valorTotal - valorTotal * 0.2;
        }
        else if (quantidade > 50) {
            valorDesconto = valorTotal - valorTotal * 0.25;
        }


        System.out.println("Valor total: " + valorDesconto);
    }
}
