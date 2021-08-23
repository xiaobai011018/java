package com.bsc.dao.impl;

import com.bsc.dao.StudentDao;
import com.bsc.domain.Student;
import com.bsc.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @Override
    public List<Student> selectStudents() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String sqlId = "com.bsc.dao.StudentDao.selectStudents";
        List<Student> list = sqlSession.selectList(sqlId);
        sqlSession.close();
        return list;

    }
}
