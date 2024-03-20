import java.time.LocalDate;

public class Aluno {
    private String nome;
    private int idade;
    private String email;
    private Endereco endereco;
    private Matricula matricula;
    private LocalDate dataNasc;

    // Construtor
    public Aluno(String nome, int idade, String email, Endereco endereco, Matricula matricula) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.endereco = endereco;
        this.matricula = matricula;
    }

    // Getters e Setters
    // (implemente conforme necessário)

    // Método para obter informações do aluno
    public String getInformacoes() {
        return "Nome: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "E-mail: " + email + "\n" +
                "Endereço: " + endereco.getEnderecoCompleto() + "\n" +
                "Matrícula: " + matricula.getNumeroMatricula();
    }
}
