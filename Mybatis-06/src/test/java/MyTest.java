import com.lzh.dao.BlogMapper;
import com.lzh.pojo.Blog;
import com.lzh.utils.IDutils;
import com.lzh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javax.xml.crypto.Data;
import java.util.Date;

@SuppressWarnings("all")

public class MyTest {
    @Test
        public void addBlogTest(){
            SqlSession sqlSession = MybatisUtils.getSqlSession();
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

            Blog blog = new Blog();
            blog.setId(IDutils.getId());
            blog.setTitle("Mybatis");
            blog.setAuthor("狂神说");
            blog.setCreateTime((Data) new Date());
            blog.setViews(9999);

            mapper.addBlog(blog);

            blog.setId(IDutils.getId());
            blog.setTitle("Java");
            mapper.addBlog(blog);

            blog.setId(IDutils.getId());
            blog.setTitle("Spring");
            mapper.addBlog(blog);

            blog.setId(IDutils.getId());
            blog.setTitle("微服务");
            mapper.addBlog(blog);

            sqlSession.close();
    }
}
