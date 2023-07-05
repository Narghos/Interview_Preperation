package com.interveiw;

public class FindLargestNumber {
    public static void main(String[] args) {
        //Input: arr[] = {10, 4, 3, 50, 23, 90}
        //Output: 90

        int[] array = {10, 4, 3, 50, 23, 90};
        largest(array);
    }



        public static void largest(int[] array){

            int largest = Integer.MIN_VALUE;

            for (int i = 0; i < array.length; i++) {
                if (array[i] > largest) {
                    largest = array[i];
                }
            }

            System.out.println( "largest number is : "+ largest );
        }
    }


