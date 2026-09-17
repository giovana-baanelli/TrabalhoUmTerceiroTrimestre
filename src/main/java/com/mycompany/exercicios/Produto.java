package com.mycompany.exercicios;

public class Produto {
    public String nome;
    public Float preco;
    public Integer quantidadeEstoque;
   
    public Produto(String nome, Float preco, Integer quantidadeEstoque){
    this.nome = nome;
    this.preco = preco;
    this.quantidadeEstoque = quantidadeEstoque;
    }

    public String adicionarEstoque(Integer quantidade){
        if(quantidade >0){
            this.quantidadeEstoque += quantidade;
            return "\nEstoque atualizado com sucesso!";
           }else{
            return "\nValor inválido!";  
        }
     }
   
    public String vender(Integer quantidade){
        if(quantidade <0){
            return "\nValor não encontrado no estoque, digite um valor válido!";
        }else{
            this.quantidadeEstoque -= quantidade;
            return "\nValor encontrado no estoque!";
        }
    }  
   
    public Float calcularValorEstoque(){
        return this.quantidadeEstoque * this.preco;
    }
   
    public String exibirResumo(){
        return "\nNome: " + this.nome + "\nPreço: " + this.preco + "\nQuantidade no estoque: " + this.quantidadeEstoque;

    }
}