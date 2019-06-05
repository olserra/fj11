package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    public ContaPoupanca() {
    }

    public String getTipo(){
        return "Conta Poupanca";
    }
}
