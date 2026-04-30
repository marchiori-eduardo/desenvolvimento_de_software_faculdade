import java.util.ArrayList;
import java.util.Scanner;

public class View {
    Scanner sc = new Scanner(System.in);

    public void exibirMenuPrincipal() {
        System.out.println("\n========== MENU ============\n" +
                "1 - Cadastrar Animais\n" +
                "2 - Listar Animais\n" +
                "3 - Mover Animal\n" +
                "4 - Editar Animal\n" +
                "0 - Sair\n");
    }

    public Animal cadastrarAnimal() {
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


        switch (tipoAnimal) {
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

    public void listarAnimais(ArrayList<Animal> animaisList) {
        if (!animaisList.isEmpty()) {
            int i = 0;
            for (Animal a : animaisList) {
                i++;
                System.out.println(i + " - " + a.toString());
            }

        } else {
            System.out.println("Nenhum Animal cadastrado!");
        }
    }

    public void moverAnimal(ArrayList<Animal> animaisList) {
        if (!animaisList.isEmpty()) {
            listarAnimais(animaisList);
            System.out.print("Escolha o animal desejado: ");
            int escolha = sc.nextInt();

            animaisList.get(escolha - 1).mover();
            System.out.println();
            System.out.println("Animal movido com sucesso!");
        } else {
            System.out.println("Nenhum Animal cadastrado!");
        }

    }

    public void editarAnimal(ArrayList<Animal> animaisList) {
        if (!animaisList.isEmpty()) {

            listarAnimais(animaisList);

            System.out.print("Escolha o Animal que deseja editar: ");
            int escolhaTemp = sc.nextInt();
            int escolha = escolhaTemp - 1;
            Animal animalSelecionado = animaisList.get(escolha);
            sc.nextLine();

            System.out.println();
            System.out.println("O que deseja editar?");
            System.out.println("1 - Nome\n" +
                                "2 - Patas\n" +
                                 "3 - Velocidade\n" +
                                    "4 - Localização\n");

            if (animalSelecionado instanceof Peixe){
                System.out.println("5 - Tipo de água\n");
            }

            System.out.println("0 - Todas\n");
            int opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao) {
                case 1:
                    System.out.print("Nome Antigo: \"" + animalSelecionado.getNome() + "\" digite o novo nome: ");
                    String novoNome = sc.nextLine();
                    animalSelecionado.setNome(novoNome);
                    System.out.println("Animal editado com sucesso!");
                    break;
                case 2:
                    System.out.print("Patas Antigas: \"" + animalSelecionado.getPatas() + "\" digite a nova quantidade: ");
                    Integer novasPatas = sc.nextInt();
                    animalSelecionado.setPatas(novasPatas);
                    System.out.println("Animal editado com sucesso!");
                    break;
                case 3:
                    System.out.print("Velocidade Antiga: \"" + animalSelecionado.getVelocidade() + "\" digite a nova Velocidade: ");
                    Double novaVelocidade = sc.nextDouble();
                    animalSelecionado.setVelocidade(novaVelocidade);
                    System.out.println("Animal editado com sucesso!");
                    break;
                case 4:
                    System.out.print("Localização Antiga: \"" + animalSelecionado.getLocalizacao() + "\" digite a nova localização: ");
                    Integer novaLocalizacao = sc.nextInt();
                    animalSelecionado.setLocalizacao(novaLocalizacao);
                    System.out.println("Animal editado com sucesso!");
                    break;
                case 5:
                    if (animalSelecionado instanceof Peixe) {
                        System.out.println("Tipo de água antiga: \"" + ((Peixe) animalSelecionado).getTipoAgua() + "\" Digite o novo tipo de agua: ");
                        int novoTipoAgua = sc.nextInt();
                        ((Peixe) animalSelecionado).setTipoAgua(novoTipoAgua);
                        System.out.println("Animal editado com sucesso!");
                    } else {
                        System.out.println("Opção invalida.");
                    }
                    break;
                case 0:
                    System.out.println();
                    System.out.print("Nome Antigo: \"" + animalSelecionado.getNome() + "\" digite o novo nome: ");
                    String novoNome0 = sc.nextLine();
                    animalSelecionado.setNome(novoNome0);
                    System.out.println();

                    System.out.print("Patas Antigas: \"" + animalSelecionado.getPatas() + "\" digite a nova quantidade: ");
                    Integer novasPatas0 = sc.nextInt();
                    animalSelecionado.setPatas(novasPatas0);
                    System.out.println();

                    System.out.print("Velocidade Antiga: \"" + animalSelecionado.getVelocidade() + "\" digite a nova Velocidade: ");
                    Double novaVelocidade0 = sc.nextDouble();
                    animalSelecionado.setVelocidade(novaVelocidade0);
                    System.out.println();

                    System.out.print("Localização Antiga: \"" + + animalSelecionado.getLocalizacao() + "\" digite a nova localização: ");
                    Integer novaLocalizacao0 = sc.nextInt();
                    animalSelecionado.setLocalizacao(novaLocalizacao0);

                    if (animalSelecionado instanceof Peixe){
                        System.out.println("Tipo de água antiga: \"" + ((Peixe) animalSelecionado).getTipoAgua() + "\" Digite o novo tipo de agua: ");
                        int novoTipoAgua0 = sc.nextInt();
                        ((Peixe) animalSelecionado).setTipoAgua(novoTipoAgua0);

                    }

                    System.out.println("Animal editado com sucesso!");

                default:{
                    System.out.println("Opção inválida");
                }
            }




        } else {
            System.out.println("Nenhum Animal cadastrado!");
        }
    }
}
