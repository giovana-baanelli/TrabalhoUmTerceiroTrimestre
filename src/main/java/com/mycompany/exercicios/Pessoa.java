package com.mycompany.exercicios;
        
public class Pessoa {
    public String nome;
    public Integer idade;
    public Float altura;
    
    public Pessoa(String nome, Integer idade, Float altura){
         this.nome = nome;
         this.idade = idade;
         this.altura = altura;
    }
    public String fazerAniversario(){
        this.idade += 1;
        return "Parabéns! Você está comemorando mais um ano de vida!";
    }
    
    public String exibirDados(){
        return "\nNome: " + this.nome + "\nIdade: " + this.idade + "\nAltura: " + this.altura;
        
        
    }
}
