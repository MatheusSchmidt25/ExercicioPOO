/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;

/**
 *
 * @author aluno
 */
public class ContaBancaria extends ContaCorrente {

    public ContaBancaria(String nome, double saldo, double chequeEspecial) {
        super(nome, saldo, chequeEspecial);
    }

    
    
    public void calcularCheque(){
        chequeEspecial=saldo*saldo;
        System.out.println(chequeEspecial);
    }
    
}
