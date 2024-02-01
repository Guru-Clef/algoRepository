package collection.framework.set;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetImpl {

  public void test() {

    Set<Integer> integerSet = new HashSet<>();

    integerSet.add(1);
    integerSet.add(2);
    integerSet.add(3);

    System.out.println(integerSet);

    // insertar valores duplicados no da error, pero no son agregados a la lista
    // es como si fueran ignorados
    integerSet.add(1);
    integerSet.add(2);

    System.out.println(integerSet);
  }

  public void test2() {
    SortedSet<Integer> sortedSet = new TreeSet<>();

    sortedSet.add(1);
    sortedSet.add(2);
    sortedSet.add(3);

    System.out.println(sortedSet);

    sortedSet.add(1);

    System.out.println(sortedSet);
  }

}
