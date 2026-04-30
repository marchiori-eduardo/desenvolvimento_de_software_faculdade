import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        View view = new View();
        int entrada = 1;

        ArrayList<Animal> animaisList = new ArrayList<>();


        /*========== MENU ============*/
            System.out.println("Bem-vindo ao Cadastro de Animais");

        do{
           view.exibirMenuPrincipal();
            entrada = sc.nextInt();

            switch (entrada){
                case 1:
                    animaisList.add(view.cadastrarAnimal());
                    System.out.println("Animal cadastrado com sucesso!\n" +
                            "Temos " + animaisList.size() + " animais cadastrados.\n");
                    break;

                case 2:
                    System.out.println("Listar Animais");
                    view.listarAnimais(animaisList);
                    break;

                case 3:
                    System.out.println("Mover Animal");
                    view.moverAnimal(animaisList);

                    break;

                case 4:
                    System.out.println("Editar Animal");

                    view.editarAnimal(animaisList);

                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while(entrada != 0);

        sc.close();
    }
}
