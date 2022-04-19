package main;

import fabricadecarros.Carro;

public class TestaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro("Kwid ", "Renault ", "Branco");
        // carro.setModelo("Kwid ");
        System.out.print(carro.getModelo());
        // carro.setCor("Laranja");
        // carro.setModelo("Renegade ");
        System.out.print(carro.getMarca());

        System.out.println(carro.getCor());

        carro.pintar("Preto");
        carro.pintar("Branco");

        carro.ligar();
        
        carro.acelerar(25);
        carro.acelerar(18);
        
        System.out.println(carro.getVelocidadeAtual());

    }

}
