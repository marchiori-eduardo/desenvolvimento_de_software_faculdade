import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[3];
        int vetor2[] = new int[3];

        List<Integer> intersecao = new ArrayList();

        for (int i = 0; i <= vetor.length - 1; i++) {
            System.out.printf("Digite o " + (i + 1) + " número do 1° vetor: ");
            vetor[i] = sc.nextInt();
            System.out.printf("Digite o " + (i + 1) + " número do 2° vetor: ");
            vetor2[i] = sc.nextInt();
            System.out.println();
        }

        for (int i = 0; i <= vetor.length - 1; i++) {
            for  (int j = 0; j <= vetor.length - 1; j++) {
                if (vetor[j] == vetor2[i]) {
                    intersecao.add(vetor[i]);
                    break;
                }
            }
        }

        System.out.println();
        for(Integer list : intersecao ) {
            System.out.println(list);
        }

        sc.close();
    }
}
