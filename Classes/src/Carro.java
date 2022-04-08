public class Carro {
    int anoFabricacao;
    String marca;
    Acessorio acessorio;
    String placa;
    String modelo;
    int quantidadePorta;
    String combusivel;
    double quilometragem;
    String cor;
    double preco;

    double calcularValorIpi(double taxa){
        return (this.preco*(taxa/100));
    }

    
}

