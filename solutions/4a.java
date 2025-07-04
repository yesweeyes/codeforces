import java.util.*;
import java.math.*;

public class Solution {
    // 4A Watermelon problem
    public static String watermelon_problem(int w) {
        // input: w, integer (1 <= w <= 100)
        // output: YES, NO

        String no = "NO";
        String yes = "YES";
        
        if(w <= 3)
            return no;

        if(w % 2 == 1)
            return no;

        return yes;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();

        String res = Solution.watermelon_problem(w);
        System.out.print(res);

        sc.close();
    }
}