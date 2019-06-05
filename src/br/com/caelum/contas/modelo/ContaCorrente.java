package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    public ContaCorrente() {
    }

    @Override
    public void saca(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Você tentou sacar um valor negativo");
        }
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException(valor);
        }
        this.saldo -= (valor + 0.10);
    }

    public String getTipo(){
        return "Conta Corrente";
    }

    public double getValorImposto(){
        return this.getSaldo() * 0.01;
    }
}
