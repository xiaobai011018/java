package com.bsc.dao;

import com.bsc.domain.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> selectStudents();
}
