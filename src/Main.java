
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int soma = 0;
        for (int contador = 1; contador <= numero; contador++) {
            soma += contador;
        }
        System.out.println("A soma dos números de 1 até " + numero + " é: " + soma);
    }
}