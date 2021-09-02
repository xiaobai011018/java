package com.bsc.ba05;

import com.bsc.ba02.Student;

public interface SomeService {
    void doSome(String name,Integer age);
    Student doOther(String name, Integer age);
    String doFirst(String name,Integer age);
    void doSecond();
    void doThird();
}
