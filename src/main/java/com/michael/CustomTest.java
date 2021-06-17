package com.michael;

import java.util.Optional;

public class CustomTest {
    public static void main(String[] args) throws Exception {
        String var = null;
        var = Optional.ofNullable(var).orElseThrow(()->new Exception("变量未null"));
        System.out.println(var);
    }
}
