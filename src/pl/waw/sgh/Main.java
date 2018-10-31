package pl.waw.sgh;

public class Main {
    public static int sum(int parA, int parB) {
        int sum = parA + parB;
        return sum;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println("sum is " + sum(a, b));
    }
}