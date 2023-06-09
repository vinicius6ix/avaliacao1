/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.av1;

/**
 *
 * @author Aluno
 */
public class Advogado extends Funcionario {
    private String oab;

    public Advogado(String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return super.toString()+
               "\n oab: " + oab + '}';
    }
    
   
}
