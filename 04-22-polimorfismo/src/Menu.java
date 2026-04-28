import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void exibirMenuPrincipal() {
        System.out.println("\n========== MENU ============\n" +
                "1 - Cadastrar Animais\n" +
                "2 - Listar Animais\n" +
                "3 - Mover Animal\n" +
                "4 - Editar Animal\n" +
                "0 - Sair\n");
    }

    public Animal cadastrarAnimal(){
        int tipoAnimal;
        System.out.println("\nDigite o tipo de animal: ");
        System.out.println("1 - É um Animal Genérico\n" +
                "2 - É uma Ave\n" +
                "3 - É um Peixe\n");
        tipoAnimal = sc.nextInt();
        sc.nextLine();


        System.out.printf("Digite o nome do animal: ");
        String nome = sc.nextLine();

        System.out.printf("Digite a quantidade de patas: ");
        Integer patas = sc.nextInt();

        System.out.printf("Digite a velocidade: ");
        Double velocidade = sc.nextDouble();

        System.out.printf("Digite a localização: ");
        Integer localizacao = sc.nextInt();


        switch (tipoAnimal){
            case 1:
                System.out.println();
                Animal animal = new Animal(nome, patas, velocidade, localizacao);
                return animal;
            case 2:
                Ave animalAve = new Ave(nome, patas, velocidade, localizacao);
                return animalAve;
            case 3:
                System.out.printf("Digite o tipo de água (doce/salgada): ");
                int tipoAgua = sc.nextInt();
                System.out.println();
                Peixe animalPeixe = new Peixe(nome, patas, velocidade, localizacao, tipoAgua);
                return animalPeixe;
            default:
                System.out.println("Opção inválida");
                return null;
        }

    }

    public void moverAnimal(){

    }
}
