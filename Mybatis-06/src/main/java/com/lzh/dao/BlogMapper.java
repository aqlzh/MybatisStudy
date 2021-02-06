package com.lzh.dao;

import com.lzh.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
       //插入数据
      int addBlog(Blog blog) ;

      List<Blog>  queryBlogIF(Map map);
}
