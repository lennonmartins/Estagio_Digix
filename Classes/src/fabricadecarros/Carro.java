package fabricadecarros;

public class Carro {

    private int anoFabricacao;
    private String marca;
    // Acessorio acessorio;
    private String placa;
    private String modelo;
    private int quantidadePorta;
    private String combusivel;
    private double quilometragem;
    private String cor;
    private boolean ligado = false;
    private int velocidadeAtual;

    public Carro(String modelo, String marca, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;

    }

    public void ligar() {
        if (!this.isLigado()) {
            this.ligado = true;
            System.out.println("Carro ligado!");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (this.isLigado()) {
            this.ligado = false;
            System.out.println("Carro desligado!");
        } else {
            System.out.println("O carro já esta desligado.");
        }
    }

    public void acelerar(int velocidadeAlvo) {
        this.velocidadeAtual = velocidadeAlvo;
    }

    public int pegarMarcha() {
        if (this.velocidadeAtual <= 0) {
            return 0;
        }
        if (this.velocidadeAtual >= 0 && this.velocidadeAtual <= 15) {
            return 1;
        }
        if (this.velocidadeAtual > 15 && this.velocidadeAtual <= 30) {
            return 2;
        }
        return 3;
    }

    public boolean isLigado() {
        return this.ligado;
    }

    public void pintar(String novaCor) {
        if (novaCor.equals(this.cor))
            this.cor = novaCor;
        else
            System.out.println("Não pode pintar de cor diferente de " +  this.cor);
    }

    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public String getMarca() {
        return this.marca;
    }

}
