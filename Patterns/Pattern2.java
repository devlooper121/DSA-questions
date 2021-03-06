package Patterns;
import java.util.Scanner;
public class Pattern2 {
    /*
     * 1. You are given a number n.
     * 2. You've to create a pattern of * and separated by tab as shown in output
     * format.
     * 
     * Constraints
     * 1 <= n <= 100
     * 
     * Format
     * Input
     * A number n
     * 
     * Output
     * pat21
     * 
     * Example
     * Sample Input
     * 
     * 5
     * 
     * Sample Output
     * 
     *    =>  * * * *
     *    =>  * * *
     *    =>  * *
     *    =>  *
     *
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        // write ur code here
        for(int i = n; i > 0 ; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
