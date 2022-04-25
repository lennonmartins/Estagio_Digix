public class TestaConta {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nomecompleto = "Joao da Luz";

        Data hoje = new Data();
        hoje.dia = 25;
        hoje.mes = 4;
        hoje.ano = 2022;

        Conta contaCorrente = new Conta();
        contaCorrente.agencia = "010101";
        contaCorrente.numero = "123456";
        contaCorrente.ativa = true;
        contaCorrente.cliente = cliente;
        contaCorrente.dataDeAbertura = hoje;
        contaCorrente.saldo = 100;
        contaCorrente.limite = 300;
        contaCorrente.tipo = "Corrente";

        double rendimentoAbril = contaCorrente.calcularRendimentoMensal(0.1);
        System.err.println("O rendimento de abril é R$ " + rendimentoAbril);

        System.out.println(contaCorrente.recuperarDadosParaImpressao());

        Conta contaPoupanca = new Conta();
        contaPoupanca.agencia = "010101";
        contaPoupanca.numero = "123456";
        contaPoupanca.ativa = true;
        contaPoupanca.cliente = cliente;
        contaPoupanca.dataDeAbertura = hoje;
        contaPoupanca.saldo = 100;
        contaPoupanca.limite = 0;
        contaPoupanca.tipo = "Corrente";

        if (contaCorrente == contaPoupanca) {
            System.out.println("Contas iguais!");
        } else {
            System.out.println("Contas diferentes!");
        }

    }
}
