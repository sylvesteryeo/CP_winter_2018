package pl.waw.sgh;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Test {
    public static void main(String[] args) {
        // bowling pins
        int n = 5;
        int k = 0;
        for (int a = 1; a <= n; a += 1) {
            k += a;
        }
        System.out.println("Number of balls needed is " + k);

        //number of prime numbers to print
        int m = 100;
        int i = 2;
        int counter = 0;
        int largest_prime_number = 0;
        while (i <= m) {
            boolean flag = FALSE;
            if (i > 3) {
                for (int temp = 2; temp <= i / 2; temp++) {
                    if (i % temp == 0) {
                        flag = TRUE;
                        break;
                    }
                }
            }
            if (flag == FALSE) {
                counter++;
                largest_prime_number = i;
            }
            i++;
        }
        System.out.println("Number of prime numbers from 1 to " + m + " is " + counter);
        System.out.println("Largest prime number from 1 to " + m + " is " + largest_prime_number);

        //Fibonacci seq
        int max_steps = 5;
        int answer = 1;
        for (int fib_level = 1; fib_level <= max_steps; fib_level++) {

        }

    }

}
