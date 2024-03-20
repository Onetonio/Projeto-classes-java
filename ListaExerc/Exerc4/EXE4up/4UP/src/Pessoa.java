import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private String email;

    // Construtor
    public Pessoa(String nome, String sobrenome, String dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = LocalDate.parse(dataNascimento,
                java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    // Adiciona e verifica e-mail
    public void adicionarEmail(String email) {
        if (validaEmail(email)) {
            this.email = email;
        } else {
            System.out.println("E-mail inválido! Certifique-se de que o e-mail contenha '@' e '.'");
        }
    }

    // Método para validar e-mail
    private boolean validaEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    // Método para calcular idade
    private int idade() {
        LocalDate hoje = LocalDate.now();
        return Period.between(dataNascimento, hoje).getYears();
    }

    // Método para verificar se é maior de idade
    public boolean maior() {
        return idade() >= 18;
    }

    // Método para obter informações da pessoa
    public String getInformacoes() {
        return "Nome: " + nome + "\n" +
                "Sobrenome: " + sobrenome + "\n" +
                "Idade: " + idade() + "\n" +
                "E-mail: " + email;
    }
}