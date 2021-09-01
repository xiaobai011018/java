package com.bsc.ba01;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

@Aspect
public class MyAspect {
    @Before("execution(public void com.bsc.ba01.SomeServiceImpl.doSome(String,Integer))")
    public void myBefore(){
        System.out.println("前置通知==="+new Date());
    }
}
