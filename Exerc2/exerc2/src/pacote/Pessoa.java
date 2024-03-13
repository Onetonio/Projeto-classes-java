package pacote;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int ddd;
    private int telefone;

    public Pessoa(String nome, String sobrenome, int ddd, int telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ddd = ddd;
        this.telefone = telefone;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    private void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getDdd() {
        return ddd;
    }

    private void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Pessoa \nNome: " + this.nome + "\nSobrenome: " + this.sobrenome + "\nDDD: " + this.ddd + "\nTelefone: "
                + this.telefone;
    }
}