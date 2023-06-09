/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.av1;

/**
 *
 * @author Aluno
 */
public class Medico extends Funcionario {
    private String crn;

    public Medico(String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n crn: " + crn + '}';
    }

    
}
