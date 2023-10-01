import java.util.*;
public class TestEx1 {

    public static void main(String[] args) {
        int n = 5;
        long factorialResult = Ex1.factorial(n);
        System.out.println("Factorial of " + n + " is: " + factorialResult);

        double x = 2.0;
        int exponent = 3;
        double powerResult = Ex1.power(x, exponent);
        System.out.println(x + " raised to the power of " + exponent + " is: " + powerResult);

        int number = 6543123;
        int digitCount = Ex1.countDigits(number);
        System.out.println("Number of digits in " + number + " is: " + digitCount);

        int primeNumber = 18;
        boolean isPrime = Ex1.isPrime(primeNumber);
        System.out.println(primeNumber + " is prime: " + isPrime);

        int num1 = 43;
        int num2 = 12;
        int gcdResult = Ex1.gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcdResult);
    }
}
