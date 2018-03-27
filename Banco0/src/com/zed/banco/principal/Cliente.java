package com.zed.banco.principal;

import com.zed.banco.utils.ValidadorDeCpf;
import java.util.Objects;

public class Cliente {
    private String nome;
    private String cpf;
    private int idade;

    public Cliente(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = new ValidadorDeCpf(cpf).GetCpf();
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Cliente))
            return false;
        return nome.equals(((Cliente)obj).nome) && cpf.equals(((Cliente)obj).cpf) && idade == ((Cliente)obj).idade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.cpf);
        hash = 97 * hash + this.idade;
        return hash;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+"\nIdade: "+idade+"\nCpf: "+cpf;
    }
}
