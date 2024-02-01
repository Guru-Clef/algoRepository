package codingpatterns.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SlidingWindowAlgorithmProblem1 {

  // Given a String S and a String T, find the minimun window in S which will contain
  // all the characters in T in complexity O(n)

  // Input S = "ADOBECODEBANC"
  // T = "ABC"
  // OUTPUT = "BANC"

  // Note
  // - If there is no such window in S that covers all the characters in T, return the empty string ""
  // - If there is such window, you are guaranteed that there will always be only one unique minimun
  // window in S

  // Not working ...
  public void naiveApproach(String s, String t) {

    List<Character> targetList = new ArrayList<>();
    List<Character> characterList = new ArrayList<>();
    List<Character> result = new ArrayList<>();
    int size = Integer.MAX_VALUE;

    for (char c : s.toCharArray()) {
      characterList.add(c);
    }

    for (char c : t.toCharArray()) {
      targetList.add(c);
    }

    for (int i = 0; i < characterList.size(); i++) {
      result.add(characterList.get(i));
      for (int j = i + 1; j < characterList.size(); j++) {
        result.add(characterList.get(j));
        System.out.println("Array " + result);
        System.out.println("Target " + targetList);
        if (result.containsAll(targetList)) {
          if (result.size() < size) {
            size = result.size();
            System.out.println(size);
            break;
          }
        }
      }
    }


  }

  public void optimalApproach_try1(String s, String t) {

    Map<Character, Integer> window = new HashMap<>();
    Map<Character, Integer> needs = new HashMap<>();

    int left = 0;
    int right = 0;
    int match = 0;
    int minLen = Integer.MAX_VALUE;
    int start = 0;

    for(Character c: t.toCharArray()) {
      needs.put(c, 1);
    }

    System.out.println(s);
    System.out.println(needs);

    while(right < s.length()) {
      Character c = s.charAt(right);
      if(needs.containsKey(c)) {
        window.put(c, window.getOrDefault(c, 0) + 1);
        if(window.get(c) == needs.get(c))
          match++;
      }
      right++;

      System.out.println(window);

      // mueves la ventana de la izq
      while(match == needs.size()) {
        if(right - left < minLen) {
          start = left;
          minLen = right - left;
        }
        Character c2 = s.charAt(left);
        if(needs.containsKey(c2)) {
          window.put(c2, window.get(c2) - 1);
          if(window.get(c2) < needs.get(c2))
            match--;
        }
        left++;

        System.out.println(window);

      }
    }

    if(minLen == Integer.MAX_VALUE) {
      System.out.println("");
    } else {
      System.out.println(s.substring(start, start + minLen));
    }





  }



}
