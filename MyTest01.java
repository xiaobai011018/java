package com.bsc;

import com.bsc.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {
    @Test
    public void test01(){
        String config = "applicationcontext-back.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student  student  = (Student) ac.getBean("myStudent");
        System.out.println(student);
    }
}
