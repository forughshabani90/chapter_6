public class VarArgsDemo {
    public static void main(String[] args) {
        printMax(34,3,3,2,56.5);
        printMax(new double[]{1,2,3});

    }
    public static void printMax(double...numbers) {
        if (numbers.length == 0)
            System.out.println(" no argument passed");

        double result=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > result)
               result =numbers[i];
        }
            System.out.println("the max value is" + result);


    }
}
