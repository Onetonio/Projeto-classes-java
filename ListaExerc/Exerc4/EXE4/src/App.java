import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int a = 5;
        int b = 10;
        int soma, subtracao, multiplicacao, restoDivisao, dataNasc, idade;
        float divisao;

        System.out.println("aula de estruturas condicionais");

        soma = a + b;
        subtracao = b - a;
        multiplicacao = a * b;
        divisao = b / a;
        restoDivisao = b % a;

        System.out.println("soma = " + soma);
        System.out.println("subtração = " + subtracao);
        System.out.println("multiplicação = " + multiplicacao);
        System.out.println("divisão = " + divisao);
        System.out.println("restoDivisao = " + restoDivisao);

        System.out.println("Numero apos = " + a++);
        System.out.println("Numero antes = " + ++b);

        System.out.println("Decremento apos = " + a--);
        System.out.println("Decremento antes = " + --b);

        if (b != 10) {
            System.out.println("B é igual a 10");
        } else if (a == 5) {
            System.out.println("A é igual a 5");
        } else {
            System.out.println("Nenhum dos casos");
        }

        switch (a) {
            case 10:
                System.out.println("A é igual a 10");
                break;
            case 5:
                System.out.println("A é igual a 5");
                break;
            case 2:
                System.out.println("A é igual a 2");
            default:
                System.out.println("Nenhum dos casos");
                break;
        }
        System.out.println("");
        System.out.println("########################################################\n");

        System.out.println("Digite seu ano de nascimento: ");
        dataNasc = entrada.nextInt();
        idade = 2024 - dataNasc;

        // if(idade >= 18) {
        // System.out.println("Voce é maior que 18 anos");
        // } else{
        // System.out.println("Voce é mnor de 18 anos");
        // }

        System.out.println((idade >= 18) ? ("Voce é maior de 18 anos") : "Voce é menor de 18 anos");

    }
}
