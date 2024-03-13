import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        // Criando uma nova conta bancária
        ContaBancaria conta = new ContaBancaria(12345, "O brabo tem nome!", 1000.0);

        // Imprimindo informações iniciais da conta
        System.out.println("Informações da conta:");
        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Nome do titular: " + conta.getNomeTitular());
        System.out.println("Saldo atual: R$" + conta.getSaldo());

        // Realizando operações na conta
        conta.depositar(500.0); // Depositar R$ 500
        conta.sacar(200.0); // Sacar R$ 200
        conta.sacar(1500.0); // Tentar sacar valor maior que o saldo disponível

        // Imprimindo saldo após as operações
        System.out.println("Saldo atual: R$" + conta.getSaldo());

        Reserva reserva = new Reserva("João", 4, LocalDate.of(2024, 3, 15), 100.0);

        // Imprimindo informações da reserva
        reserva.exibirReserva();

        // Alterando valores da reserva
        reserva.setNumeroPessoas(6);
        reserva.setValorReserva(120.0);

        // Imprimindo informações atualizadas da reserva
        reserva.exibirReserva();

        Evento evento = new Evento("Concerto", "2024-04-20 19:00", 50.0f, 1000);

        // Vender alguns ingressos
        evento.venderIngresso(500);
        evento.venderIngresso(300);
        evento.venderIngresso(400); // Tentar vender mais ingressos do que disponível

        // Verificar a arrecadação
        System.out.println("Arrecadação total: R$" + evento.verArrecadacao());
    }
}
