package Notes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class increasing_order {
    public static void main(String[] args) {
        // int[] numbers = {5, 2, 8, 1, 3};
        // Arrays.sort(numbers);
        // System.out.println("Sorted array in increasing order: " + Arrays.toString(numbers));

        //Create an arraylist
        ArrayList<Integer> arr = new ArrayList<>();
        //add elements to arraylist
        arr.add(5);
        arr.add(2);
        arr.add(8);
        arr.add(1);
        arr.add(3);

        Collections.sort(arr);
        System.out.println("Sorted array in increasing order: " + arr);
    }
} 