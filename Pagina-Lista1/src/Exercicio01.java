import java.util.Scanner;

// 01 - Implemente um programa em java que solicite ao usuário a entrada de dois números de ponto flutuante e mostre a soma deles.

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir o primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        // Solicita ao usuário para inserir o segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Calcula a soma dos dois números
        double soma = numero1 + numero2;

        // Exibe a soma
        System.out.println("A soma dos dois números é: " + soma);

        // Fecha o scanner
        scanner.close();
    }
}