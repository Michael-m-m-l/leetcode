package com.michael.leetcode;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class SulotionLCP_06 {
    public int minCount(int[] coins) {
        int result = 0;
        for (int i = 0; i < coins.length ; i++) {
          log.info( (int)Math.ceil(coins[i]/2)+"");
          result = result + (int)Math.ceil(coins[i]/2);
        }
        return result;
    }

    @Test
    public void test(){
        int [] aa = {4,2,1};
        int rr = minCount(aa);
    }
}
