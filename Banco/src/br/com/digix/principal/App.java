package br.com.digix.principal;
import java.time.LocalDate;
import java.time.Month;

import br.com.digix.modelo.Cliente;
import br.com.digix.modelo.Conta;
import br.com.digix.modelo.Endereco;

public class App {
    public static void main(String[] args) throws Exception {

        LocalDate dataNascimento = LocalDate.of(1995, Month.MAY, 21);
        Endereco endereco = new Endereco("Rua da Luz","Das Almas", "S/ numero");

        Cliente cliente = new Cliente("Maria das Graças", "017854487-00", dataNascimento, endereco);

        Conta conta = new Conta(cliente, "0001", "01540", "Conta Corrente");
        conta.depositar(50);

        Conta novaConta = new Conta(cliente, "0001", "25413", "Conta Poupança");

        novaConta.depositar(5);

        conta.fazerPix(60, novaConta);
        // System.out.println("Saldo na conta é: " + conta.saldo);
        // System.out.println("Saldo na nova conta é: " + novaConta.saldo);

        /*
         * System.out.println("O seu saldo atual é de: " + conta.saldo);
         * conta.sacar(30);
         * System.out.println("O seu saldo atual é de: " + conta.saldo);
         * 
         * conta.depositar(30);
         * System.out.println("Seu novo saldo é de: " + conta.saldo);
         * 
         * conta.sacar(10);
         * System.out.println("Seu novo saldo é de " + conta.saldo);
         * 
         * conta.depositar(150);
         * System.out.println("Seu novo saldo é de: " + conta.saldo);
         * 
         * conta.depositar(-200);
         * System.out.println("Seu novo saldo é de: " + conta.saldo);
         * 
         * conta.sacar(200);
         * conta.informarConta(1);
         * System.out.println("Sua conta é do tipo " + conta.tipo );
         * 
         * conta.informarConta(3);
         * System.out.println("Sua conta é do tipo " + conta.tipo );
         * 
         * 
         * 
         * /*Cliente cliente = new Cliente();
         * cliente.nomecompleto = "Lennon Martins";
         * cliente.dataNascimento = "21/05/1995";
         * cliente.cpf = "017562322-xx";
         * 
         * Endereco endereco = new Endereco();
         * endereco.rua = "Rua X";
         * endereco.cep = "00000-000";
         * endereco.numero = " 123";
         * endereco.bairro = " Copahsul";
         * cliente.endereco = endereco;
         * 
         * Cliente cliente2 = new Cliente();
         * cliente2.nomecompleto = "Maria Martins";
         * cliente2.dataNascimento = "21/05/1995";
         * cliente2.cpf = "017562322-xx";
         * cliente2.endereco = endereco;
         * 
         * conta.cliente = cliente;
         * 
         * 
         * 
         * System.out.println("o nome do cliente é : " + conta.cliente.nomecompleto);
         * System.out.println("O seu saldo é: " + String.format("%.2f", conta.saldo));
         * System.out.println("O seu endereco é: " + conta.cliente.endereco.rua +
         * conta.cliente.endereco.numero + conta.cliente.endereco.bairro);
         * conta.cliente = cliente2;
         * System.out.println("o nome do cliente é : " + conta.cliente.nomecompleto);
         * System.out.println("O seu saldo é: " + String.format("%.2f", conta.saldo));
         * System.out.println("O seu endereco é: " + conta.cliente.endereco.rua +
         * conta.cliente.endereco.numero + conta.cliente.endereco.bairro);
         */
    }
}
