package projecteuler;

/**
 * Multiple of 3 and 5 If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5
 * below 1000. Source: https://projecteuler.net/problem=1
 *
 * <p>Natural number is an integer greater than 0. Natural numbers begin at 1 and increment to
 * infinity: 1, 2, 3, 4, 5, etc. Natural numbers are also called "counting numbers" because they are
 * used for counting. In computer science, natural numbers are commonly used when incrementing
 * values
 */
public class MultiplesOf3And5 {

  // solution with loops
  public static int multiplesOf3And5(final int limit) {
    int sum = 0;

    // add all numbers that are multiples of 3 AND are NOT multiples of 5
    for (int i = 3; i < limit; i += 3) {
      if (i % 5 != 0) {
        sum += i;
      }
    }

    // add all numbers that are multiples of 5 AND 3
    for (int i = 5; i < limit; i += 5) {
      sum += i;
    }

    return sum;
  }

  // optimized solution - with arithmetic series:
  // https://en.wikipedia.org/wiki/Arithmetic_progression#Sum
  // for the formula we need to know first and last number in the progression
  public static int multiplesOf3And5_arithmeticSeries(final int limit) {
    int a = 3;
    int b = 5;
    int ab = a * b;
    int sum = 0;
    int last = 0;

    // include all numbers that are multiples of 3
    last = findLast(a, limit); // 999 (for limit 1_000)
    sum += (last / a * (a + last) / 2);

    // include all numbers that are multiples of 5
    last = findLast(b, limit); // 995 (for limit 1_000)
    sum += (last / b * (b + last) / 2);

    // FYI, numbers that are multiples of 3 AND 5 were included 2 times
    last = findLast(ab, limit); // 990 (for limit 1_000)
    sum -= (last / ab * (ab + last) / 2);

    return sum;
  }

  private static int findLast(int n, int limit) {
    for (int i = limit - 1; i > 0; i--) {
      if (i % n == 0) {
        return i;
      }
    }
    return 0;
  }
}
