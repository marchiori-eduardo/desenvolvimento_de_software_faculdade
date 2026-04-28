import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        int entrada = 1;

        ArrayList<Animal> animal = new ArrayList<>();


        /*========== MENU ============*/
            System.out.println("Bem-vindo ao Cadastro de Animais");

        do{
           menu.exibirMenuPrincipal();
            entrada = sc.nextInt();

            switch (entrada){
                case 1:
                    animal.add(menu.cadastrarAnimal());
                    System.out.println("Animal cadastrado com sucesso!\n" +
                            "Temos " + animal.size() + " animais cadastrados.\n");
                    break;

                case 2:
                    System.out.println("Listar Animais");
                    if (!animal.isEmpty()){
                        for (Animal a : animal) {
                            System.out.println(a.toString());
                        }
                    } else {
                        System.out.println("Nenhum Animal cadastrado!");

                    }
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while(entrada != 0);

        sc.close();
    }
}
