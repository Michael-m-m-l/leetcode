package com.michael.thePrimaryAlgorithm;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Slf4j
public class SulotionLC04 {

    // 利用set 的特性判断重复
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (set.size()!=i+1){
                return true;
            }
        }
        return false;
    }

    @Test
    public void test(){
        int [] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean b = containsDuplicate(nums);
        log.info("sdsd "+b);
    }

    // 双指针直接比较
    public boolean containsDuplicate1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }


    @Test
    public void test1(){
        int [] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean b = containsDuplicate1(nums);
        log.info("sdsd "+b);
    }

    // 先排序 在两两比较
    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    @Test
    public void test2(){
        int [] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean b = containsDuplicate2(nums);
        log.info("sdsd "+b);
    }
}
