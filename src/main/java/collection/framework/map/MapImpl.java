package collection.framework.map;

import java.util.HashMap;
import java.util.Map;

public class MapImpl {


  public void test() {

    Map<Integer, String> map = new HashMap<>();

    map.put(1, "A");
    map.put(2, "B");

    System.out.println(map);

    map.put(1, "AAAA"); // actualiza el valor

    System.out.println(map);





  }

}
