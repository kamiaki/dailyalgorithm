package com.aki.dailyalgorithm.双指针.两数平方和;

public class TestMain {
    public static void main(String[] args) {
        boolean b = judgeSquareSum(3);
        System.out.println(b);
    }

    public static boolean judgeSquareSum(int target) {
        if (target < 0) return false;
        int i = 0, j = (int) Math.sqrt(target);
        while (i <= j) {
            int powSum = i * i + j * j;
            if (powSum == target) {
                return true;
            } else if (powSum > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
