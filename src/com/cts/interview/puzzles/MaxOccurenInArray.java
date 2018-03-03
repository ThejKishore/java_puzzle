package com.cts.interview.puzzles;

import java.util.Arrays;
import java.util.HashMap;

public class MaxOccurenInArray {


    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        // mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};

        System.out.println(mostFrequent(array1));
        System.out.println(mostFrequent(array2));
        System.out.println(mostFrequent(array3));
        System.out.println(mostFrequent(array4));
        System.out.println(mostFrequent(array5));
    }

    // Implement your solution below.
    public static Integer mostFrequent(int[] givenArray) {
        int iterationCount = 0 ;

        if(givenArray.length == 0){
            System.out.println("iterationCount " + iterationCount+ " to find solution for Array "+ Arrays.toString(givenArray));
            return null;
        } else if (givenArray.length == 1) {
            System.out.println("iterationCount " + iterationCount+ " to find solution for Array "+ Arrays.toString(givenArray));
            return givenArray[0];
        } else {
            Integer maxItem = null;
            int count = 1;
            HashMap<Integer,Integer> value= new HashMap<Integer,Integer>();

            for(int i=0;i<givenArray.length;i++){
                Integer key = givenArray[i];
                Integer data = value.get(key);
                if(data != null){
                    Integer tempValue = data +1;
                    value.put(key, tempValue);
                    if(tempValue > count){
                        count = tempValue;
                        maxItem = key;
                    }
                }  else  {
                    value.put(key,1);
                }
                ++iterationCount;
            }

            System.out.println("iterationCount " + iterationCount+ " to find solution for Array "+ Arrays.toString(givenArray));
            return maxItem;
        }
    }
}
