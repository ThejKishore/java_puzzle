package com.cts.interview.puzzles;

import java.util.ArrayList;

public class CommonElementinSortedArrays {

    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        int[] array1A = {1, 3, 4, 6, 7, 9};
        int[] array2A = {1, 2, 4, 5, 9, 10};
        // commonElements(array1A, array2A) should return [1, 4, 9] (an array).

        int[] array1B = {1, 2, 9, 10, 11, 12};
        int[] array2B = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};
        // commonElements(array1B, array2B) should return [1, 2, 9, 10, 12] (an array).

        int[] array1C = {0, 1, 2, 3, 4, 5};
        int[] array2C = {6, 7, 8, 9, 10, 11};
        // common_elements(array1C, array2C) should return [] (an empty array).
        System.out.println(commonElements(array1A,array2A));
        System.out.println(commonElements(array1B,array2B));
        System.out.println(commonElements(array1C,array2C));


    }

    // Implement your solution below.
    // NOTE: Remember to return an Integer array, not an int array.
    public static ArrayList<Integer> commonElements(int[] array1, int[] array2) {
        ArrayList<Integer> resultInArray;
        if(array1.length > array2.length){
            resultInArray = cmelements(array2,array1);
        }else{
            resultInArray = cmelements(array1, array2);
        }
        return resultInArray;
    }

    private static ArrayList<Integer> cmelements(int[] a,int[] b){
        int iterationCount = 0;

        int startIndexLoop1 = 0 ;
        int startIndexLoop2 = 0 ;
        ArrayList<Integer> commonElement = new ArrayList<>();

        for(int i = startIndexLoop1 ; i < a.length; i++){
            int a1 = a[i];
            System.out.println( " i "+i+"  value  "+a1);
            ++iterationCount;
            for(int j = startIndexLoop2; j < b.length;j++){
                ++iterationCount;
                int b1 = b[j];
                System.out.println(" j "+j +"  value  " +b1);
                if(a1 == b1){
                    commonElement.add(a1);
                    startIndexLoop2 = j + 1;
                    break;
                } else if(a1 < b1){
                    startIndexLoop2 = j;
                    break;
                }

            }
        }
        System.out.println("iteration count it took for getting common elemets "+iterationCount);
        return  commonElement;
    }
}
