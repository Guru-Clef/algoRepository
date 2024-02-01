package arrays;

import arrays.rotation.ArrayRotation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

  @Test
  @DisplayName("Bubble Sort Test")
  void bubbleSort() {

    int[] arr = {9, 4, 2, 1, 6};
    BubbleSort bubbleSort = new BubbleSort();

    bubbleSort.bubbleSort(arr);

    //Assertions.assertArrayEquals(arrAssert, arrayRotation.rotateUsingTemp(arr, d, n));

  }


}
