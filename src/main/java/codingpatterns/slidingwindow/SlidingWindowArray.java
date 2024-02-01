package codingpatterns.slidingwindow;

public class SlidingWindowArray {

  // Finding the maximum or minimum sum subarray of a given size.
  // [1, 4, 2, 10, 2, 3, 1, 0]
  // n = 8
  // k = 3

  // Este tipo de problemas se resuelven con el "sliding technique"
  // problemas de ARRAY, STRING y LINKED LIST se resuelven de esta manera


  // fuerza bruta NO USAR
  public int bruteForce(int[] arr, int k, int n) {
    int max_sum = Integer.MIN_VALUE;

    // Consider all blocks starting with i.
    for (int i = 0; i < n - k + 1; i++) {
      int current_sum = 0;
      for (int j = 0; j < k; j++)
        current_sum = current_sum + arr[i + j];

      // Update result if required.
      max_sum = Math.max(current_sum, max_sum);
    }

    return max_sum;

  }

  public int findMaximunSum(int[] arr, int k, int n) {

    // n must be greater
    if (n < k) {
      System.out.println("Invalid");
      return -1;
    }

    // Compute sum of first window of size k
    int max_sum = 0;
    for (int i = 0; i < k; i++)
      max_sum += arr[i];

    // Compute sums of remaining windows by
    // removing first element of previous
    // window and adding last element of
    // current window.
    int window_sum = max_sum;
    for (int i = k; i < n; i++) {
//      window_sum = window_sum + arr[i] - arr[i - k];
      window_sum += arr[i] - arr[i - k];
      max_sum = Math.max(max_sum, window_sum);
    }

    return max_sum;

  }


}
