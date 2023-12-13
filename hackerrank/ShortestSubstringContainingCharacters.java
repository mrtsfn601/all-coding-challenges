/*
Given a string comprised of lowercase letters in the range ascii[a-z],
find the length shortest substring that contains at least one of each of the letters in the string.

Ex:
givenString = dabbcabcd

The list of all characters in the string is [a, b, c, d]. 
Two of the substrings that contain all letters are dabbc and abcd.
The shortest substring that contains all of the letters is 4 characters long.
Return 4 as the answer.

Function description:

Complete the function shortestSubstring in the editor below.
shortestSubstring has the following parameter(s):
   string givenString:  the given string

Returns:
   int: the length of the shortest substring that contains at least one of each character in givenString
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

  public static int shortestSubstring(String givenString) {
        int shortestSubstringLength = givenString.length();

        // find all distinct characters
        Set<Character> uniqueChars = new HashSet<>();
        for (Character c : givenString.toCharArray()) {
            uniqueChars.add(c);
        }

        // find best candidates and compare them to one another
        Queue<Character> bestCandidate = new LinkedList<>();
        for (int i = 0, j = 0; i < givenString.length(); i++) {
            Character c = givenString.charAt(i);
            bestCandidate.add(c);
            
            // if a new best candidate is found, process it then
            if (bestCandidate.containsAll(uniqueChars)) {
                // if a best candidate has a shorter length
                if (bestCandidate.size() < shortestSubstringLength) {
                    shortestSubstringLength = bestCandidate.size();
                }
                bestCandidate.clear();
                i = ++j; //alternative to a nested loop
            }

            // if best candidates has duplicated char at the beginning, remove it then
            if (bestCandidate.size() > 1
                && bestCandidate.element().equals(c)) {
                bestCandidate.remove();
            }
        }
        return shortestSubstringLength;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String givenString = bufferedReader.readLine();

        int result = Result.shortestSubstring(givenString);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
