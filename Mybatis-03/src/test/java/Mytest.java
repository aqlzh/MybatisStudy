import com.lzh.dao.StudentMapper;
import com.lzh.dao.TeacherMapper;
import com.lzh.pojo.Student;
import com.lzh.pojo.Teacher;
import com.lzh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Mytest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();   //固定
        TeacherMapper mapper= sqlSession.getMapper(TeacherMapper.class);    //固定


        Teacher teacher = mapper.getTeacher(1) ;
        System.out.println(teacher);
        sqlSession.commit();
        sqlSession.close() ;  // 固定
    }

    @Test
    public void testStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();   //固定
        StudentMapper mapper= sqlSession.getMapper(StudentMapper.class);    //固定

        List<Student> studentlist = mapper.getStudent();
        for (Student student : studentlist) {
            System.out.println(student);
        }
        sqlSession.commit();
        sqlSession.close() ;  // 固定
    }
}
