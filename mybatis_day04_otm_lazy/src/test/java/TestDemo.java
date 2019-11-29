import com.itheima.dao.AccountDao;
import com.itheima.dao.UserDao;
import com.itheima.domain.Account;
import com.itheima.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author tyler.chen
 * @date 2019/11/27 23:21
 */
public class TestDemo {
    SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() {
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(this.getClass().getClassLoader().getResourceAsStream("mybatis_config.xml"));
    }

    /**
     * 根据用户名查询对应的账户信息
     * 一对多懒加载
     */
    @Test
    public void test01() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.findAll();

        for (User user : userList) {
//            System.out.println("用户所有信息"+user);
            System.out.println("NAME:"+user.getName());
            System.out.println("ACCOUNT："+user.getAccountList());
        }
        sqlSession.close();

    }
}
