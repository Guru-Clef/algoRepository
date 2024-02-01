package codingpatterns.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

  public int lenthOfTheLongestSubstring(String s) {


    Map<Character, Integer> window = new HashMap<>();

    int l = 0;
    int r = 0;
    int res = 0;

    while(r < s.length()) {
      Character c1 = s.charAt(r);
      window.put(c1, window.getOrDefault(c1, 0 ) + 1 );
      r++;

      if(window.containsKey(c1)) {
        while(window.get(c1) > 1) {
          Character c2 = s.charAt(l);
          window.put(c2, window.get(c2) - 1);
          l++;
        }
      }

      res = Integer.max(res, r - l);
    }

    return res;
  }

}
