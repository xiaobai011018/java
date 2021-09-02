package com.bsc;

import com.bsc.ba05.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {
    @Test
    public void test01(){
        String config = "applicationcontext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService someService= (SomeService) ac.getBean("someService");
        someService.doThird();
    }
}
