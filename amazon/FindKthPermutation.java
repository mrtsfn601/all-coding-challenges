package amazon;

import java.util.ArrayList;
import java.util.List;

/**
 * Find Kth permutation
 * Given a set of ‘n’ elements, find their Kth permutation. Consider the following set of elements:
 * 1234
 * Source: https://www.educative.io/blog/crack-amazon-coding-interview-questions
 */
class FindKthPermutation {

    public static void main(String[] args) {
        for (int i = 1; i <= factorial(4); i++) {
            System.out.println(i + "th permutation = \t" + getPermutation(4, i));
        }
    }

    static String getPermutation(int n, int k) {
        List<Character> v = new ArrayList<>();
        char c = '1';
        for (int i = 1; i <= n; ++i) {
            v.add(c);
            c++;
        }

        StringBuilder result = new StringBuilder();
        findKthPermutation(v, k, result);
        return result.toString();
    }

    static void findKthPermutation(List<Character> v, int k, StringBuilder result) {
        if (v.isEmpty()) {
            return;
        }

        int n = v.size();
        // count is number of permutations starting with first digit
        int count = factorial(n - 1);
        int selected = (k - 1) / count;

        result.append(v.get(selected));
        v.remove(selected);

        k = k - (count * selected);
        findKthPermutation(v, k, result);
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}
