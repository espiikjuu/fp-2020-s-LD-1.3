public class Solution {
    static long superDigit(long x) {

        if(x < 0) {
            x *= -1;
        }

        if(x > 9) {
            long l = 0;
            for(char c : String.valueOf(x).toCharArray()) {
                l += Long.parseLong(String.valueOf(c));
            }
            x = l;
            if(x > 9) {
                return superDigit(x);
            } else {
                return x;
            }
        } else {
            return x;
        }

    }

    public static void main(String[] args) {
        System.out.println(Solution.superDigit(9875));
        System.out.println(Solution.superDigit(10));
        System.out.println(Solution.superDigit(5));
        System.out.println(Solution.superDigit(1234567890));
    }
}