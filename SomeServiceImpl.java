package com.bsc.ba01;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("===doSome方法被实现");
    }
}
