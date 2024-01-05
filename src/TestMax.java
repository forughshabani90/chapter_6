public class TestMax {
    public static int max(int n1, int n2){
        int result=0;
        if (n1>n2)
            result=n1;
        else result=n2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(30,5));
    }
}
