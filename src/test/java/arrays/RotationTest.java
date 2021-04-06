package arrays;

import arrays.rotation.ArrayRotation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RotationTest {

  @Test
  @DisplayName("Array RotationTest")
  void rotateUsingTempTest() {

    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int d = 2;
    int n = arr.length;

    int[] arrAssert = {3, 4, 5, 6, 7, 1, 2};

    ArrayRotation arrayRotation = new ArrayRotation();
    Assertions.assertArrayEquals(arrAssert, arrayRotation.rotateUsingTemp(arr, d, n));

  }


}
