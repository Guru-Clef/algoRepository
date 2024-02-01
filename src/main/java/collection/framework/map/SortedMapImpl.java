package collection.framework.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapImpl {

  // Tree Map es la implementación de SortedMap
  public void test() {
    SortedMap<Integer, String> sortedMap = new TreeMap<>();

    sortedMap.put(1, "A");
    sortedMap.put(2, "B");

    System.out.println(sortedMap);

    sortedMap.put(1, "AAA"); // actualiza valor

    System.out.println(sortedMap);



  }

}
