public class TestVoidMetod {
    public static void main(String[] args) {
        System.out.println();
        printGrade(85);
    }
    public static void printGrade(double score) {
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");

        }


    }
}
