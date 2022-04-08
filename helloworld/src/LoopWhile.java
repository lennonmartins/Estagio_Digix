public class LoopWhile {
    public static void main(String[] args) {
        int idade =15;
        while (idade < 18) {
            System.out.println("Você tem " + idade + " anos! ainda não tem permissão para entrar!");
            idade = idade +1;
        }
        System.out.println("Você pode entrar");
    }
}
