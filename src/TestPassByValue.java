public class TestPassByValue {
    public static void main(String[] args) {
        System.out.println();
        swap(34,89);

    }
    public static void swap(int n1, int n2) {
        int temp;
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("ni is " + n1);
        System.out.println("n2 is " + n2);
    }
}
