/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.av1;

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {
    BAHIA("BAHIA", "BA"),
    RIO_DE_JANEIRO("Rio de Janeiro",  "RJ"),
    SAO_PAULO( "São Paulo",  "SP");
   
    private final String nome;
    private final String sigla;

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public static UnidadeFederativa getBAHIA() {
        return BAHIA;
    }

    public static UnidadeFederativa getRIO_DE_JANEIRO() {
        return RIO_DE_JANEIRO;
    }

    public static UnidadeFederativa getSAO_PAULO() {
        return SAO_PAULO;
    }

            
}
