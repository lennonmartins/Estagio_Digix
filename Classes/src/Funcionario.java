import clientes.DadosPessoais;

public class Funcionario {
    DadosPessoais dadosPessoais;
    DadosColaboradorEmpresa dadosEmpresa;
    double salario;

    void informarDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    double calcularSalarioLiquido() {
        double salarioLiquido = 0;
        if (this.salario <= 1903.98) {
            System.out.println("Isento do desconto!");
        } else {
            salarioLiquido = this.salario - (this.salario * (7.5 / 100));
        }
        return (salarioLiquido);
    }

}
