public class App {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();
        conta.agencia = "0001";
        conta.ativa = true;
        conta.tipo = "Conta Corrente";
        conta.numero = "01540";
        conta.limite = 600;
        conta.depositar(50);
        
        Conta novaConta = new Conta();
        novaConta.agencia = "0001";
        novaConta.ativa = true;
        novaConta.tipo = "Conta Poupança";
        novaConta.tipo = "25413";
        novaConta.limite = 500;
        novaConta.depositar(5);

        conta.fazerPix(60, novaConta);
        System.out.println("Saldo na conta é: " + conta.saldo);
        System.out.println("Saldo na nova conta é: " + novaConta.saldo);

       /* 
        System.out.println("O seu saldo atual é de: " +  conta.saldo);
        conta.sacar(30);
        System.out.println("O seu saldo atual é de: " +  conta.saldo);
        
        conta.depositar(30);
        System.out.println("Seu novo saldo é de: " + conta.saldo);
        
        conta.sacar(10);
        System.out.println("Seu novo saldo é de " + conta.saldo);

        conta.depositar(150);
        System.out.println("Seu novo saldo é de: " + conta.saldo);

        conta.depositar(-200);
        System.out.println("Seu novo saldo é de: " + conta.saldo);

        conta.sacar(200);
        conta.informarConta(1);
        System.out.println("Sua conta é do tipo " + conta.tipo );

        conta.informarConta(3);
        System.out.println("Sua conta é do tipo " + conta.tipo );


        
        /*Cliente  cliente = new Cliente();
        cliente.nomecompleto = "Lennon Martins";
        cliente.dataNascimento = "21/05/1995";
        cliente.cpf = "017562322-xx";

        Endereco endereco = new Endereco();
        endereco.rua = "Rua X";
        endereco.cep = "00000-000";
        endereco.numero = " 123";
        endereco.bairro = " Copahsul";
        cliente.endereco = endereco;
        
        Cliente  cliente2 = new Cliente();
        cliente2.nomecompleto = "Maria Martins";
        cliente2.dataNascimento = "21/05/1995";
        cliente2.cpf = "017562322-xx";
        cliente2.endereco = endereco;

        conta.cliente = cliente;
       
 

        System.out.println("o nome do cliente é : " + conta.cliente.nomecompleto);
        System.out.println("O seu saldo é: " + String.format("%.2f", conta.saldo));
        System.out.println("O seu endereco é: " + conta.cliente.endereco.rua + conta.cliente.endereco.numero + conta.cliente.endereco.bairro);
        conta.cliente = cliente2;
        System.out.println("o nome do cliente é : " + conta.cliente.nomecompleto);
        System.out.println("O seu saldo é: " + String.format("%.2f", conta.saldo));
        System.out.println("O seu endereco é: " + conta.cliente.endereco.rua + conta.cliente.endereco.numero + conta.cliente.endereco.bairro);*/
    }
}
