import java.util.Scanner;

public class Sinal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("Positivo");
        } else if (num == 0) {
            System.out.println("Neutro");
        } else {
            System.out.println("Negativo");
        }

    }
}
// recebe um numero e diz se ele é positivo, neutro ou negativo