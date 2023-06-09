
package com.mycompany.av1;

import java.time.LocalDate;



public abstract class Fisica extends Pessoa {
    
  protected LocalDate dataNascimento;
  protected Genero Genero;

    public Fisica(String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
    }

    public Fisica(LocalDate dataNascimento, Genero Genero, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.dataNascimento = dataNascimento;
        this.Genero = Genero;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return Genero;
    }

    public void setGenero(Genero Genero) {
        this.Genero = Genero;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n dataNascimento: " + dataNascimento +
                "\n  Genero:" + Genero + '}';
    }


  
}
