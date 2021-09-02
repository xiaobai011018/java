package com.bsc.ba05;

import com.bsc.ba02.Student;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("===doSome方法被实现");
    }

    @Override
    public Student doOther(String name, Integer age) {
        Student student = new Student();
        student.setName("赵四");
        student.setAge(20);
        System.out.println("====doOther方法被实现");
        return student;
    }

    @Override
    public String doFirst(String name, Integer age) {
        System.out.println("dofirst方法被执行");
        return "abc";
    }

    @Override
    public void doSecond() {
        System.out.println("doSecond方法被执行" + (20/0));
    }

    @Override
    public void doThird() {
        System.out.println("doThird()===");
    }
}
