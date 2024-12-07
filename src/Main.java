

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha o número do exercício para executar (1 a 10) ou 0 para sair:");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1 -> somaDeNumeros(scanner);
                case 2 -> fatorial(scanner);
                case 3 -> contagemDeDigitos(scanner);
                case 4 -> verificarNumeroPrimo(scanner);
                case 5 -> multiplosDeNumero(scanner);
                case 6 -> calcularPotencia(scanner);
                case 7 -> verificarPalindromo(scanner);
                case 8 -> multiplosDeNumeros(scanner);
                case 9 -> converterBinarioParaDecimal(scanner);
                case 10 -> fibonacci(scanner);
                case 0 -> {
                    System.out.println("Saindo........ Até logo!");
                    return;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void somaDeNumeros(Scanner scanner) {
        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int soma = 0;
        for (int contador = 1; contador <= numero; contador++) {
            soma += contador;
        }
        System.out.println("A soma dos números de 1 até " + numero + " é: " + soma);
    }


}