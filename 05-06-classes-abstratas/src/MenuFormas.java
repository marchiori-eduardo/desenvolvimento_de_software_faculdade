import java.util.Scanner;

public class MenuFormas {
    private Scanner sc;

    public MenuFormas(Scanner sc) {
        this.sc = sc;
    }

    public void encerrarSistema() {
        sc.close();
    }

    public int exibirMenu(){
        int option;
        String texto = "--- FORMAS 2D ---\n" +
                "1 - Cadastrar Forma \n" +
                "2 - Listar Formas \n" +
                "3 - Calcular área\n" +
                "0 - Sair\n";
        System.out.println(texto);
        option = sc.nextInt();



        return option;
    }
}
