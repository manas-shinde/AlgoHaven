package recursion;

public class PrintDecreasing {
    public static void main(String[] args) {
        int n = 5;
        f(n);
    }

    public static void f(int n) {
        if (n == 0) return;
        System.out.println(n);
        f(n - 1);
    }
}
