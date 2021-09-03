package com.bsc.dao;

import com.bsc.domain.Student;

import java.util.List;

public interface StudentDao {
    public int insertStudent(Student student);
    public List<Student> selectStudents();
}
