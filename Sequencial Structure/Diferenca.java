import java.util.Scanner;

public class Diferenca {

    public static void main(String[] args) {

        int a, b, c, d;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite 4 numeros inteiros:");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        int diferenca = (a * b - c * d);

        System.out.println("Diferença: " + diferenca);

    }
}
// ler quatro valores A B C D e mostrar a diferença do
// produto de A e B pelo produto de C e D
