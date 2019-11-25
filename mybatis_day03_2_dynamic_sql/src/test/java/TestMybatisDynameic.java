import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tyler.chen
 * @date 2019/11/25 0:05
 */
public class TestMybatisDynameic {
    SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() {
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(this.getClass().getClassLoader().getResourceAsStream("myybatis-config.xml"));
    }

    /**
     * 根据Username模糊查询和name查询
     */
    @Test
    public void test() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //动态代理
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        User user = new User();
        user.setUsername("雨");
        user.setName("zhouyu");
        List<User> userList = userDao.findByCondition(user);

        for (User user1 : userList) {
            System.out.println("用户：" + user1);
        }

        sqlSession.close();
    }

    /**
     * 根据数组删除用户
     */
    @Test
    public void test01() {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        //动态代理
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        Integer[] ids = new Integer[]{8, 16};
        userDao.delByArry(ids);
        sqlSession.close();
    }

    /**
     * 根据集合删除用户
     */
    @Test
    public void test02() {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        //动态代理
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        List<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(8);
        userDao.delByList(list);
        sqlSession.close();
    }
}
