package com.mindera.school;

public class Arrays {
    /**
     * Create a function (getNegativeNumbers) that takes an array of integers and returns the number of elements in the
     * array that are negative numbers.
     */
    public int getNegativeNumbers(int[] array) {
        //------------------------------------------------------------------//
        int count = 0;
        //------------------------------------------------------------------//
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        //------------------------------------------------------------------//
        return count;
    }

    /**
     * Create a function (getNumberOfTimes) that takes an array of integers and an integer and returns the number of
     * times that number appears in the array.
     */
    public int getNumberOfTimes(int[] array, int number) {
        //------------------------------------------------------------------//
        int count = 0;
        //------------------------------------------------------------------//
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                count++;
            }
        }
        //------------------------------------------------------------------//
        return count;
    }

    /**
     * Create a function (getBooleanArray) that takes an array of integers and returns an array of booleans.
     * If the number is positive it will be replaced by true.
     * If it is negative or zero by false.
     */
    public boolean[] getBooleanArray(int[] array) {
        //------------------------------------------------------------------//
        boolean[] getBool = new boolean[array.length];
        //------------------------------------------------------------------//
        for (int i = 0; i < array.length; i++) {
            getBool[i] = array[i] > 0;
        }
        //------------------------------------------------------------------//
        return getBool;
    }

    /**
     * Create a function (getLargestNumber) that takes an array of integers and returns the position of the largest
     * number.
     */
    public int getLargestNumber(int[] array) {
        //------------------------------------------------------------------//
        int iArray = 0;
        //------------------------------------------------------------------//
        for (int i = 0; i < array.length; i++) {
            if (array[iArray] < array[i]) {
                iArray = i;
            }
        }
        //------------------------------------------------------------------//
        return iArray;
    }

    /**
     * Create a function (getOddEvenArray) that takes an array of integers and replaces the odd numbers with -1 and the
     * even numbers with 1.
     */
    public int[] getOddEvenArray(int[] array) {
        //------------------------------------------------------------------//
        for (int i = 0; i < array.length; i++) {
            //array[i] =array[i] % 2 == 0 ? 1 : -1;
            if (array[i] % 2 == 0) {
                array[i] = 1;
            } else {
                array[i] = -1;
            }
        }
        //------------------------------------------------------------------//
        return array;
    }

    /**
     * Create a function (sumAllElements) that takes an array of integers and returns the sum of all values
     */
    public int sumAllElements(int[] array) {
        //------------------------------------------------------------------//
        int sumAll = 0;
        //------------------------------------------------------------------//
        for (int i = 0; i < array.length; i++) {
            sumAll += array[i];
        }
        //------------------------------------------------------------------//
        return sumAll;
    }

    /**
     * Create a function (removeElement) that takes an array of integers and a number and removes it from the array;
     */
    public int[] removeElement(int[] array, int number) {
        //------------------------------------------------------------------//
        int counter = 0;
        //------------------------------------------------------------------//
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                counter++;
            }
        }
        //------------------------------------------------------------------//
        if (counter == 0) {
            return array;
        }
        //------------------------------------------------------------------//
        int[] newArray = new int[array.length - counter];
        int other = 0;
        //------------------------------------------------------------------//
        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                newArray[other] = array[i];
                other++;
            }
        }
        return newArray;
    }

    /**
     * Create a function (orderArray) that takes an array of integers and returns the array ordered from largest to
     * smallest.
     */
    public int[] orderArray(int[] array) {
        //------------------------------------------------------------------//
        if (array.length == 0 || array.length == 1) {
            return array;
        }
        //------------------------------------------------------------------//
        int temp;
        //------------------------------------------------------------------//
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
