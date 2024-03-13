public class Evento {
    private String nome;
    private String data;
    private float precoIngresso;
    private int qtdIngressos;
    private int qtdIngressosVendidos;

    // Construtor
    public Evento(String nome, String data, float precoIngresso, int qtdIngressos) {
        this.nome = nome;
        this.data = data;
        this.precoIngresso = precoIngresso;
        this.qtdIngressos = qtdIngressos;
        this.qtdIngressosVendidos = 0;
    }

    // Método para vender ingressos
    public void venderIngresso(int quantidade) {
        if (quantidade > 0 && quantidade <= (this.qtdIngressos - this.qtdIngressosVendidos)) {
            this.qtdIngressosVendidos += quantidade;
            System.out.println("Ingressos vendidos com sucesso.");
        } else {
            System.out.println("Quantidade de ingressos insuficiente.");
        }
    }

    // Método para verificar a arrecadação
    public float verArrecadacao() {
        return this.qtdIngressosVendidos * this.precoIngresso;
    }
}
