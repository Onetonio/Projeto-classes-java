import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o sobrenome:");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite a data de nascimento (dd/mm/yyyy):");
        String dataNascimento = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, sobrenome, dataNascimento);

        boolean emailValido = false;
        while (!emailValido) {
            System.out.println("Digite o e-mail (EX: Antonioneto3260@gmail.com):");
            String email = scanner.nextLine();
            pessoa.adicionarEmail(email);
            if (pessoa.getEmail() != null) {
                emailValido = true;
            }
        }

        System.out.println("Informações da pessoa:");
        System.out.println(pessoa.getInformacoes());

        if (pessoa.maior()) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa é menor de idade.");
        }

        scanner.close();
    }
}