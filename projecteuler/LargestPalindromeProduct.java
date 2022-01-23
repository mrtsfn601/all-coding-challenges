package projecteuler;

/**
 * Largest Palindrome Product
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * Source: https://projecteuler.net/problem=4
 */
public class LargestPalindromeProduct {

    private static final int MAX = 999;
    private static final int MIN = 100;

    public static void main(String[] args) {
        System.out.println(findLargestPalindromeProduct()); // 906609
    }

    // brute force:
    // 1st solution
    // smallest combination 100 x 100
    // largest combination 999 x 999 (i x j)
    // let's start from largest combination
    // if the product is not palindrome then decrement (i--)
    // what if largest palindrome not 100 x 999 but 998 x 998

    // 2nd solution
    // the largest product of the largest 3-digit combination is
    // 999 x 999 = 998001 maxProduct
    // 100 x 100 = 10000 minProduct
    // while (maxProduct >= minProduct)
    //      a = product / b
    //      if (a >)
    //      if (isPalindrome(product) &&
    //          product % i == 0 &&
    //          product / i >= 100 &&
    //          product / i <= 999) {
    //          return product;
    //      else if product % i == o then
    // maxProduct--;
    private static int findLargestPalindromeProduct() {
        int maxProd = MAX * MAX;
        int minProd = MIN * MIN;

        while (maxProd >= minProd) {
            for (int i = MAX; i >= MIN; i--) {
                if (maxProd % i == 0) {
                    int j = maxProd / i;
                    if (isPalindrome(maxProd) && isInRange(i) && isInRange(j)) {
                        return maxProd;
                    } else {
                        break;
                    }
                }
            }
            maxProd--;
        }
        return -1;
    }

    private static boolean isInRange(int num) {
        return num >= MIN && num <= MAX;
    }

    private static boolean isPalindrome(int num) {
        String number = "" + num;
        return number.equals(new StringBuilder(number).reverse().toString());
    }
}
