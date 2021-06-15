import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois números:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        if (n1 >= n2) {
            if (n1 % n2 == 0) {
                System.out.println("São Múltiplos!");
            } else {
                System.out.println("Não são múltiplos!");
            }
        } else {
            if (n2 % n1 == 0) {
                System.out.println("São Múltiplus");
            } else {
                System.out.println("Não são múltiplos");
            }
        }
    }
}
