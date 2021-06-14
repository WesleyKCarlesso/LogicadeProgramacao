import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {

        int n1, n2;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois números inteiros:");
        n1 = input.nextInt();
        n2 = input.nextInt();

        System.out.println("Soma: " + (n1 + n2));

    }
}
