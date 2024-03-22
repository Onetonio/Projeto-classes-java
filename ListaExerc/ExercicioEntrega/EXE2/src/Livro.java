import java.time.LocalDate;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);

        int anoAtual = LocalDate.now().getYear();

        int anosLancamento = anoAtual - anoPublicacao;
        System.out.println("O livro foi lançado há " + anosLancamento + " anos.");
    }
}
