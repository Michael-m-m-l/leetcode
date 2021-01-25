package com.michael.design.pattern;

// 方式1
public class SingletonPattern {
    private static final SingletonPattern instance=new SingletonPattern();

    private SingletonPattern() {
    }

    public static SingletonPattern getInstance(){
            return instance;
    }
}

// 第二种
class SingletonPattern1{
    private static volatile SingletonPattern1 instance=null;
    private SingletonPattern1() {

    }

    private static synchronized SingletonPattern1 getInstance(){
        if (instance==null){
            instance = new SingletonPattern1();
        }
        return instance;
    }
}

// 匿名内部类方式
class SingletonPattern2{

}
