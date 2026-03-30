import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String name = sc.nextLine();

        System.out.println("Digite o departamento: ");
        String department = sc.nextLine();

        System.out.println("Digite o salario: ");
        double salary = sc.nextDouble();

        System.out.println("Digite a data de admissao: ");
        String date = sc.nextLine();

        System.out.println("Digite o RG: ");
        String RG = sc.nextLine();

        System.out.println("Está atualmente na empresa? S/N ");
        String simNao = sc.nextLine();

        if (simNao.equals("sim")) {}

        sc.close();
    }
}
