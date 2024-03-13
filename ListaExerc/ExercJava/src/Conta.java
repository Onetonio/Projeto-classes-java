class Conta {
    String titular;
    int numero;
    double saldo;

    public Conta(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public void depositar(double valor) {
        if (valor > 0)
            saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public String imprimir() {
        return "Titular: " + titular + ", Número da Conta: " + numero + ", Saldo: R$" + saldo;
    }
}