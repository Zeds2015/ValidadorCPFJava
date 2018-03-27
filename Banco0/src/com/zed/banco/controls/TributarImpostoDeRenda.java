package com.zed.banco.controls;

//puta viagem

import com.zed.banco.principal.ContaPoupanca;
import com.zed.banco.interfaces.ITributavel;

public class TributarImpostoDeRenda implements ITributavel<ContaPoupanca>{
    private static double totalTributado;
    
    @Override
    public void tributarImpostos(ContaPoupanca cp) {
        System.out.println("Tributando imposto...");
        cp.sacar(cp.getSaldo()*0.02);
        totalTributado+= cp.getSaldo()*0.02;
        System.out.println("Imposto tributado");
    }
    public static double getTotalTributado(){
        return totalTributado;
    }
}
