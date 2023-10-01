import java.util.*;
public class Ex2 {
    //a
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    //b
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1 / (x * power(x, -n - 1));
        }
        return x * power(x, n - 1);
    }
    //c
    public static int countDigits(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }
        if (number == 0) {
            return 0;
        }
        return 1 + countDigits(number / 10);
    }
    //d
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
