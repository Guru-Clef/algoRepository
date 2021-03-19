package functionalinterfaces;

import java.util.Arrays;
import java.util.List;

public class Functions {

  public void function() {
    List<String> messages = Arrays.asList("     hello", "    rogger", "    tipiani");
    messages.forEach(s -> System.out.println(s.stripLeading()) );

  }

}
