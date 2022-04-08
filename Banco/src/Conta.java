// Essa é a primeira Classe com atributos;
public class Conta {
    double saldo; // atributos da classe
    String tipo;
    String numero;
    String agencia;
    double limite;
    boolean ativa;
    Cliente cliente;

    boolean sacar(double valorDeSaque) {
        double novoSaldo = this.saldo - valorDeSaque;
        if (novoSaldo <= 0) {
            System.out.println("Você não tem saldo insuficiente!");
            return (false);
        } else {
            this.saldo = novoSaldo;
            return (true);
        }
    }

    void depositar(double valorDeDeposito) {
        if (valorDeDeposito <= 0) {
            System.out.println("Valor inválido");
        } else {
            this.saldo += valorDeDeposito;
        }
    }

    void fazerPix(double valorPix, Conta contaDestino) {
        if (this.sacar(valorPix)) {
            contaDestino.depositar(valorPix);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    void informarConta(int tipoConta) {
        if (tipoConta == 1) {
            this.tipo = "Corrente";
        } else if (tipoConta == 2) {
            this.tipo = "Poupança";
        } else {
            System.out.println("Opção inválida!");
        }
    }
}
