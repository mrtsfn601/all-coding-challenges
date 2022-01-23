package projecteuler;

/**
 * Largest Prime Factor
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * Source: https://projecteuler.net/problem=3
 */
public class LargestPrimeFactor {

    private static int count = 0;

    public static void main(String[] args) {
        System.out.println(findLargestPrimeFactor(24));
        System.out.println(findLargestPrimeFactor(13195));
        System.out.println(findLargestPrimeFactor(600_851_475_143L)); // 6857
    }

    // take a num and divide it by i
    // where i is 2 with incrementing value ++
    // if evenly divided then new num is num = num / 2
    // else i++ and try to divide it again

    private static long findLargestPrimeFactor(long num) {
        long end = setEnd(num); // optimization

        for (long i = 2; i < end; i++) {
            if (num % i == 0) {
                num = num / i;
                i--; // optimization (before was i = 1;)
                end = setEnd(num); // optimization
            }
        }
        return num;
    }

    // optimization - cuts iterations by 3
    private static long setEnd(long num) {
        return num > 10 ? (long) Math.sqrt(num) : num;
    }
}
