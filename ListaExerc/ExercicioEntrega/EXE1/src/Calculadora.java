import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora");
        System.out.println("Escolha uma operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Potenciação");
        System.out.println("6. Fatoração");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                realizarAdicao();
                break;
            case 2:
                realizarSubtracao();
                break;
            case 3:
                realizarMultiplicacao();
                break;
            case 4:
                realizarDivisao();
                break;
            case 5:
                realizarPotenciacao();
                break;
            case 6:
                realizarFatoracao();
                break;
            default:
                System.out.println("Opção inválida. Escolha uma operação válida.");
        }
    }

    public static void realizarAdicao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        if (verificarLimites(num1, num2)) {
            int resultado = num1 + num2;
            System.out.println("O resultado da adição é: " + resultado);
        } else {
            System.out.println("Números inválidos. Insira números entre 0 e 50.");
        }
    }

    public static void realizarSubtracao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        if (verificarLimites(num1, num2)) {
            int resultado = num1 - num2;
            System.out.println("O resultado da subtração é: " + resultado);
        } else {
            System.out.println("Números inválidos. Insira números entre 0 e 50.");
        }
    }

    public static void realizarMultiplicacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        if (verificarLimites(num1, num2)) {
            int resultado = num1 * num2;
            System.out.println("O resultado da multiplicação é: " + resultado);
        } else {
            System.out.println("Números inválidos. Insira números entre 0 e 50.");
        }
    }

    public static void realizarDivisao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo valor:");
        int num2 = scanner.nextInt();

        if (num2 != 0 && verificarLimites(num1, num2)) {
            double resultado = (double) num1 / num2;
            System.out.println("O resultado da divisão é: " + resultado);
        } else {
            System.out.println("Divisão por zero ou números inválidos. Insira números entre 0 e 50.");
        }
    }

    public static void realizarPotenciacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base:");
        int base = scanner.nextInt();
        System.out.println("Digite o expoente:");
        int expoente = scanner.nextInt();

        if (verificarLimites(base, expoente)) {
            int resultado = potenciacao(base, expoente);
            System.out.println("O resultado da potenciação é: " + resultado);
        } else {
            System.out.println("Números inválidos. Insira números entre 0 e 50.");
        }
    }

    public static int potenciacao(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        int resultado = base;
        for (int i = 1; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static void realizarFatoracao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número para fatorar:");
        int numero = scanner.nextInt();

        if (verificarLimites(numero)) {
            System.out.print("O resultado da fatoração é: ");
            fatoracao(numero);
        } else {
            System.out.println("Número inválido. Insira um número entre 0 e 50.");
        }
    }

    public static void fatoracao(int numero) {
        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                System.out.print(i + "");
                numero /= i;
                if (numero != 1) {
                    System.out.print(" * ");
                }
            }
        }
    }

    public static boolean verificarLimites(int... numeros) {
        for (int num : numeros) {
            if (num < 0 || num > 50) {
                return false;
            }
        }
        return true;
    }
}