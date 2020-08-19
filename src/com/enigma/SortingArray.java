package com.enigma;

import java.util.ArrayList;
import java.util.List;

public class SortingArray {
    public static void SortingAnArray(){

        //initialization array
        int[] arr = {12, 9, 13, 6 ,10, 4, 7, 2};

        //Sorting array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length- 1; j++) {
                int temp = 0;
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        List<Integer> result = new ArrayList<>();

        //filter array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3!=0){
                result.add(arr[i]);
            }
        }
        for (int element : result){
            System.out.print(element+" ");
        }

    }
}
