package crackingCodeInterview;

import javax.swing.text.Style;

public class Chapter1_ArraysAndStrings {

  // Implement an algorithm to determine if a string has all unique characters.
  // What if you can not use additional data structures?

  public boolean isUnique(String s) {

    boolean[] booleans = new boolean[256];

    for(int i = 0; i<s.length(); i++) {
      int at = s.charAt(i);
      if(booleans[at]) return false;
      booleans[at] = true;

    }
    return true;
  }

  // Write code to reverse a C-Style String.
  // (C-String means that “abcd” is represented as five characters, including the null character.)

  public String reverseString(String s) {

    StringBuilder sb = new StringBuilder();

    for(int i = s.length()-1; i >= 0; i--) {
      if(s.charAt(i) != 0)
        sb.append(s.charAt(i));
    }
    return sb.toString();
  }

}
