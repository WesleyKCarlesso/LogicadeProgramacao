import java.util.Scanner;

public class Funcionario {

    public static void main(String[] args) {

        int num;
        double horasTrabalhadas, valorHora;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número, a quantidade de horas trabalhadas e o valor hora:");
        num = input.nextInt();
        horasTrabalhadas = input.nextDouble();
        valorHora = input.nextDouble();

        System.out.println("Número: " + num);
        System.out.println("Salário: R$ " + (horasTrabalhadas * valorHora));

    }
}
// receber número, quantidade de horas trabalhadas e o
// valor que recebe por hora de um funcionário e mostrar
// o número e o salário total dele