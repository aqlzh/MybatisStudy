package com.lzh.dao;

import com.lzh.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
       // 获取老师
    List<Teacher> getTeacher() ;
}
