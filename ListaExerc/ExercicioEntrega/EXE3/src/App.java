public class App {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Antonio", 100, 5, 1);
        Jogador jogador2 = new Jogador("Gustavo", 90, 6, 1);
        Jogador jogador3 = new Jogador("Davi", 110, 4, 1);
        Jogador jogador4 = new Jogador("Gabriel", 95, 7, 1);
        Jogador jogador5 = new Jogador("Nicolas", 105, 3, 1);

        System.out.print("\033[H\033[2J");

        System.out.println("NOME E PONTUAÇÃO DOS JOGADORES!\n");

        jogador1.exibirInformacoes();
        System.out.println("#########################################");
        jogador2.exibirInformacoes();
        System.out.println("#########################################");
        jogador3.exibirInformacoes();
        System.out.println("#########################################");
        jogador4.exibirInformacoes();
        System.out.println("#########################################");

        if (jogador1.batalharCom(jogador2)) {
            jogador1.exibirInformacoes();
            jogador2.exibirInformacoes();
        } else {
            jogador2.exibirInformacoes();
            jogador1.exibirInformacoes();
        }

        System.out.println("#########################################");

        if (jogador1.batalharCom(jogador3)) {
            jogador1.exibirInformacoes();
            jogador3.exibirInformacoes();
        } else {
            jogador3.exibirInformacoes();
            jogador1.exibirInformacoes();
        }
    }
}
