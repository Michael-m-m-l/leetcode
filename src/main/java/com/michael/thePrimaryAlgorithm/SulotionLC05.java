package com.michael.thePrimaryAlgorithm;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SulotionLC05 {
    /**
     * a^a=0；自己和自己异或等于0
     *
     * a^0=a；任何数字和0异或还等于他自己
     *
     * a^b^c=a^c^b；异或运算具有交换律
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
       int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }
}
