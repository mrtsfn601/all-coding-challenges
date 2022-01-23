package interview;

/**
 * Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz”
 * instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples
 * of both three and five print “FizzBuzz”.
 */
public class FizzBuzz {

  public static void main(String[] args) {
    fizzBuzz(100);
  }

  private static final String FIZZ = "Fizz";
  private static final String BUZZ = "Buzz";
  private static final String FIZZBUZZ = FIZZ + BUZZ;

  private static void fizzBuzz(int number) {

    for (int i = 1; i <= number; i++) {

      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println(FIZZBUZZ);
      } else if (i % 3 == 0) {
        System.out.println(FIZZ);
      } else if (i % 5 == 0) {
        System.out.println(BUZZ);
      } else {
        System.out.println(i);
      }
    }
  }
}
