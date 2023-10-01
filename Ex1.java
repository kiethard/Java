import java.util.*;
public class Ex1 {
    //a
    public static long factorial(int n)
    {
        if (n<0){
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        long result =1;
        for(int i =1; i <=n;i++){
            result *=i;
        }
        return result;
    }
    //b
    public static double power(double x, int n) {
        double result = 1;
        for (int i = 0; i < Math.abs(n); i++) {
            result *= x;
        }
        if (n < 0) {
            result = 1 / result;
        }
        return result;
    }
    //c
    public static int countDigits(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    //d
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    //e
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
