package com.michael.string_and_array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class SulotionLC02 {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (end-start)/ 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return start;
    }

    @Test
    public void test() {
        int[] arr = {1, 3, 5, 6};
        int i = searchInsert(arr, 2);
        log.info("" + i);
    }
}
