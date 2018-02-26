// My solution to the HackerRank.com problem "Extra Long Factorials."
// https://www.hackerrank.com/challenges/extra-long-factorials/problem

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorialsApp {
    static void extraLongFactorials(int n) {
        // Complete this function
        BigInteger factorial = new BigInteger("1");
        for (int i = 2; i <= n; i++)
            factorial = factorial.multiply(BigInteger.valueOf(i));
 
        System.out.print("The factorial of "+n+" is: "+factorial);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any natural number n, 1 - 100: ");
        int n = in.nextInt();
        extraLongFactorials(n);
        in.close();
    }
}
