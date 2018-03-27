package com.zed.banco.principal;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, double saldo, Cliente titular) {
        super(numero, saldo, titular);
    }

    public ContaPoupanca(int numero, double saldo, double limite, Cliente titular) {
        super(numero, saldo, limite, titular);
    }

    @Override
    public boolean sacar(double valor) throws SaldoInsuficienteException {
        return super.sacar(valor*1.05); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void depositar(double valor) throws IllegalArgumentException {
        super.depositar(valor-1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void transferir(double valor, Conta outraConta) {
        sacar(20);
        super.transferir(valor, outraConta); //To change body of generated methods, choose Tools | Templates.
    }
}
