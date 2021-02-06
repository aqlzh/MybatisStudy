package com.lzh.pojo;


import javax.xml.crypto.Data;
@lombok.Data
public class Blog {
         private String id ;
         private String title ;
         private String author ;
         private Data createTime ;     //注意解决与数据库字段不相同问题
         private int views ;

}
