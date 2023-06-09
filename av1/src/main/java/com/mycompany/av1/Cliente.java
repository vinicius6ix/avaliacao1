
package com.mycompany.av1;


public class Cliente extends Fisica {
    private int protocoloAtendimento;

    public Cliente(String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
    }

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return super.toString()+
        "\n protocoloAtendimento=" + protocoloAtendimento + '}';
    }
    
    
}
