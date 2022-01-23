package projecteuler;

/**
 * Smallest multiple
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * Source: https://projecteuler.net/problem=5
 */
public class SmallestMultiple {

    public static void main(String[] args) {
        System.out.println(findSmallestMultiple(1, 20)); // 232792560
    }

    private static int findSmallestMultiple(int beg, int end) {
        int res = end;
        int i = end;

        while(res > 0) {
            if(res % i == 0) {
                if(i == beg) {
                    return res;
                } else i--;
            } else {
                res += end;
                i = end;
            }
        }

        return res;
    }
}
