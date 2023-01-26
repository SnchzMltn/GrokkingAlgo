package org.snchzmltn;

import java.util.Arrays;
import java.util.List;

/***
 * Chapter 4: Recursion
 */
public class Recursion {

    /***
     * Exercise 4.1
     * Function to find the sum of all the elements in a List
     * @param input: the input list with integer values (can be null)
     * @return int: integer value with the sum of values in the list
     */
    public int recursiveSum(List<Integer> input) {

        if (input == null) return 0;

        if (input.size() == 0) {
            return 0;
        }

        /*
        Another option as a base case, could be;
        "if we are at the last element return its value":
         if (input.size() == 1) {
            return input.get(0);
         }
        */

        return input.get(0) + recursiveSum(input.subList(1, input.size()));
    }

    /***
     * Exercise 4.2
     * Function to find number of elements in a list
     * @param input: the input list with Integer values (can be null)
     * @return int: number of elements in the list
     */
    public int recursiveCount(List<Integer> input) {

        if(input == null) return 0;

        if (input.size() == 0) {
            return 0;
        }

        return 1 + recursiveCount(input.subList(1, input.size()));
    }


    /***
     * Exercise 4.3
     * Function to find maximum number in a list
     * @param input: input list with Integer values (can be null)
     * @return int: maximum number value in list
     */
    public int recursiveFindMaxNum(List<Integer> input) {
        if (input == null) return 0;

        if (input.size() == 0) return 0;

        return Math.max(input.get(0), recursiveFindMaxNum(input.subList(1, input.size())));
    }

    /***
     * Exercise 4.4
     * Function to implement Binary Search in an array of integers in a recursive way
     * @param input: array of integers to be searched
     * @param target: target value to be searched in the input array
     * @return mid: index of target value in array
     */
    public int recursiveBinarySearch(int[] input, int target) {
        //TODO: not quite done, something is wrong with the base case(s)

        int high = input.length;
        int low = 0;

        int mid = low + (high - low) / 2;

        if (input[mid] < target) {
            recursiveBinarySearch(Arrays.copyOfRange(input, mid, high), target);
        } else if (input[mid] > target) {
            recursiveBinarySearch(Arrays.copyOfRange(input, low, mid), target);
        } else if (input[mid] == target){
            return mid;
        }

        return -1;
    }
}
