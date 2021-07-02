package com.michael.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 15. 三数之和
 */
public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int sum = 0 - nums[i];
            List<Integer> it = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if (i==j){
                    continue;
                }
                for (int k = 0; k < nums.length ; k++) {
                    if (k==j || k==i){
                        continue;
                    }
                    if (nums[j]+nums[k]==sum){
                        it.add(nums[i]);
                        it.add(nums[j]);
                        it.add(nums[k]);
                    }

                }
            }

        }
        return list;
    }

    @Test
    public void test(){
        int [] nums = {-1,0,1,2,-1,-4};
        threeSum(nums);
    }
}
