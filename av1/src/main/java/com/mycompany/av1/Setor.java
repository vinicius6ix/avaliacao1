
package com.mycompany.av1;


public enum Setor {
    ENGENHARIA ("ENGENHEIRO"),
    SAUDE ("Saúde"),
    JURIDICO ("Juridico"),
    OPERACOES ("Operações");
    
    private final String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public static Setor getENGENHARIA() {
        return ENGENHARIA;
    }

    public static Setor getSAUDE() {
        return SAUDE;
    }

    public static Setor getJURIDICO() {
        return JURIDICO;
    }

    public static Setor getOPERACOES() {
        return OPERACOES;
    }
    
    
}
