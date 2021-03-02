package com.michael.leetcode;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class Solution1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int column = "type".equals(ruleKey)?0:("color".equals(ruleKey)?1:2);
        int result = 0;
        for (List<String> s:items){
            if (s.get(column).equals(ruleValue)){
                result ++;
            }
        }
        return result;
    }

    @Test
    public void test(){
        String [] [] items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
        List<List<String >> item = new ArrayList<>();
        for (int i = 0; i < items.length; i++) {
            item.add(Arrays.asList(items[i]));
        }
        String ruleKey = "color";
        String ruleValue = "silver";
        int i = countMatches(item, ruleKey, ruleValue);
        log.info(""+i);
    }
}
