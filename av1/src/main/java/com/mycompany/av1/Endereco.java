/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.av1;

/**
 *
 * @author Aluno
 */
public class Endereco {
    protected String logradouro;
    protected String numero;
    protected String complemento;
    protected String cep;
    protected String cidade;
    protected UnidadeFederativa UnidadeFederativa;

    public Endereco(String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa UnidadeFederativa) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.UnidadeFederativa = UnidadeFederativa;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederativa getUnidadeFederativa() {
        return UnidadeFederativa;
    }

    public void setUnidadeFederativa(UnidadeFederativa UnidadeFederativa) {
        this.UnidadeFederativa = UnidadeFederativa;
    }

    @Override
    public String toString() {
        return  "\n logradouro:" + logradouro +
                "\n numero:" + numero +
                "\n complemento:" + complemento +
                "\n cep:" + cep +
                "\n cidade:" + cidade +
                "\n UnidadeFederativa:" + UnidadeFederativa + '}';
    }
    
    
}