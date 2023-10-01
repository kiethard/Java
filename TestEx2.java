public class TestEx2 {

    public static void main(String[] args) {

            int n = 5;
            long factorialResult = Ex2.factorial(n);
            System.out.println("Factorial of " + n + " is: " + factorialResult);

            double x = 2.0;
            int exponent = 3;
            double powerResult = Ex2.power(x, exponent);
            System.out.println(x + " raised to the power of " + exponent + " is: " + powerResult);

            int number = 12345;
            int digitCount = Ex2.countDigits(number);
            System.out.println("Number of digits in " + number + " is: " + digitCount);

            int num1 = 48;
            int num2 = 36;
            int gcdResult = Ex2.gcd(num1, num2);
            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcdResult);
        }

}
