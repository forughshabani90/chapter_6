public class TestReturnGradeMetode {
    public static void main(String[] args) {
        System.out.println(grade(84));

    }

    public static char grade(double score) {
        if (score > 90) {
            return 'A';
        }
        else if (score > 80) {
            return 'B';
        }
        else if (score > 70) {
            return 'C';
        }
        return 0;
    }
}
