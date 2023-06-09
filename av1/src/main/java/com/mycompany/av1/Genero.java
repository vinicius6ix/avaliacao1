/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.av1;

/**
 *
 * @author Aluno
 */
public enum Genero {
    MASCULINO ("Masculino", "M"),
    FEMININO ("FEMININO", "F");
    
    private final String texto;
    private final String caracter;

    private Genero(String texto, String caracter) {
        this.texto = texto;
        this.caracter = caracter;
    }

    public static Genero getMASCULINO() {
        return MASCULINO;
    }

    public static Genero getFEMININO() {
        return FEMININO;
    }

    
     
     
}
