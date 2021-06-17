package com.michael.leetcode;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class Solution20 {
    public boolean isValid(String s) {
        int i = s.length() / 2;
        for (int j = 0; j <i ; j++) {
            s = s.replace("()","").replace("[]","").replace("{}","");
        }
        return s.length()==0;
    }

    @Test
    public void test(){
        String s = "(){}{]}";
        boolean valid = isValid(s);
        log.info(valid?"1":"0");
    }
}
