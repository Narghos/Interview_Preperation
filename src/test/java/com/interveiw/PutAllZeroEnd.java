package com.interveiw;
import java.util.Arrays;

public class PutAllZeroEnd {
    public static void main(String[] args) {
        int[] arr = {2, 3, 0, 0, 5, 0, 8};

        int[] result = new int[arr.length];

        //int resul ={0,0,0,0,0,0,0}

        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        int index;
        for (int i = 0; i < result.length; i++) {

            index = arr[i] == 0 ? rightIndex-- : leftIndex++;
            result[index] = arr[i];
//            if (arr[i] == 0) {
//                result[rightIndex--]=0;
//
//            }else {
//                result[leftIndex++]=arr[i];
//            }

        }
        System.out.println(Arrays.toString(result));
    }
}

