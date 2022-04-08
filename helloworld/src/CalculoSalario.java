public class CalculoSalario {
    public static void main(String[] args) {
        double valorHora, inss, salarioBruto, salarioLiquido, desconto;
        int numeroHoras;

        inss = 0.14;
        valorHora = 25;
        numeroHoras = 144;
        salarioBruto = valorHora * numeroHoras;
        desconto = salarioBruto * inss;
        salarioLiquido = salarioBruto - desconto;
        System.out.println("O valor do desconto foi de: R$ " + desconto);
        System.out.println("O salário final será de: R$ " + salarioLiquido);
    }
}
