package com.michael.design.pattern;

/**
 * 工厂方法模式
 * 就是工厂的工厂 每个工厂只能产生一种一种实例
 *
 */
public class MethodFactory {
    public AbstractFactory getInstall(String key) {
        switch (key){
            case "1":
                return new TeacherFactory();
            case "2":
                return new WorkerFactory();
            default:
                return null;
        }

    }

}

interface Prosonl{
    void show();
}

class Teacher implements Prosonl{

    @Override
    public void show() {

    }
}

class Worker implements Prosonl{

    @Override
    public void show() {

    }
}

interface AbstractFactory{
    Prosonl getInstance();
}

class TeacherFactory implements AbstractFactory{

    @Override
    public Prosonl getInstance() {
        //这里产生teacher 的实例
        return new Teacher();
    }
}


class WorkerFactory implements AbstractFactory{

    @Override
    public Prosonl getInstance() {
        //这里差生worker 的实例
        return new Worker();
    }
}
