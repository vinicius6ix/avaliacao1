/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.av1;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario extends Fisica {
 protected String cpf;
 protected String rg;
 protected String matricula;
 protected Setor setor;
 protected Double salario;

    public Funcionario(String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
    }

    public Funcionario(String cpf, String rg, String matricula, Setor setor, Double salario, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.setor = setor;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    

    @Override
    public String toString() {
        return super.toString()+
                "\n cpf: " + cpf +
                "\n rg: " + rg +
                "\n matricula: " + matricula +
                "\n setor: " + setor +
                "\n salario: " + salario + '}';
    }

}
