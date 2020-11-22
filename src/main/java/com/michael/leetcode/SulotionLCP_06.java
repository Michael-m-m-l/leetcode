package com.michael.leetcode;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
/*  LCP 06. 拿硬币
桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数。

        示例 1：
        输入：[4,2,1]
        输出：4
        解释：第一堆力扣币最少需要拿 2 次，第二堆最少需要拿 1 次，第三堆最少需要拿 1 次，总共 4 次即可拿完。

        示例 2：
        输入：[2,3,10]
        输出：8

        限制：
        1 <= n <= 4
        1 <= coins[i] <= 10
*/
@Slf4j
public class SulotionLCP_06 {
    public int minCount(int[] coins) {
        int result = 0;
        for (int i = 0; i < coins.length ; i++) {
            if(coins[i]%2!=0){
                result = result+1;
            }
            result = result + (coins[i] - coins[i]%2)/2;
          log.info( result+"");
        }
        return result;
    }

    @Test
    public void test(){
        int [] aa = {4,2,1};
        int rr = minCount(aa);
    }
}

// 利用默认取整
@Slf4j
class SulotionLCP_06_1 {
    public int minCount(int[] coins) {
        int result = 0;
        for (int i:coins){
           result += (i+1)/2;
           log.info(result+"");
           log.info(5/2+"");
        }
        return result;
    }

    @Test
    public void test(){
        int [] aa = {4,2,1};
        int rr = minCount(aa);
    }
}
