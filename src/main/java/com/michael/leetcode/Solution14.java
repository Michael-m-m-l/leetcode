package com.michael.leetcode;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * 寻找最大公共前缀
 */
@Slf4j
public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        String per = strs[0];
        for (int i = 1; i < strs.length ; i++) {
            String value = strs[i];
            int min = Math.min(per.length(), value.length());
            int index = 0;
            while (index< min && per.charAt(index)== value.charAt(index)){
                index ++;
            }
            per = per.substring(0,index);
        }
        return per;
    }


    @Test
    public void test(){
        String [] strs = {"flower","flow","floight"};
        String s = longestCommonPrefix(strs);
        log.info(s);
    }
}
