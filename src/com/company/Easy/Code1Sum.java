package com.company.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Code1Sum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var array = new int[] {2,5,5,11};
        var target = 10;
        var s = in.nextLine();

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(array, target)));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int number = target - nums[i];

        }
        return new int[0];
    }
}
