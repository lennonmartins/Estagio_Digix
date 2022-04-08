import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double media;
        int numAlunos;
        String nomeAluno;
        boolean notaInvalida;
        Scanner nota = new Scanner(System.in);

        System.out.println("Informe a quantidade de alunos: ");
        numAlunos = nota.nextInt();
        for (int i = 1; i <= numAlunos; i++) {
            nota.nextLine();
            System.out.println("Informe o nome do aluno: ");
            nomeAluno = nota.nextLine();

            do {
                notaInvalida = false;
                System.out.println("Informe a primeira nota: ");
                nota1 = nota.nextDouble();
                if (nota1 > 10d || nota1 < 0d) {
                    System.out.println("Nota inválida!");
                    notaInvalida = true;
                }
            } while (notaInvalida);

            do {
                notaInvalida = false;
                System.out.println("Informe a segunda nota: ");
                nota2 = nota.nextDouble();
                if (nota2 > 10d || nota2 < 0d) {
                    System.out.println("Nota inválida!");
                    notaInvalida = true;
                }
            } while (notaInvalida);

            // double nota1 = 8.5, nota2 = 5.0, media;
            media = (nota1 + nota2) / 2;
            if (media >= 7) {
                System.out.println(nomeAluno + " aprovado(a) com média: " + media);
            } else {
                System.out.println(nomeAluno + " reprovado(a) com média: " + media);
            }
        }
        nota.close();
    }
}
