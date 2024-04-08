public class ContaCorrente extends Conta implements Operavel {
    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (super.saldo >= valor) {
            super.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
