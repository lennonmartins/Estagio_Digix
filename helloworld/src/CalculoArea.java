public class CalculoArea {
    public static void main(String[] args) {
        double raio, area, pi = 3.14159;
        raio = 10;
        //area = pi*(raio*raio);
        area = pi*Math.pow(raio, 2);
        System.out.println("O valor da área da circunferência é igual a: " + area);

    }
}
