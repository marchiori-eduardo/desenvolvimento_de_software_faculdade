import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        ArrayList<Forma2D> listaFormas = new ArrayList<>();
        int option = 1;


        MenuFormas menuFormas = new MenuFormas(sc);

        do{
            option = menuFormas.exibirMenu();
        }while(option != 0);




        menuFormas.encerrarSistema();
    }
}
