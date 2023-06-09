/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.av1;

/**
 *
 * @author Aluno
 */
public class Motoboy extends Funcionario {
    private String cnh;

    public Motoboy(String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n cnh: " + cnh + '}';
    }
    
}
