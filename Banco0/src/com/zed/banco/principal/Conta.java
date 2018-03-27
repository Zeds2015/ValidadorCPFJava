package com.zed.banco.principal;

import java.util.Objects;

public abstract class Conta {
    private int numero;
    private double saldo,limite;
    private Cliente titular;

    public Conta(int numero, double saldo, Cliente titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public Conta(int numero, double saldo, double limite, Cliente titular) {
        this(numero,saldo,titular);
        this.limite = limite;
    }
    
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }
    
    public boolean sacar(double valor) throws SaldoInsuficienteException{
        if(valor > saldo){
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
        saldo-= valor;
        return true;
    }
    
    public void depositar(double valor) throws IllegalArgumentException{
        if(valor < 0){
            throw new IllegalArgumentException("Deposite um valor positivo, imbecil");
        }
        saldo+= valor;
    }
    
    public void transferir(double valor, Conta outraConta){
        if(sacar(valor)){
            outraConta.depositar(valor);
        }
    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Conta))
            return false;
        return ((Conta)obj).numero == numero && ((Conta)obj).saldo == saldo && 
                ((Conta)obj).limite == limite && ((Conta)obj).titular.equals(titular);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.numero;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.saldo) ^ (Double.doubleToLongBits(this.saldo) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.limite) ^ (Double.doubleToLongBits(this.limite) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.titular);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nNúmero: ").append(numero).
                append("\nSaldo: ").append(saldo).
                append("\nLimite: ").append(limite).
                append("\nInfo do titular: ").append(titular);
        return sb.toString();
    }
}
