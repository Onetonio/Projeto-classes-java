public class App {
    public static void main(String[] args) {
        System.out.println("Exercício 1");

        Pessoa pessoa1 = new Pessoa("Antonio", 30);
        System.out.println(pessoa1.apresentar());

        System.out.println("Exercício 2");

        Livro livro1 = new Livro("Crepúsculo", "Jk", 2010);
        Livro livroBom = new Livro("Harry Potter", "JK2", 2000);

        System.out.println(livro1.informacoes());
        System.out.println(livroBom.informacoes());

        System.out.println("Exercício 3");

        Conta conta1 = new Conta("Tiago", 123);
        conta1.depositar(10);
        System.out.println(conta1.imprimir());
        conta1.depositar(-50);
        System.out.println(conta1.imprimir());

        if (conta1.sacar(30)) {
            System.out.println("Saque realizado com sucesso");
            System.out.println(conta1.imprimir());
        } else {
            System.out.println("Saldo insuficiente");
            System.out.println(conta1.imprimir());
        }

        System.out.println("Exercício 4");

        Triangulo triangulo = new Triangulo(10, 10);
        System.out.println("A área do triângulo é: " + triangulo.calcularArea());

        System.out.println("Exercício 5");

        Cafeteira oster = new Cafeteira();
        oster.encherCafe(14);
        oster.encherAgua(30);

        System.out.println(oster.status());

        if (oster.fazerCafe()) {
            System.out.println("Café pronto");
            System.out.println(oster.status());
        } else {
            System.out.println("Não foi possível fazer o café");
            System.out.println(oster.status());
        }
    }
}