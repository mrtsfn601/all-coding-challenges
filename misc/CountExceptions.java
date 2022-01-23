package misc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given string: "55 ^ & nbsp;DBSQLException\\nbsp;nbsp;SQLException.SQL sajlk-DBSQLException--afnso
 * DBSQLException&&*klsdmpfw ** ^^%$#^$# ^##^ gsiufouwhfo j
 * SQLJAVAException;nbsp;nbsp;SQLJAVAException..&&^knslnfrn^ ^ [:\" DBSQLException (SQLException *
 * SQLJAVAException"
 *
 * <p>TASK: is to find the words that contain Exception and print the number of times they appear in
 * the text Expected output: SQLException : 2 DBSQLException : 4 SQLJAVAException : 3
 */
public class CountExceptions {

  private static final String GIVEN =
      "55 ^ & nbsp;DBSQLException\\nbsp;nbsp;SQLException.SQL sajlk-DBSQLException--afnso  DBSQLException&&*klsdmpfw ** ^^%$#^$# ^##^ gsiufouwhfo j SQLJAVAException;nbsp;nbsp;SQLJAVAException..&&^knslnfrn^  ^  [:\" DBSQLException (SQLException * SQLJAVAException";

  public static Map<String, Integer> countExceptions() {
    Map<String, Integer> result = new HashMap<>(); // Map<Exception, Count>

    String[] words = GIVEN.split("[^a-zA-Z]"); // split by any non-alphabetical char

    Arrays.stream(words)
        .filter(w -> w.contains("Exception")) // filter words that contains "Exception"
        .forEach(
            e -> {
              if (!result.containsKey(e)) {
                result.put(e, 1); // save exception with initial count 1
              } else {
                result.put(
                    e, result.get(e) + 1); // update count if saved exception encountered again
              }
            });

    return result; // result = {SQLException=2, DBSQLException=4, SQLJAVAException=3}
  }
}
