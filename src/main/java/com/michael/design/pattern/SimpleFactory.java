package com.michael.design.pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * 简单工厂 操作
 * 这种磨时存在 扩展时需要修改源代码 违反开闭原则。
 */
@Slf4j
public class SimpleFactory {
    public Product getProduct(String key){
        switch (key){
            case "aa":
                return new ProductOne();
            case "bb":
                return new ProdeuctTow();
            default:
                log.info("");
                return null;
        }
    }
}

interface Product{
    void show();
}

class ProductOne implements Product{

    @Override
    public void show() {

    }
}

class ProdeuctTow implements Product{

    @Override
    public void show() {

    }
}