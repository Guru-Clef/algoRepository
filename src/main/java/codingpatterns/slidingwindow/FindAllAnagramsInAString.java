package codingpatterns.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInAString {

  // Given a string s and a non-empty string p, find all the start indices of p's anagrams in s
  // Strings consist of lowercase English letters only and the length of both strings s and p
  // will not be larger than 20,100
  // The order of output does not matter

  // Input
  // s: "cbaebabacd"
  // p: "abc"

  // Output:
  // [0, 6]

  // Explanation:
  // The substring with start index = 0 is "cba", which is an anagram of "abc"
  // The substring with start index = 6 is "bac", which is an anagram of "abc"



  // https://leetcode.com/problems/find-all-anagrams-in-a-string/

  public List<Integer> findAllAnagrams_try1(String s, String p) {

    Map<Character, Integer> needs = new HashMap<>();
    Map<Character, Integer> window = new HashMap<>();

    int l = 0;
    int r = 0;
    int match = 0;
    int start = Integer.MAX_VALUE;

    List<Integer> result = new ArrayList<>();

    for (Character c : p.toCharArray()) {
      needs.put(c, needs.getOrDefault(c, 0) + 1);
    }

    while (r < s.length()) {
      Character c = s.charAt(r);
      if (needs.containsKey(c)) {
        window.put(c, window.getOrDefault(c, 0) + 1);
        if (window.get(c) == needs.get(c)) {
          match++;
        }
      }
      r++;

      while(match == needs.size()) {
        if(r - l == p.length()) {
          result.add(l);
        }

        Character c2 = s.charAt(l);
        if(needs.containsKey(c2)) {
          window.put(c2, window.get(c2) - 1);
          if(window.get(c2) < needs.get(c2)) {
            match--;
          }
        }
        l++;

      }
    }

    System.out.println(window);
    System.out.println(match);
    System.out.println(result);
    return result;


  }


}
