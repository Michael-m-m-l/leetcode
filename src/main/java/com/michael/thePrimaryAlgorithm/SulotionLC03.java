package com.michael.thePrimaryAlgorithm;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@Slf4j
public class SulotionLC03 {
    public void rotate(int[] nums, int k) {
        for (int i = 1; i <= k; i++) {
            int last = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
    }

    @Test
    public void test() {
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        rotate(nums, k);
        log.info("over");
    }

    public void rotate1(int[] nums, int k) {

        // 1先全部翻转
        int right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (i < right) {
                int temp = nums[i];
                nums[i] = nums[right];
                nums[right] = temp;
                right-=1;
            }
        }

        int right1 = k - 1;
        for (int i = 0; i < k; i++) {
            if (i < right1) {
                int temp = nums[i];
                nums[i] = nums[right1];
                nums[right1] = temp;
                right1-=1;
            }
        }

        int right2 = nums.length - 1;
        for (int i = k; i < nums.length; i++) {
            if (i < right2) {
                int temp = nums[i];
                nums[i] = nums[right2];
                nums[right2] = temp;
                right2-=1;
            }
        }

    }

    @Test
    public void test1(){
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        rotate1(nums, k);
        log.info("over");
    }

    public void rotate2(int[] nums, int k) {
        k = k % nums.length;
        int[] rightpart = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        System.arraycopy(nums, 0, nums, k, nums.length - k);
        System.arraycopy(rightpart, 0, nums, 0, k);
    }

    @Test
    public void test2(){
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        rotate2(nums, k);
        log.info("over");
    }

}
