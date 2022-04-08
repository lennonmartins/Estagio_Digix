import java.util.Scanner;

public class MediaGasto {
    public static void main(String[] args) {
        // double janeiro= 15000, fevereiro= 23000, marco=17000, mediaTrimestre,
        // gastoTotal;
        double despesaMes;
        int quantidadeMes;
        // double fevereiro;
        // double marco;
        double mediaMensal;
        double gastoTotal = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a quantidade de meses: ");
        quantidadeMes = leitor.nextInt();
        for (int i = 1; i <= quantidadeMes; i++) {
            System.out.println("Informe a despesa do mês: " + i);
            despesaMes = leitor.nextDouble();
            gastoTotal = despesaMes + gastoTotal;
        }
        mediaMensal = gastoTotal / quantidadeMes;
        /*
         * System.out.println("A despesa total foi de: R$ " + gastoTotal +
         * " e a média mensal foi de: R$ " + mediaMensal + " por mês");
         */
        System.out.println("A despesa total foi de: R$ " + String.format("%.2f", gastoTotal)
                + " e a média mensal foi de: R$ " + String.format("%.2f", mediaMensal) + " por mês");

        leitor.close();
    }
}
