import java.util.*;

public class Solution {
    // Contest Div2 108 - A. Difficult Contest
    public static void difficult_contest(String s) {
        StringBuilder t = new StringBuilder();
        StringBuilder not_t = new StringBuilder();

        for(char c: s.toCharArray()) {
            if(c == 'T') { t.append('T'); }
            else { not_t.append(c); }
        }

        System.out.println(
            t.toString() +
            not_t.toString()
        );
    }


    public static void main(String []args) {
        Scanner input = new Scanner(System.in);

        int tests = Integer.parseInt(input.nextLine());
        while(tests-- > 0) {
            String s = input.nextLine().trim();
            difficult_contest(s);
        }

        input.close();
    }

}
