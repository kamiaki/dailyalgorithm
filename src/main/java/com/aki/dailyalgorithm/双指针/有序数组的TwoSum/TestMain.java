package com.aki.dailyalgorithm.双指针.有序数组的TwoSum;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMain {
    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{3, 1, 0, 4, 11, 2}, 3);
        List<Integer> collect = Arrays.stream(ints).boxed().collect(Collectors.toList());
        System.out.println(collect);
    }

    public static int[] twoSum(int[] numbers, int target) {
        if (numbers == null) return null;
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }
}
