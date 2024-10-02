package com.example.krunal;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (hm.containsKey(target - arr[i])) {
                return new int[] { hm.get(target - arr[i]), i };
            }
            hm.put(arr[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 3 };
        int target = 6;

        int result[] = twoSum(arr, target);
        Arrays.stream(result).forEach(System.out::println);
    }
}
