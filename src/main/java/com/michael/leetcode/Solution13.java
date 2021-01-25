package com.michael.leetcode;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

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

        String[] str = s.split("");
        int resule = 0;
        for (int i = 0; i < str.length-1; i++) {
            if (map.get(str[i])>=map.get(str[i+1])){
                resule += map.get(str[i]);
            }else {
                resule = resule-map.get(str[i]);
            }
        }
        return resule;
    }

    @Test
    public void test(){
        String str = "IV";
        int i = romanToInt(str);
        log.info(i+"");
    }
}
