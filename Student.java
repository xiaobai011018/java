package com.bsc.ba04;

public class Student {
    String name;
    int age;
    School school;

    public Student() {
    }

    public Student (String myname, int myage, School myschool){
         name = myname;
         age = myage;
         school = myschool;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
