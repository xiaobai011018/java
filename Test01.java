package com.bsc;

import com.bsc.ba01.SomeService;
import com.bsc.ba01.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void test01(){
        String config = "applicationcontext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService someService = (SomeService) ac.getBean("someService");
        someService.doSome("lisi",123);
    }
    @Test
    public void test02(){
        SomeServiceImpl ssi = new SomeServiceImpl();
        SomeService ss = (SomeService) ssi;
       ss.doSome("asd",123);
    }
}
