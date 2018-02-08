package Projeto;

public class Cliente {
    private int idade;
    private String nome, endereco;
    private SistemaValidadorDeCpf cpf;
    
    public void SetCpf(String cpf){
        this.cpf = new SistemaValidadorDeCpf(cpf);
    }
    public String GetNome(){
        return nome;
    }
    public int GetIdade(){
        return idade;
    }
    public String GetCpf(){
        return cpf.GetCpf();
    }
}
