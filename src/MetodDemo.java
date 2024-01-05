public class MetodDemo {
    public static int sum(int a, int b) {
        int sum = 0;
        for (int i = a; i < b; i++) {
            sum = i + sum;

        }
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println(sum(1,10));
    }
}
