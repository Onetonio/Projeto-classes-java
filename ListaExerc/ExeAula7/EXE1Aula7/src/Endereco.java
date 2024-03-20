public class Endereco {
    private String rua;
    private String cep;
    private String cidade;
    private String estado;

    // Construtor
    public Endereco(String rua, String cep, String cidade, String estado) {
        this.rua = rua;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    // Getters e Setters
    // (implemente conforme necessário)

    // Método para obter endereço completo
    public String getEnderecoCompleto() {
        return rua + ", " + cep + ", " + cidade + ", " + estado;
    }
}
