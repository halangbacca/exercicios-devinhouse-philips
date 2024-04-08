public class Produto implements Tributavel {
    double valor;
    double valorImposto;

    @Override
    public double calcularValorComImposto() {
        return this.valor + this.valorImposto;
    }
}
