// Given a number, check if the number (N) can be written as the form (k+1)*k. Write a java program to print those 
// numbers in the given range.
import java.util.*;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the number:");
        n = sc.nextInt();

        int k = 0;
        int product;

        while ((product = k * (k + 1)) <= n) {
            if (product == n) {
                System.out.println(n + " can be expressed as " + (k + 1) + "*" + k);
                break;
            }
            k++;
        }
    }
}
