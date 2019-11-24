import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author tyler.chen
 * @date 2019/11/20 22:03
 */
public class test {
    SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() {
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(this.getClass().getClassLoader().getResourceAsStream("sqlConfig.xml"));
    }

    /**
     * 1、查询所有用户信息
     */
    @Test
        public void testFindAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取Dao接口动态代理对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.findAll();
        for (User user : userList) {
            System.out.println("用户信息：" + user);
        }
        sqlSession.close();
    }

    /**
     * 2、保存用户信息
     */
    @Test
    public void testSave() {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);//默认自动提交

        //获取Dao接口动态代理对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        //设置参数对象
        User user = new User();
        user.setUsername("周雨");
        user.setPassword("bbling123");
        user.setName("zhouyu");
        user.setBirthday("1990-11-20");

        userDao.save(user);
//        sqlSession.commit();
        sqlSession.close();
    }
}
