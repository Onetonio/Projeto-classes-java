public class Jogador {
    private String nome;
    private int pontuacao;
    private int numeroDeBatalhas;
    private int nivel;

    public Jogador(String nome, int pontuacao, int numeroDeBatalhas, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.numeroDeBatalhas = numeroDeBatalhas;
        this.nivel = nivel;
    }

    public void atualizarPontuacao(int novaPontuacao) {
        this.pontuacao = novaPontuacao;
    }

    public void subirDeNivel() {
        this.nivel++;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Pontuação: " + this.pontuacao);
        System.out.println("Número de batalhas: " + this.numeroDeBatalhas);
        System.out.println("Nível: " + this.nivel);
    }

    public boolean batalharCom(Jogador outroJogador) {
        if (this.nivel > outroJogador.nivel) {
            this.subirDeNivel();
            System.out.println(this.nome + " venceu a batalha e subiu de nível");
            return true;
        } else if (this.nivel < outroJogador.nivel) {
            outroJogador.subirDeNivel();
            System.out.println(outroJogador.nome + " venceu a batalha e subiu de nível");
            return false;
        } else {
            if (this.numeroDeBatalhas > outroJogador.numeroDeBatalhas) {
                this.subirDeNivel();
                System.out.println(this.nome + " venceu a batalha e subiu de nível");
                return true;
            } else {
                outroJogador.subirDeNivel();
                System.out.println(outroJogador.nome + " venceu a batalha e subiu de nível");
                return false;
            }
        }
    }
}
