import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
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
     * 查询账户对应的所有用户
     */
    @Test
    public void test01() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        List<Account> accountList= accountDao.findAll();
        for (Account account : accountList) {
                System.out.println("账户+用户信息"+account.getName());
//            System.out.println(account.getName());
            System.out.println(account.getUser());
        }
        sqlSession.close();
    }
}
