package com.michael.design.pattern;

import lombok.Data;

/**
 * build 模式 构建不同对象属性的  同一个对象
 */
public class BuliderPattern {

    Builder builder = new ConcreteBuilder();
    Director director = new Director(builder);
}

@Data
class Productss {
    private String partA;
    private String partB;
    private String partC;
}

abstract class Builder {
    protected Productss product = new Productss();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    //返回产品对象
    public Productss getResult() {
        return product;
    }
}

class ConcreteBuilder  extends Builder{
    @Override
    public void buildPartA() {
        product.setPartA("");
    }

    @Override
    public void buildPartB() {
        product.setPartB("");
    }

    @Override
    public void buildPartC() {
        product.setPartC("");
    }
}

class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Productss construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
