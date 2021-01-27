package com.michael.array;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * sum = leftsum+num[i]+rightsum
 * if leftsum = rightsume
 * else
 *   sum = 2*leftsum+num[i]
 *时间复杂度 O(n)
 */

@Slf4j
public class SulotionLC01 {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftsum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (sum == 2 * leftsum + nums[i]) {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }

    @Test
    public void test() {
        int[] nums = {-1,-1,-1,0,1,1};
        int i = pivotIndex(nums);
        log.info("" + i);
    }


}
