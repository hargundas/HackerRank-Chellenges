package HackerRankChellenges;

import java.util.*;

/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 */
public class MinAndMax {

    public static void miniMaxSum(List<Integer> arr) {
        long sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // Sort the array in ascending order
        Collections.sort(arr);

        long minimumSum = sum - arr.get(arr.size() - 1);
        long maximumSum = sum - arr.get(0);

        System.out.println(minimumSum + " " + maximumSum);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(140537896);
        arr.add(243908675);
        arr.add(670291834);
        arr.add(923018467);
        arr.add(520718469);
        miniMaxSum(arr);
    }
}
