import java.util.Scanner;

public class RaioCirculo {

    public static void main(String[] args) {

        double n1;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o raio:");
        n1 = input.nextDouble();

        double area = 3.14159 * Math.pow(n1, 2);

        System.out.println("Área: " + area);

    }
}
