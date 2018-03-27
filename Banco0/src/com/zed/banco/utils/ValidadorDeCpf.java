package com.zed.banco.utils;
public class ValidadorDeCpf {
    
     private final String cpf;
     
    public ValidadorDeCpf(String cpf) throws IllegalAccessError {
        if(ValidaCpf(cpf)) this.cpf = cpf;
        else throw new IllegalAccessError("Erro, Cpf Inválido!");
    }
    
    private boolean ValidaCpf(String cpf){
      if(cpf.length() == 11){
          boolean cpfInvalido = cpf.equals("11111111111")||cpf.equals("22222222222")||cpf.equals("33333333333")||cpf.equals("44444444444")||cpf.equals("55555555555")||cpf.equals("66666666666")||cpf.equals("77777777777")||cpf.equals("88888888888")||cpf.equals("999999999")||cpf.equals("000000000");
          if(!cpfInvalido){
              char[] caracteres = cpf.toCharArray();
              for(int i =0; i < cpf.length(); i++){
                  if(Character.isLetter(caracteres[i]) || Character.isWhitespace(caracteres[i])){
                      return false;
                  }
              }
              
              int[] digitosCpf = new int[cpf.length()];
              for(int i = 0; i < cpf.length(); i++){
                  digitosCpf[i] = Character.getNumericValue(caracteres[i]);
              }
              
              int digito1,digito2;
              digito1 = ObterDigitosVerificadores(ObterSomaDigitosDoCpf(cpf,digitosCpf,1));
              if(digito1 == digitosCpf[9]) {
                digito2 = ObterDigitosVerificadores(ObterSomaDigitosDoCpf(cpf,digitosCpf,0));
              if(digito2 == digitosCpf[10]) return true;
            }
              return false;
        }
          return false;
      }
      return false;
    }
    
    private int ObterSomaDigitosDoCpf(String cpf,int[] digitosCpf,int numero){      
        int soma=0, j = 0;
        for(int i = digitosCpf.length-numero; i > numero && j < 10; i--){
            soma+= digitosCpf[j]*i;
            j++;
        }
        System.out.println(soma);
        return soma;
    }
    private int ObterDigitosVerificadores(int soma){
        int restoDaDivisao = soma%11;
        if(restoDaDivisao < 2) return 0;
        return 11 - restoDaDivisao;
    }
    public String GetCpf(){
        return cpf;
    }
}