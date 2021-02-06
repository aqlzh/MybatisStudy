package com.lzh.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias(value="Teacher")
public class Teacher {
    private int id ;
    private String name ;
}
