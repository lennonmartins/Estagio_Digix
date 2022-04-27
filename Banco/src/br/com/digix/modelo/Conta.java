package br.com.digix.modelo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Essa é a primeira Classe com atributos;
public class Conta {
    private double saldo; // atributos da classe
    private String tipo;
    private String numero;
    private String agencia;
    private double limite;
    private boolean ativa;
    private Cliente cliente;
    private LocalDateTime dataDeAbertura;
    public static int contador;
    private static int id;

    public Conta(Cliente cliente, String agencia, String numero, String tipo) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.numero = numero;
        this.tipo = tipo;
        this.limite = 0;
        this.saldo = 0;
        this.ativa = true;
        this.dataDeAbertura = LocalDateTime.now();
        Conta.contador++;
        Conta.id++;
    }

    Conta(Cliente cliente, String agencia, String numero, String tipo, double limite) {
        this(cliente, agencia, numero, tipo);
        this.limite = limite;

    }

    private  void mensagemSaldoInsuficiente() {
        System.out.println("Você não tem saldo insuficiente!");
    }

    public boolean sacar(double valorDeSaque) {
        double novoSaldo = this.saldo - valorDeSaque;
        if (novoSaldo <= 0) {
            mensagemSaldoInsuficiente();
            return (false);
        } else {
            this.saldo = novoSaldo;
            return (true);
        }
    }

    public void depositar(double valorDeDeposito) {
        if (valorDeDeposito <= 0) {
            System.out.println("Valor inválido");
        } else {
            this.saldo += valorDeDeposito;
        }
    }

    public void fazerPix(double valorPix, Conta contaDestino) {
        if (this.sacar(valorPix)) {
            contaDestino.depositar(valorPix);
        } else {
            mensagemSaldoInsuficiente();
        }
    }

    public void informarConta(int tipoConta) {
        if (tipoConta == 1) {
            this.tipo = "Corrente";
        } else if (tipoConta == 2) {
            this.tipo = "Poupança";
        } else {
            System.out.println("Opção inválida!");
        }
    }

    public double calcularRendimentoMensal(double taxa) {
        return this.saldo * taxa;
    }

    public void aumentarLimite(double valor) {
        this.limite += valor;
    }

    public static int getTotaldeContas() {
        return Conta.contador;
    }

    public String getAgencia() {
        return agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getDataDeAbertura() {
        return dataDeAbertura;
    }

    public double getLimite() {
        return limite;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo + this.getLimite();
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public static int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Nome do titular: " + this.cliente.getNomecompleto() + "\n" +
                "AG: " + this.agencia + "\n" +
                "CC: " + this.numero + "\n" +
                "Data de abertura: " + this.dataDeAbertura.format(DateTimeFormatter.ofPattern("dd/mm/yyyy")) + "\n" +
                "Saldo R$ " + String.format("%.2f", this.saldo) + "\n" +
                "Tipo: " + this.tipo;
    }

}
