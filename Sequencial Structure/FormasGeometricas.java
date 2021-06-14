import java.util.Scanner;

public class FormasGeometricas {

    public static void main(String[] args) {

        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite 3 números: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        triangulo = a * c / 2;
        circulo = 3.14159 * Math.pow(c, 2);
        trapezio = (a + b) * c / 2;
        quadrado = Math.pow(b, 2);
        retangulo = a * b;

        System.out.printf("Triângulo: %.3f%n", triangulo);
        System.out.printf("Círculo: %.3f%n", circulo);
        System.out.printf("Trapézio: %.3f%n", trapezio);
        System.out.printf("Quadrado: %.3f%n", quadrado);
        System.out.printf("Retângulo: %.3f%n", retangulo);

    }
}
// Ler A, B e C e calcular:
// a) a área do triângulo retângulo que tem A por base e C por altura.
// b) a área do círculo de raio C. (pi = 3.14159)
// c) a área do trapézio que tem A e B por bases e C por altura.
// d) a área do quadrado que tem lado B.
// e) a área do retângulo que tem lados A e B.