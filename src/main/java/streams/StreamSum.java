package streams;

import java.util.Arrays;
import java.util.List;

public class StreamSum {

  public static void main(String[] args) {

    sumStream();


  }

  public static void sumStream() {

    Item item1 = new Item(1, 10);
    Item item2 = new Item(2, 15);
    Item item3 = new Item(3, 25);
    Item item4 = new Item(4, 40);

    List<Item> items = Arrays.asList(item1, item2, item3, item4);

//    Integer sum = items.stream()
//        .map(item -> item.getPrice())
//        .reduce(0, (a, b) -> a + b);

    double sum = items.stream().mapToDouble(v -> v.getPrice()).sum();

    System.out.println(sum);

  }

}
