package com.michael.leetcode;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@Slf4j
public class Solution1313 {
    public int[] decompressRLElist(int[] nums) {
        int lenght = 0;
        for (int k = 0; k < nums.length; k=k+2) {
            lenght = lenght+nums[k];
        }
        int[] result = new int[lenght];
        int index = 0;
        for (int k = 0; k < nums.length; k=k+2) {
            for (int i = 0; i < nums[k] ; i++) {
                result[index] = nums[k+1];
                index +=1;
            }
        }
        return result;
    }

    @Test
    public void test(){
        int [] var = {1,2,3,4};
        decompressRLElist(var);
    }

}
