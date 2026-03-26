public class Atividade {
    public static void main(String[] args) {
        //atividade 1
        int i = 10;
        int j = 2;
        int x = 0;
        int y = 0;
        j++;
        ++i;
        x = i++ + j;
        y = ++j + ++i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //atividade 2
        double num1 = 10;
        double num2 = 20;
        double num3 = 45;
        double media = num1 + num2 + num3 / 3;

        //atividade 3
        int a = 10, b = 5, c = 2, d = 3, e = 1, f = 5, g = 7, h = 2, i = 2;
        System.out.println(" - " + (a / b ^ c ^ d - e + f - g * h + i));

    }
}
