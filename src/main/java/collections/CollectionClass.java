package collections;

import java.io.File;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.*;
import java.util.*;
import java.util.stream.IntStream;

public class CollectionClass {

    // List<String> list = new ArrayList<>();
    enum Colors {RED, BLUE, GREEN, YELLOW};



    public void a() throws ClassNotFoundException {
//        Class cls = Class.forName("java.lang.Double");
//        Object arr = Array.newInstance(cls, 5);
//        System.out.println(arr.getClass());

//        Integer[] data = {5,2,1,3,4};
//        Set mySet = new TreeSet(Arrays.asList(data));
//        System.out.println(mySet);
//
//        Set mySet2 = Set.of(1,5,4,2,3);
//        Set orderedSet = new TreeSet(mySet2);
//        System.out.println(mySet2);

//        String[] colors = {"Red", "Yellow", "Blue", "Green", "Purple"};
//        for(String color: colors) {
//            System.out.println(color.length() % 3 == 0 ? color + "-" : "Green ");
//        }

//        ArrayList list = new ArrayList();
//        Collections.addAll(list, 1,2,3,4,5);
//
//        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        // File thisFile = new File("temp.txt");

//        int[] values = IntStream.ra

//        EnumMap<ColorsTest, Integer> colorMap = new EnumMap<ColorsTest, Integer>();

        EnumMap<Colors, Integer> colorMap = new EnumMap<>(Colors.class);
        colorMap.put(Colors.BLUE, 1);
    }






}
