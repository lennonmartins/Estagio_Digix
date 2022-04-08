public class Estagiario {
    DadosPessoais dadosPessoais;
    double salario;
    String matricula;

    void informarDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    void mostrarDadosPessoais() {
        if (this.dadosPessoais != null) {
            System.out.println("Nome: " + dadosPessoais.nome);
            System.out.println("CPF: " + dadosPessoais.cpf);
            System.out.println("Data de Nascimento: " + dadosPessoais.dataNascimento);
            System.out.println("Sexo: " + dadosPessoais.sexo);
            System.out.println("E-mail: " + this.dadosPessoais.contato.email);
            System.out.println("Telefone: " + this.dadosPessoais.contato.telefone);
            System.out.println(
                    "Endereço: " + this.dadosPessoais.endereco.rua + ", " + this.dadosPessoais.endereco.numero + " - "
                            + this.dadosPessoais.endereco.bairro + ", " + "CEP " + this.dadosPessoais.endereco.cep);

        } else {
            System.out.println("O cliente ainda não possui dados pessoais.");
        }
    }
     
    double calcularSalarioLiquido(){
        double salarioLiquido =0;
       if(this.salario <= 1903.98){
            System.out.println("Isento do desconto");
       } else {
            salarioLiquido = this.salario - (this.salario*0.0075); 
       }
       return(salarioLiquido);
    }
}
