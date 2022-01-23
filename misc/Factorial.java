package misc;

/**
 * In math, the factorial of a positive integer n, denoted by n! is the product of all integers less
 * than or equal to n. Calculate factorial and output result to the console. ex: 5! = 5 * 4 * 3 * 2
 * * 1 Enter a number: 5 Factorial result: 120
 *
 * <p>Wiki: https://en.wikipedia.org/wiki/Factorial
 */
public class Factorial {

  // implementation with for loop
  public static long factorify1(long number) {

    if (number < 0) {
      return -1;
    } // negative number
    if (number <= 1) {
      return 1;
    } // number is 0 or 1

    long result = 1;

    // (result * 2) + (result * 3) + ... + (result * number)
    for (long i = 2; i <= number; i++) {
      result = Math.multiplyExact(result, i); // multiplyExact to handle long overflow
    }

    // OR squashed for-loop
    // for (long i = 2; i <= number; result = Math.multiplyExact(result, i++)) {}

    return result;
  }

  // implementation with while-loop
  public static long factorify2(long number) {

    if (number < 0) {
      return -1;
    } // negative number
    if (number <= 1) {
      return 1;
    } // number is 0 or 1

    long result = 1;

    // (result * number) + (result * number-1) + ... + (result * 2)
    while (number > 1) {
      result = Math.multiplyExact(result, number--); // multiplyExact to handle long overflow
    }

    return result;
  }

  // implementation with recursion
  public static long factorify3(long number) {
    if (number <= 1) {
      if (number == 1) {
        return number;
      } // recursion exit condition
      if (number == 0) {
        return 1;
      } // if original number is 0
      return -1; // if original number is negative
    }

    // this recursion is not protected from stack overflow
    return Math.multiplyExact(
        number, factorify3(number - 1)); // multiplyExact to handle long overflow
  }

  // implementation with recursion and ternary operator
  public static long factorify4(long number) {

    // this recursion is not protected from stack overflow
    return (number > 1)
        ? Math.multiplyExact(number, factorify4(number - 1))
        : (number == 1) ? number : (number == 0) ? 1 : -1;
  }
}
