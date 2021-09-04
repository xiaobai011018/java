package com.bsc.service;

import com.bsc.domain.Student;

import java.util.List;

public interface StudentService {
    public int insertStudent(Student student);
    public List<Student> selectStudents();
}
