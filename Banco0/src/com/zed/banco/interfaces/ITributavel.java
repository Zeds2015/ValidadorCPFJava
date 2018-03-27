package com.zed.banco.interfaces;

import com.zed.banco.principal.Conta;

@FunctionalInterface
public interface ITributavel<T extends Conta> {

    void tributarImpostos(T conta);
}
