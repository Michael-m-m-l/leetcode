package com.michael.thePrimaryAlgorithm;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class SulotionLC01 {
    public int removeDuplicates(int[] nums) {
        /**
         * 双指针
         * 1 如果左指针的值 = 右指针的值则左指针不动 移动右指针
         * 2 如果左指针 ！=右指针  左指针+1  把右指针的值赋值给左指针
         */
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left]!=nums[right]){
                left+=1;
                nums[left] = nums[right];
            }
        }

        return left+1;
    }

    @Test
    public void test(){
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        int i = removeDuplicates(nums);
        log.info("over {}",i);
    }
}
