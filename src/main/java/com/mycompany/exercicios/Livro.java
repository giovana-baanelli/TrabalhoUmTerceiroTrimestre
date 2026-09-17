package com.mycompany.exercicios;

public class Livro {
    public String titulo;
    public String autor;
    public Integer num_paginas;
    public Float preco;
   
    public Livro(String titulo, String autor, Integer num_paginas, Float preco){
        this.titulo = titulo;
        this.autor = autor;
        this.num_paginas = num_paginas;
        this.preco = preco;
    }
   
    public String exibirDetalhes(){
        return "\nTitulo: " + this.titulo + "\nAutor: " + this.autor + "\nNumero de paginas: " + this.num_paginas + "\npreco: " + this.preco;
    }
   
    public String aplicarDesconto(Double percentual){
        if(percentual >0 && percentual <=50){
            return "\nDesconto aplicado com sucesso! Valor Final: " +(this.preco - (this.preco * percentual / 100));
        }else{
            return "\nDesconto inválido!";
        }
    }
   
}