import java.time.LocalDate;

public class Reserva {
    private String nomeCliente;
    private int numeroPessoas;
    private LocalDate dataReserva;
    private double valorReserva;

    // Construtor
    public Reserva(String nomeCliente, int numeroPessoas, LocalDate dataReserva, double valorReserva) {
        this.nomeCliente = nomeCliente;
        this.numeroPessoas = numeroPessoas;
        this.dataReserva = dataReserva;
        this.valorReserva = valorReserva;
    }

    // Métodos getters e setters
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }

    public double getValorReserva() {
        return valorReserva;
    }

    public void setValorReserva(double valorReserva) {
        this.valorReserva = valorReserva;
    }

    // Método para calcular o valor total da reserva
    public double calcularValorTotal() {
        return this.valorReserva * this.numeroPessoas;
    }

    // Método para exibir as informações da reserva na tela
    public void exibirReserva() {
        System.out.println("Informações da Reserva:");
        System.out.println("Nome do Cliente: " + this.nomeCliente);
        System.out.println("Número de Pessoas: " + this.numeroPessoas);
        System.out.println("Data da Reserva: " + this.dataReserva);
        System.out.println("Valor da Reserva: R$" + this.valorReserva);
        System.out.println("Valor Total da Reserva: R$" + calcularValorTotal());
    }
}