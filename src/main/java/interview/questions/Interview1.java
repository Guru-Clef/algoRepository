package interview.questions;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Interview1 {


  /*
    Write a program that parses a sentence and replaces each word with the following:
    1) The first letter of the word
    2) The number of distinct characters between first and last character
    3) The last letter of the word.
      For example, Smooth would become S3h.
      Words are separated by spaces or non-alphabetic characters and these separators
      should be maintained in their original form and location in the answer.
      A few of the things we will be looking at is accuracy, efficiency, solution completeness.

      "Creativity is thinking-up new things. Innovation is doing new things!"
      expected: C6y is t4g-up n1w t4s. I6n is d3g n1w t4s!
*/

  public String wordParser(String s) {

    String[] stringArray = s.split("\\s");

    StringBuilder sb = new StringBuilder();
    for(int i=0; i < stringArray.length; i++) {
      if(stringArray[i].length() == 2) {
        sb.append(stringArray[i].charAt(0));
        sb.append(stringArray[i].charAt(stringArray[i].length()-1));
        sb.append(" ");
      } else {
        sb.append(stringArray[i].charAt(0));
        String subString = stringArray[i].substring(1,stringArray[i].length()-1);
        Set<Character> charSet = subString.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        sb.append(charSet.size());
        sb.append(stringArray[i].charAt(stringArray[i].length()-1));
        sb.append(" ");
      }


    }
    return sb.toString();


  }





}
