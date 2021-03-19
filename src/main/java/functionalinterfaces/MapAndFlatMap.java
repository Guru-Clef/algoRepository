package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapAndFlatMap {

  public void mapAndFlatMap() {

    List<Integer> l1 = Arrays.asList(1,2,3,4);
    List<Integer> l2 = Arrays.asList(5,6);
    List<Integer> l3 = Arrays.asList(7,8);

    List<List<Integer>> all = Arrays.asList(l1, l2, l3);

    Function<List<?>, Integer> function1 = List::size;
    Function<List<Integer>, Stream<Integer>> flatmapper = l -> l.stream();

    all.stream()
        .map(flatmapper)
        .forEach(System.out::println);

  }



}
