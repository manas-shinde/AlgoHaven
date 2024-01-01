package recursion;

public class Pattern4 {
    public static void main(String[] args) {
        f(6, 0);
    }

    public static void f(int n, int row) {
        if (n == 0) return;

        System.out.println((int) Math.pow(11, row));
        f(n - 1, row + 1);
    }
}
