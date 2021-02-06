import com.lzh.dao.StudentMapper;
import com.lzh.pojo.Student;
import com.lzh.pojo.Teacher;
import com.lzh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();   //固定
        StudentMapper mapper= sqlSession.getMapper(StudentMapper.class);    //固定

        List<Teacher> teacherlist= mapper.getTeacher();
        for (Teacher teacher : teacherlist) {
            System.out.println(teacher);
        }
        sqlSession.commit();
        sqlSession.close() ;  // 固定
    }
}
