import com.chenjiafeng.dao.UserDao;
import com.chenjiafeng.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author tyler.chen
 * @data 2019-11-28 16:45
 */
public class TestUserDao {
    SqlSessionFactory sqlSessionFactory;
    @Before
    public void init(){
       sqlSessionFactory=new SqlSessionFactoryBuilder().build(this.getClass().getClassLoader().getResourceAsStream("sqlConfig.xml"));
    }

    @Test
    public void test01(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
       UserDao userDao= sqlSession.getMapper(UserDao.class);
       List<User> userList=userDao.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void test02(){
       SqlSession sqlSession= sqlSessionFactory.openSession();
       UserDao userDao=sqlSession.getMapper(UserDao.class);
       User user =new User();

//       user.setUsername("杰");
       user.setPassword("123");

      List<User> userList= userDao.findById(user.getId());
        for (User user1 : userList) {
            System.out.println("用户"+user1);
        }


    }
}
