import entities.Cd;
import entities.Dvd;
import entities.Livro;
import entities.Produto;

public class Loja {
    public static void main(String[] args) {
        Produto produtos[] = new Produto[5];


        produtos[0] = new Cd("Cd da xuxa", 25.00, 6, 15, "Barra");
        produtos[1] = new Dvd("Harry Potter", 15.00, 6, 1.90, "Barra");
        produtos[2] = new Livro("Diario de um banana", 40.33, 8, "Gregory Heffley", "Barra");
        produtos[3] = new Livro("Diario de um banana 2", 40.33, 8, "Gregory Heffley", "Barra");
        produtos[4] = new Dvd("Harry Potter vol 2", 15.00, 6, 1.90, "Barra");



        System.out.println(produtos[2].toString());
        System.out.println();
        System.out.println(produtos[1].toString());
        System.out.println();
        System.out.println(produtos[2].toString());
        System.out.println();
        System.out.println(produtos[3].toString());
        System.out.println();
        System.out.println(produtos[4].toString());

    }

}
