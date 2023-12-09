package recursion;

public class PrintIncreasing {
    public static void f(int n) {
        if (n == 0) return;
        f(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 5;
        f(n);
    }
}
