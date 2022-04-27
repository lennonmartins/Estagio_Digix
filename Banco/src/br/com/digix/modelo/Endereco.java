package br.com.digix.modelo;
public class Endereco {
    private String rua;
    private String cep;
    private String bairro;
    private String numero;
    
    public Endereco(String rua, String bairro, String numero){
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }

    @Override
    public String toString(){
        return this.rua + " " + this.bairro + " " + this.numero;
    }
}

