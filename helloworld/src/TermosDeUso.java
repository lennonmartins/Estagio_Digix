import java.util.Scanner;

public class TermosDeUso {
    public static void main(String[] args) {
        boolean repostainvalida;
        Scanner leitor = new Scanner(System.in);
        do {
            repostainvalida = false;
            System.out.println("Leia os termos de uso disponível neste link: hhtp://www.facebook.com."
                    + " Você concorda com os termos de uso? (S/N)");
            String resposta = leitor.nextLine();
            // É usado o Equals para poder fazer a comparação entre objetos. Não se pode
            // usar métodos de comparação para não primitivos.
            if (resposta.equals("S") || resposta.equals("s")) {
                System.out.println("Informe seu nome compleo para a licença: ");
                String nomeCompleto = leitor.nextLine();
                System.out.println("Licença concedida para " + nomeCompleto);
                System.out.println("Software instalado com sucesso!");
            } else if (resposta.equals("N") || resposta.equals("n")) {
                System.out.println("Software não instalado!");
            } else {
                System.out.println("Comando inválido!");
                repostainvalida = true;
            }

        } while (repostainvalida);
        leitor.close();
    }
}
