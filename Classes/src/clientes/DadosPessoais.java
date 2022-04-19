package clientes;
public class DadosPessoais {
    String nome;
    String dataNascimento;
    String sexo;
    String cpf;
    Contato contato;
    Endereco endereco;

    void informarDadosParaContato(Contato contato){
        this.contato = contato;
    }

    void informarEndereco(Endereco endereco){
        this.endereco = endereco;
    }
}

