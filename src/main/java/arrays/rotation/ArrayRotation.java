package arrays.rotation;

public class ArrayRotation {

  // Using temp array
  // d = cantidad de elementos a rotar
  // n = cantidad de elementos del array
  public int[] rotateUsingTemp(int[] arr, int d, int n) {

    int[] temp = new int[d];

    for(int i=0; i<d; i++) {
      temp[i] = arr[i];
    }

    for(int i=0; i<n-d; i++) {
      arr[i] = arr[d+i];
    }

    for(int i=0; i<temp.length; i++) {
      arr[n-d+i] = temp[i];
    }

    return arr;


  }

}
