package com.lzh.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Data

public class Teacher {
    private int id ;
    private String name ;

    //一个老师拥有多个学生
    private List<Student> students ;
}
