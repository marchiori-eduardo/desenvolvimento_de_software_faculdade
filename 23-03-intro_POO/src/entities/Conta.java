package entities;

import java.util.Scanner;

public class Conta {
        private String nome;
        private Integer numero;
        private Double limite;
        private Double saldo;

    public Conta() {
    }

    public Conta(String nome, Integer numero, Double limite, Double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.limite = limite;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void saque (double valor){
        if(saldo >= valor && valor > 0){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Saldo atual: " + saldo);
    }

    public Boolean sacarVerifica(double quantidade){
        if (quantidade > this.saldo) {
            return false;
        } else {
            double novoSaldo = this.saldo - quantidade;
            this.saldo = novoSaldo;
            return true;
        }
    }



    public void depositar(double valor ) {
        if (valor >= 0) {
            this.saldo += valor;
            System.out.println("Valor atualizado ");
        } else {
            System.out.println("valor inválido");
        }

    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                ", limite=" + limite +
                ", saldo=" + saldo +
                '}';
    }
}
