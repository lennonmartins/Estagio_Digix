public class SwitchCase {
    public static void main(String[] args) {
        String fruta = "Mangas";
        switch (fruta) {
            case "Laranjas":
              System.out.println("Laranjas $0.59 a unidade.");
              break;
            case "Mangas":
            case "Mamoes":
            System.out.println("Mangas e Mamões são $2.79 a unidade.");
              // expected output: "Mangoes and papayas are $2.79 a pound."
              break;
            default:
             System.out.println("Desculpe, estamos sem " + fruta + " no momento.");
    }
}
}