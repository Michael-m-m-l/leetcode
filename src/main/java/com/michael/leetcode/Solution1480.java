package com.michael.leetcode;

/*
[1480]   一维数组的动态和
给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 请返回 nums 的动态和。

 示例 1：
 输入：nums = [1,2,3,4]
输出：[1,3,6,10]
解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。

 示例 2：
 输入：nums = [1,1,1,1,1]
输出：[1,2,3,4,5]
解释：动态和计算过程为 [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1] 。

 示例 3：
 输入：nums = [3,1,2,10,1]
输出：[3,4,6,16,17]

 提示：
 1 <= nums.length <= 1000
 -10^6 <= nums[i] <= 10^6
*/

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class Solution1480 {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum +nums[i];
            result[i]=sum;
        }
        return result;
    }

    @Test
    public void test(){
        int[] nums = {1,2,3,4};
        int[] ints = runningSum(nums);
        log.info(ints+"");
    }
}
