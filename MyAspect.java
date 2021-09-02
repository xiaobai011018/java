package com.bsc.ba05;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Date;

@Aspect
public class MyAspect {
    @Before("myCut()")
    public void myBefore(JoinPoint jp){
//        System.out.println(jp.getSignature());
//        System.out.println(jp.getSignature().getName());
//        for (Object arg : jp.getArgs()){
//            System.out.println(arg);
//        }
        System.out.println("前置通知==="+new Date());
    }
    @After("myCut()")
    public void myAfter(){
        System.out.println("后置通知==="+new Date());
    }
    @Pointcut(value = "execution(* *..SomeService.doThird(..))")
    public void myCut(){}
}
