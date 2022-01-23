package hackerrank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

// https://www.hackerrank.com/challenges/find-the-running-median/problem
// https://www.youtube.com/watch?v=VmogG01IjYc
public class RunningMedian {

  // Implementation with max and min Heaps
  public static List<Double> runningMedian(List<Integer> input) {
    List<Double> result = new ArrayList<>(input.size());
    PriorityQueue<Integer> low = new PriorityQueue<>((a, b) -> -1 * a.compareTo(b));
    //    PriorityQueue<Integer> low =
    //            new PriorityQueue<>(
    //                    new Comparator<Integer>() {
    //                      public int compare(Integer a, Integer b) {
    //                        return -1 * a.compareTo(b);
    //                      }
    //                    });
    PriorityQueue<Integer> high = new PriorityQueue<>();

    for (Integer num : input) {
      add(num, low, high);
      rebalance(low, high);
      Double median = getMedian(low, high);
      result.add(median);
    }
    return result;
  }

  private static void add(Integer num, PriorityQueue<Integer> low, PriorityQueue<Integer> high) {
    if (low.isEmpty() || num < low.peek()) {
      low.add(num);
    } else {
      high.add(num);
    }
  }

  private static void rebalance(PriorityQueue<Integer> low, PriorityQueue<Integer> high) {
    PriorityQueue<Integer> bigger = low.size() > high.size() ? low : high;
    PriorityQueue<Integer> smaller = low.size() > high.size() ? high : low;
    while (bigger.size() - smaller.size() > 1) {
      smaller.add(bigger.poll());
    }
  }

  private static Double getMedian(PriorityQueue<Integer> low, PriorityQueue<Integer> high) {
    if (low.size() == high.size()) {
      return ((double) low.peek() + high.peek()) / 2;
    } else {
      PriorityQueue<Integer> bigger = low.size() > high.size() ? low : high;
      return (double) bigger.peek();
    }
  }
}
