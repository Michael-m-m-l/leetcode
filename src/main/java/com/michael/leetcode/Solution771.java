package com.michael.leetcode;

/*
[771] 宝石与石头
给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。

 示例 1:
 输入: J = "aA", S = "aAAbbbb"
输出: 3

 示例 2:
 输入: J = "z", S = "ZZ"
输出: 0

 注意:
 S 和 J 最多含有50个字母。
 J 中的字符不重复。
*/


import org.junit.jupiter.api.Test;

public class Solution771 {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        char[] chars = J.toCharArray();
        char[] chars1 = S.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            for (int j = 0; j < chars1.length ; j++) {
                if (chars[i] == chars1[j]){
                    count =count+1;
                }
            }
        }
        return count;
    }

    @Test
    public void test(){
        String J = "we";
        String W = "wedddffsfdgsdfwe";
        int i = numJewelsInStones(J, W);
        System.out.println(i);
    }
}