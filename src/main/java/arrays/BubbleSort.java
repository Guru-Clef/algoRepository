package arrays;

import java.util.Arrays;

public class BubbleSort {

    public void bubbleSort(int[] arr) {
        
        
        int val = -5;
        
        Math.abs(val);

        System.out.println(Arrays.toString(arr));

        //int element = 0;
        int temp = 0;
        boolean swapped = false;

        for(int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }

                if(swapped == false)
                    break;
            }

            System.out.println(Arrays.toString(arr));
        }
    }
}
