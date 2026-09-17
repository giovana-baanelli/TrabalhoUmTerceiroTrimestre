package com.mycompany.exercicios;

public class CarteiraDigital {
    public String titular;
    public Double saldo;
    public Integer numeroTransacoes;

    public CarteiraDigital(String titular, Double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.numeroTransacoes = 0;
    }

    public String receber(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            this.numeroTransacoes++;
            return "\nRecebimento realizado com sucesso!";
        } else {
            return "\nValor de recebimento inválido!";
        }
    }

    public String pagar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            this.numeroTransacoes++;
            return "\nPagamento realizado com sucesso!";
        } else {
            return "\nPagamento não realizado: saldo insuficiente ou valor inválido!";
        }
    }

    public Double consultarSaldo() {
        return this.saldo;
    }

    public String exibirExtrato() {
        return "\nTitular: " + this.titular +
               "\nSaldo Atual: R$ " + this.saldo +
               "\nTotal de Transações: " + this.numeroTransacoes;
    }
}