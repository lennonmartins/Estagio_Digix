public class DoWhile {
    public static void main(String[] args) {
        int i = 0;
        int resultado;
        while ( i < 10){
            resultado = i*i;
            System.out.println(resultado);
            i++;
        }
        do {
            resultado = i*i;
            System.out.println(resultado);
            i++;
        } while (i < 10);
    }
}
