package pacote;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Encasulamento");

        Pessoa pessoa1 = new Pessoa("Pedro", "Silva", 41, 987987758);

        // As linhas abaixo gerarão erros, pois os atributos são privados
        // pessoa1.sobrenome = "França";
        // pessoa1.setNome("Tiago");

        // Utilizamos os getters para acessar os atributos privados
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Sobrenome: " + pessoa1.getSobrenome());
        System.out.println("DDD: " + pessoa1.getDdd());
        System.out.println("Telefone: " + pessoa1.getTelefone());
    }
}
