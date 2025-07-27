import java.util.*;

public class Solution {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);

        int tests = input.nextInt();

        while(tests-- > 0) {
            long a = input.nextLong();
            long b = input.nextLong();
            long k = input.nextLong();

            long movesX = (a + k - 1) / k; 
            long movesY = (b + k - 1) / k;  

            long cost = movesX + movesY - 1;

            System.out.println(cost);
        }

        input.close();
    }
}