import com.itheima.dao.AccountDao;
import com.itheima.dao.UserDao;
import com.itheima.domain.Account;
import com.itheima.domain.AccountUser;
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
public class TestMybatisOTO {
    SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() {
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(this.getClass().getClassLoader().getResourceAsStream("myybatis-config.xml"));
    }

    @Test
    public void testFindAll(){
       SqlSession sqlSession= sqlSessionFactory.openSession();
      AccountDao accountDao= sqlSession.getMapper(AccountDao.class);
      List<Account> accountList=accountDao.findAll();
        for (Account account : accountList) {
            System.out.println(account);
        }
        sqlSession.close();
    }
    @Test
    public void testFindAll02(){
        SqlSession sqlSession= sqlSessionFactory.openSession();
        AccountDao accountDao= sqlSession.getMapper(AccountDao.class);
        List<AccountUser> accounUsertList=accountDao.findAllUser();
        for (AccountUser accountUser : accounUsertList) {
            System.out.println("用所有信息"+accountUser);
        }
        sqlSession.close();
    }

}
