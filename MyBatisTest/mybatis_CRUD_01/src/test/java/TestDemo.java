import com.chenjiafeng.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author tyler.chen
 * @data 2019-12-06 17:36
 */
public class TestDemo {
//    SqlSessionFactory sqlSessionFactory;
//    @Before
//    public void init(){
//       SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(this.getClass().getClassLoader().getResourceAsStream("sqlConfig.xml"));

//    }

    @Test
    public void test01(){
        InputStream inputStream= this.getClass().getClassLoader().getResourceAsStream("sqlConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession= sqlSessionFactory.openSession();
        List<User> userList= sqlSession.selectList("userMapper.findAll");
        for (User user : userList) {
            System.out.println(user);
        }

    }
}
