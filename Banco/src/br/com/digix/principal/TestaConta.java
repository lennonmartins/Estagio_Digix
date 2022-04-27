package br.com.digix.principal;
import java.time.LocalDate;
import java.time.Month;

import br.com.digix.modelo.Cliente;
import br.com.digix.modelo.Conta;
import br.com.digix.modelo.Endereco;

public class TestaConta {
    public static void main(String[] args) {

        LocalDate dataNascimento = LocalDate.of(1995, Month.MAY, 21);
        Endereco endereco = new Endereco("Rua da Luz","Das Almas", "S/ numero");

        Cliente cliente = new Cliente("Joao da Luz", "901231456-88", dataNascimento, endereco);
        System.out.println(cliente);

        Conta contaCorrente = new Conta(cliente, "010101", "123456", "Corrente");
        contaCorrente.depositar(100);
        System.out.println(Conta.contador);
        
        System.out.println(contaCorrente.toString());
        
        Conta contaPoupanca = new Conta(cliente, "010101", "123456", "Poupança");
        contaPoupanca.depositar(100);
        System.out.println(Conta.contador);
        
        double rendimentoAbril = contaCorrente.calcularRendimentoMensal(0.1);
        System.out.println("O rendimento de abril é R$ " + rendimentoAbril);
       // System.out.println(contaPoupanca.toString());

    }
}
