import java.util.*;

public class primeFactor {
    /*
     * 1. You are required to display the prime factorization of a number.
     * 2. Take as input a number n.
     * 3. Print all its prime factors from smallest to largest.
     * 
     * Constraints
     * 2 <= n < 10 ^ 9
     * 
     * Format
     * Input
     * n, an integer
     * 
     * Output
     * p1 p2 p3 p4.. all prime factors of n
     * 
     * Example
     * Sample Input
     * 
     * 1440
     * 
     * Sample Output
     * 2 2 2 2 2 3 3 5
     */
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if (n > 1)
            System.out.print(n + " ");

    }
}