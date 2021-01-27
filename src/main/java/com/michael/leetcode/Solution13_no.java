package com.michael.leetcode;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class Solution13_no {
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
        int resule = map.get(str[0]);
        for (int i = 1; i < str.length; i++) {

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
