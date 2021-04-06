package crackingCodeInterview;

import crackingCodeInterview.Chapter1_ArraysAndStrings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class Chapter1_ArraysAndStringsTet {

  static Chapter1_ArraysAndStrings p;


  @BeforeAll
  public static void init() {
    p = new Chapter1_ArraysAndStrings();
  }

  @Test
  public void problem1Test() {
    Assertions.assertTrue(p.isUnique("abcdefghijklmnoprst"));
  }

  @Test
  public void p2_reverseString() {
    char c = 0;
    Assertions.assertEquals("cba", p.reverseString("abc" + c));

  }
}
