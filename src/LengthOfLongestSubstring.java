import java.util.*;

public class LengthOfLongestSubstring {

    private static int lengthOfLongestSubstring(String s) {
      if (null == s || s.isEmpty())
        return 0;

      Map<Character, Integer> charToIndex = new HashMap<>();
      int maxSubstringLength = 0;
      for (int i=0; i<s.length(); i++) {
        if (charToIndex.containsKey(s.charAt(i))) {
          i = charToIndex.get(s.charAt(i));
          maxSubstringLength = charToIndex.size() > maxSubstringLength ? charToIndex.size() : maxSubstringLength;
          charToIndex = new HashMap<>();
        } else {
          charToIndex.put(s.charAt(i), i);
        }
      }

      return charToIndex.size() > maxSubstringLength ? charToIndex.size() : maxSubstringLength;

    }


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s1 = in.next();
    int result = lengthOfLongestSubstring(s1);
    System.out.println(result);
  }
}
