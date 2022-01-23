package interview;

/**
 * Given a balance scale and 9 gold bars of the same size and look.
 * You don’t know the exact weight of each bar. They are the same weight, except for only one fake bar.
 * The fake bar weighs LESS than others.
 * You can only place gold bars on scale plates (bowls) and find which scale weighs more or less.
 * You need to find the fake gold bar using only bars and balance scales.
 */
public class BalanceScaleAndGoldBars {

    public static void main(String[] args) {
        // 1  2  3  4  5  6  7  8  9 - order no
        // 0  1  2  3  4  5  6  7  8 - indexes
        // 2, 1, 2, 2, 2, 2, 2, 2, 2
        System.out.println(findFakeBar1(new int[]{2, 1, 2, 2, 2, 2, 2, 2, 2}));
        System.out.println(findFakeBar2(new int[]{2, 1, 2, 2, 2, 2, 2, 2, 2}));
        System.out.println(findFakeBar2(new int[]{2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2}));
        System.out.println(findFakeBar2(new int[]{2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2}));
    }

    // questions:
    // can be other than 9 number of bars?
    // can be other then 1 fake bar?
    private static int findFakeBar1(int[] bars) {
        for (int i = 1; i < bars.length; i++) {
            int prev = bars[i - 1];
            int curr = bars[i];
            if (prev == curr) { // equal
                continue;
            }
            if (prev > curr) { // current is less -> fake bar
                return i;
            }
            if (prev < curr) { // previous is less -> fake bar
                return i - 1;
            }
        }
        return -1; // if no fake bars found
    }

    // optimization:
    // there is no need to compare one to another
    // we can compare them by pairs (cut number of iterations by 2 times)
    // let's compare bars from both sides - left and right
    // if all pairs are equal then the last one (in the middle) is the fake bar
    // this method works with any number of bars, returns index of the first fake bar
    private static int findFakeBar2(int[] bars) {
        int ind_left = 0;
        int ind_right = bars.length - 1;

        while (ind_left < ind_right) {
            int val_left = bars[ind_left];
            int val_right = bars[ind_right];

            if (val_left > val_right) { // right is less -> fake bar
                return ind_right;
            }
            if (val_left < val_right) { // left is less -> fake bar
                return ind_left;
            }

            ind_left++;
            ind_right--;
        }
        return bars.length/2; // if number of bars is odd, and the last bar (fake bar) is in the middle
    }
}
