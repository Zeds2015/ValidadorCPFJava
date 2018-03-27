package com.zed.banco.principal;

public class ContaCorrente extends Conta{
    
    public ContaCorrente(int numero, double saldo, Cliente titular) {
        super(numero, saldo, titular);
    }
    public ContaCorrente(int numero, double saldo,double limite,Cliente titular){
        super(numero,saldo,limite,titular);
    }

    @Override
    public boolean sacar(double valor) throws SaldoInsuficienteException {
        return super.sacar(valor*1.02); 
    }

    @Override
    public void depositar(double valor) throws IllegalArgumentException {
        super.depositar(valor-0.50); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void transferir(double valor, Conta outraConta) {
        super.transferir(valor+2, outraConta); 
    }
}
