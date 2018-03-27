/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zed.banco.controls;

//viagem

import com.zed.banco.principal.ContaCorrente;
import com.zed.banco.interfaces.ITributavel;

public class TributarSeguro implements ITributavel<ContaCorrente>{
    private static double totalTributado;
    @Override
    public void tributarImpostos(ContaCorrente cc) {
        System.out.println("Tributando imposto...");
        cc.sacar(cc.getSaldo()*0.02);
        totalTributado+= cc.getSaldo()*0.02;
        System.out.println("Imposto tributado");
    }

    public static double getTotalTributado() {
        return totalTributado;
    }
}
