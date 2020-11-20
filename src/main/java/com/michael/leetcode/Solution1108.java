package com.michael.leetcode;
/*
1108 ip地址无效化
给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。

 示例 1：
 输入：address = "1.1.1.1"
输出："1[.]1[.]1[.]1"

 示例 2：
 输入：address = "255.100.50.0"
输出："255[.]100[.]50[.]0"

 提示：
 给出的 address 是一个有效的 IPv4 地址
*/

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class Solution1108 {
    public String defangIPaddr(String address) {
        String result = address.replaceAll("\\.","[.]");;

        return result;
    }

    @Test
    public void test(){
        String address = "1.1.1.1";
        log.info(address.replaceAll("\\.","[.]"));
    }
}
