package com.michael.leetcode;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/* 回文数
判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

 示例 1:
 输入: 121
输出: true

 示例 2:
 输入: -121
输出: false
解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。

 示例 3:
 输入: 10
输出: false
解释: 从右向左读, 为 01 。因此它不是一个回文数。

 进阶:
 你能不将整数转为字符串来解决这个问题吗？
 */
@Slf4j
public class Sulotion9 {
    public boolean isPalindrome(int x) {
        boolean result = false;
        if (x<0){
            return result;
        }
        int cpx = x;
        long n = 0L;
        while (x != 0) {
            n = n * 10 + x % 10;
            x = x / 10;
        }
        if (n == cpx) {
            result = true;
        }
        return result;
    }

    @Test
    public void test(){
        assertTrue(isPalindrome(121));
        assertFalse(isPalindrome(-121));
        assertTrue(isPalindrome(0));
        assertFalse(isPalindrome(10));
        assertTrue(isPalindrome(11));
    }



}
