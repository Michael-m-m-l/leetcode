package com.michael.leetcode;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字 转证书
 * 规律  一般罗马数字存在两种个是 1位  2位
 * 1位 相加就可以了 2 位  右边减去左边
 */
@Slf4j
public class Solution13 {
    public int romanToInt(String s) {
        Map<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        String[] split = s.split("");
        int result = 0;
        int lengt = split.length;
        int index = 0;
        for (int i = 0; i < lengt ; i++) {
            int value = map.get(split[i]);
            if (i<lengt-1 && value< map.get(split[i+1])){
                result -=value;
            }else{
                result +=value;
            }
        }

        return result;
    }

    @Test
    public void test(){
        String str = "IV";
        int i = romanToInt(str);
        log.info(i+"");
    }
}
