package com.bsc;

import com.bsc.dao.StudentDao;
import com.bsc.domain.Student;
import com.bsc.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        for (String name:ac.getBeanDefinitionNames()){
            System.out.println(name);
        }
    }
    @Test
    public void testInsert(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) ac.getBean("studentService");
        Student student = new Student();
        student.setAge(21);
        student.setName("李四");
        student.setEmail("lisi@qq.com");
        student.setId(2);
        int i = service.insertStudent(student);
        System.out.println(i);
    }
    @Test
    public void testSelect(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) ac.getBean("studentService");
        List<Student> studentList = service.selectStudents();
        for (Student student : studentList){
            System.out.println(student);
        }
    }
}
