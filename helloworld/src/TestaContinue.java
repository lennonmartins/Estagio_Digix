public class TestaContinue {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 100; i++) {
            if (i > 50 && i < 60) {
                continue;
            }
        System.out.println(i);
        }
        System.out.println(j);
    }
}
