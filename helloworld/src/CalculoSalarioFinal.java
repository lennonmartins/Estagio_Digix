import java.util.Scanner;

public class CalculoSalarioFinal {
    public static void main(String[] args) {
        int tempoEmpresa;
        int idade;
        int quantidadeFilhos;
        double salBase;
        double salFinal;
        double bonusTempoEmpresa;
        double bonusDependente;
        double bonuIdade;
        Scanner leitor = new Scanner(System.in);
       
        System.out.println("Informe o tempo de empresa: ");
        tempoEmpresa = leitor.nextInt();
        System.out.println("Informe a idade do colaborador : ");
        idade = leitor.nextInt();
        System.out.println("Informe a quantidade de dependentes : ");
        quantidadeFilhos = leitor.nextInt();
        System.out.println("Informe o salário base do colaborador: ");
        salBase = leitor.nextDouble();

        if (tempoEmpresa > 5 ) {
            bonusTempoEmpresa = salBase*((3/100)*(tempoEmpresa-5));
        } else {
            bonusTempoEmpresa = salBase*0.005;
        }
        System.out.println("O bônus por tempo de casa do colaborador é de: R$ " + String.format("%.2f", bonusTempoEmpresa));
    }
}