package com.jaggernaute.mochaPaws.aaaaTwoSum;

import java.util.logging.Logger;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] termsIndexes = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for(int j = nums.length - 1; j > i; j--) {
                if(nums[i] + nums[j] == target){
                    termsIndexes[0] = i;
                    termsIndexes[1] = j;
                    return termsIndexes;
                }
            }
        }
        return termsIndexes;
    }

    public static void main(String[] args) {
        Logger LOGGER = Logger.getLogger(TwoSum.class.getName());
        int[] nums = {2, 7, 11, 15};
        int[] termsIndexes = new TwoSum().twoSum(nums, 9);
        LOGGER.info(termsIndexes[0] + " " + termsIndexes[1]);
    }
}

