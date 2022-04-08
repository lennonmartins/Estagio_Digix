public class Cachorro {
    Pessoa tutor;
    String raca;
    int idade;
    Vacina vacinas;
    String sexo;
    String nomePet;
    String porte;
    String pelagem;
    boolean castrado;
    boolean adestrado;


void rosnar(){
    System.out.println("Grrrr!!");
}
void latir(){
    System.out.println("Wolf");
}
void pedirCarinho(){
    this.latir();
    this.latir();
}
}