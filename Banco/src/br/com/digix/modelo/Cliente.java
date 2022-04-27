package br.com.digix.modelo;
import java.time.LocalDate;

public class Cliente {
    private static int id;
    private String nomeCompleto;
    private String cpf;
    private LocalDate dataNascimento;
    private Endereco endereco;

    public Cliente(String nomeCompleto, String CPF, LocalDate dataNascimento, Endereco endereco) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = CPF;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        Cliente.id++;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getNomecompleto() {
        return nomeCompleto;
    }
    @Override
    public String toString(){
        return "Nome do titular: " + this.getNomecompleto() + " \n" +
               "CPF: " + this.getCpf() + " \n" +
               this.dataNascimento + " \n" +
               this.endereco;
    }

    public static int getId() {
        return id;
    }

}
