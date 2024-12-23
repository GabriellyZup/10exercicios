

import java.sql.SQLOutput;
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
                case 5 -> inverterNumero(scanner);
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

    public static void fatorial(Scanner scanner) {
        System.out.println("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        while (numero > 0) {
            fatorial *= numero;
            numero--;
        }

        System.out.println("O fatorial é: " + fatorial);
    }
    public static void contagemDeDigitos (Scanner scanner) {
        System.out.println("Digite um numero inteiro para contar dígitos: ");
        int numero = scanner.nextInt();

        int contador = 0;
        int numeroAbsoluto = Math.abs(numero); //abs trata negativo para o loop não dar erro de tratamento

        while (numeroAbsoluto > 0) {
            numeroAbsoluto /= 10;
            contador++;
        }

        if (contador ==0) {
            contador =1; //para contar o 0 como 1 digito
        }

        System.out.println("O número possui " + contador + " digito");
    }

    public static void verificarNumeroPrimo (Scanner scanner) {
        System.out.println("Digite um número para verificar se é primo: ");
        int numero = scanner.nextInt();

        if (numero < 2) {
            System.out.println("O número " + numero + " não é primo.");
            return;
        }

        boolean Primo = true;
            //math classe .sqrt método de raiz quadrada
        for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
            if (numero % divisor == 0) {
                Primo = false;
                break;
            }
        }

        if (Primo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }
    }


    public static void inverterNumero (Scanner scanner) {
        System.out.println("Digite um número para inverter ");
        int numero = scanner.nextInt();

        int numeroInvertido = 0;

        while (numero != 0) {
            int digito = numero % 10; //pega ultimo digito
            numeroInvertido = numeroInvertido * 10 + digito; //adiciona o digito ao numero invertido
            numero /= 10; // remove ultimo digito
        }
         System.out.println("O número invertido é: " + numeroInvertido);
    }


    public static void calcularPotencia(Scanner scanner) {
        System.out.println("Digite o número base: ");
        int base = scanner.nextInt();

        System.out.println("Digite o número expoente: ");
        int expoente = scanner.nextInt();

        int resultado = 1; //começa no 1 pq qlqr num elevado a 0 é 1

        for (int contador = 1; contador <= expoente; contador++) {
            resultado *= base; //multiplica a base pelo resultado
        }

        System.out.println("O resultado de " + base + "elevado a " + expoente + " é: " + resultado);
    }

    public static void verificarPalindromo(Scanner scanner) {
        System.out.println("Digite um número inteiro para verificar se é palindromo: ");
        int numero = scanner.nextInt();

        int numeroOriginal = numero;
        int numeroInvertido = 0;

        while (numero != 0) {
            int digito = numero %10; //pega ultimo digito
            numeroInvertido = numeroInvertido * 10 + digito; //constroi invertido
            numero /= 10; //remove ultimo digito
        }

        if (numeroOriginal == numeroInvertido) {
            System.out.println(numeroOriginal + " é um palíndromo.");
        } else {
            System.out.println(numeroOriginal + " não é um palíndromo.");
        }
    }

    public static void multiplosDeNumeros (Scanner scanner) {

        System.out.println("Digite o número base: ");
        int base = scanner.nextInt();

        System.out.println("Digite o limite: ");
        int limite = scanner.nextInt();

        System.out.println("Multiplos de " + base + " até " + limite + ":");

        for (int current = base; current <= limite; current += base) {
            System.out.print(current + " ");
        }

        System.out.println();
    }

    public static void converterBinarioParaDecimal(Scanner scanner) {
        System.out.println("Digite um número binário para converter em decimal: ");
        String binario = scanner.next();
        if (binario.matches("[01]+")) { //ver se é só 0 e 1
            int decimal = Integer.parseInt(binario, 2); //converte string binaria p decimal
            System.out.println("O número decimal correspondente é: " + decimal);
        } else {
            System.out.println("Entrada invalida. Certifique-se de inserir apenas binários.");
        }
    }

    public static void fibonacci(Scanner scanner) {
        System.out.println("digite o número de termos para série de Fibonacci: ");
        int termos = scanner.nextInt();

        int a = 0, b = 1;

        System.out.println("Série de Fibonacci: ");
        int contador = 0;
        while (contador < termos) {
            System.out.println(a + " ");
            int next = a + b;
            a = b;
            b = next;
            contador++;
        }
        System.out.println();

        //termos = variavel de quantos numeors serão calc
        //contaor = i controla qts numero da sequencia já foram exibidos.
    }
} //alteração para sobreescrever o readme