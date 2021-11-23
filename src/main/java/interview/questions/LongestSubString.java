package interview.questions;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

  /* En el ejercicio básicamente se recibe una cadena y hay que encontrar
  * la cadena más larga con caracteres no repetidos
  * Ejemplo:
  * aabczaqww
  *
  *
  * La subcadena mas larca es "abcz" entonces debería retornar 4
  *
  * */

  public int lengthOfLongestSubString(String s) {

    int max = 0;
    Set<Character> charSet = new HashSet<>();
    charSet.add('a');

    return Math.max(charSet.size(), max);

  }

}
