public class Test {
    public static void main(String[] args) {
        nPrintLn("aaaaaa", 5);
    }

    public static void nPrintLn(String message, int n) {
        n = 1;
        for (int i = 0; i < n; i++)
            System.out.println(message);
    }
}
