package com.michael.leetcode;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int a = 0; a < accounts[i].length; a++) {
                sum = sum+accounts[i][a];
            }

            if (sum>=max){
                max = sum;
            }
        }
        return max;
    }


    @Test
    public void test(){
        int [][] accounts = {{1,2,3},{3,2,1}};
        int i = maximumWealth(accounts);
        log.info(""+i);
    }
}
