import java.util.Scanner;

public class Quadrante {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois números para X e Y:");
        double n1 = input.nextDouble(); // x
        double n2 = input.nextDouble(); // y

        if (n1 > 0) {
            if (n2 > 0) {
                System.out.println("Quadrante Q1");
            } else if (n2 < 0) {
                System.out.println("Quadrante Q4");
            } else {
                System.out.println("Eixo X");
            }
        } else if (n1 < 0) {
            if (n2 > 0) {
                System.out.println("Quadrante Q2");
            } else if (n2 < 0) {
                System.out.println("Quadrante Q3");
            } else {
                System.out.println("Eixo X");
            }
        } else {
            if (n2 == 0) {
                System.out.println("Origem");
            } else {
                System.out.println("Eixo Y");
            }
        }
    }
}
// receber 2 valores e ver em que quadrante no plano cartesiano ele está
// Q2 | Q1
// -------
// Q3 | Q4