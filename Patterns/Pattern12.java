package Patterns;
import java.util.Scanner;
public class Pattern12 {
    /*
     * 1. You are given a number n.
     * 2. You've to create a pattern as shown in output format.
     * 
     * Constraints
     * 1 <= n <= 5
     * 
     * Format
     * Input
     * A number n
     * 
     * Output
     * pat121
     * 
     * Example
     * Sample Input
     * 
     * 5
     * 
     * Sample Output
     * 0
     * 1 1
     * 2 3 5
     * 8 13 21 34
     * 55 89 144 233 377
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int first = 0, second = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1 ; j<= i; j++){
                System.out.print(first+"\t");
                int temp = second;
                second = first+second;
                first = temp;
            }
            System.out.print("\n");
        }
    }
}
