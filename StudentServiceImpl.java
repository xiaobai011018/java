package com.bsc.service.impl;

import com.bsc.dao.StudentDao;
import com.bsc.domain.Student;
import com.bsc.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int insertStudent(Student student) {
        int num = studentDao.insertStudent(student);
        return num;
    }

    @Override
    public List<Student> selectStudents() {
        List<Student> studentList = studentDao.selectStudents();
        return studentList;
    }

    public void setStudentDao(StudentDao studentDao) {

    }
}
