import Funcionario;
package main;
import clientes.Cliente;
import clientes.Contato;
import clientes.DadosPessoais;
import clientes.Endereco;
import clientes.Estagiario;
import fabricadecarros.Carro;

public class App {
    public static void main(String[] args) throws Exception {
      
      //classe Cachorro    
      /*  Cachorro cachorro = new Cachorro();
      cachorro.pedirCarinho();
      cachorro.rosnar(); */
         
      //classe dados pessoais
      Endereco endereco1 = new Endereco();
      endereco1.rua = "Rua Crisamtemos"; 
      endereco1.numero = "1252" ;
      endereco1.bairro = "Jardim do Olímpo";
      endereco1.cep = "08014-502";

      //Classe contato
      Contato contato1 = new Contato();
      contato1.email = "lennonmcarlos@silva.com";
      contato1.telefone ="1234-5678";

      //C
      DadosPessoais dadosLennon = new DadosPessoais();
      dadosLennon.nome = "Lennon Martins";
      dadosLennon.cpf ="000000000-00";
      dadosLennon.sexo = "M";
      dadosLennon.dataNascimento = "21/05/1995";
      dadosLennon.informarDadosParaContato(contato1);
      dadosLennon.informarEndereco(endereco1);

      Cliente cliente1 = new Cliente();
      cliente1.informarDadosPessoais(dadosLennon);
      cliente1.mostrarDadosPessoais();

      Estagiario estagiario1  = new Estagiario();
      estagiario1.salario = 20000;

      double salarioLiquido = estagiario1.calcularSalarioLiquido();
      System.out.println("Salário com desconto " + salarioLiquido);

      Funcionario funcionario1 = new Funcionario();
      funcionario1.salario = 3500;

      double valorDescontado =funcionario1.calcularSalarioLiquido();
      System.out.println("Sálario com desconto " + valorDescontado);

      Carro classic = new Carro();
      classic.preco = 18000;

      double valorIpi = classic.calcularValorIpi(5.7);
      double precoCarroSemIpi = classic.preco - valorIpi;
      System.out.println("O valor do IPI é de: R$ " + valorIpi);
      System.out.println("O valor do veículo sem o IPI é de: R$ " + precoCarroSemIpi);
    
    }
}
