import com.itheima.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Test {

    /**
     * 1、查询用户所以信息
     */

    @org.junit.Test
    public void testFindAll() {
        //获取输入流对象
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("sqlConfig.xml");

        //获取SqlSessFactory(sqlsessiond的工厂类)的对象

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取Sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //查询sql
        List<User> user = sqlSession.selectList("userMapper.findAll");
        for (User users : user) {
            System.out.println("单独查询" + users);
        }
        sqlSession.close();
    }

    /**
     * 2、根据用户id查询
     * SelectList查询是返回一个用户集合
     * 注意userMapper不要写错
     */
    @org.junit.Test
    public void testFindById() {
        //获取输入流对象
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("sqlConfig.xml");

        //获取SqlSessFactory(sqlsessiond的工厂类)的对象

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取Sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //查询sql
        List<User> userList = sqlSession.selectList("userMapper.findById", 1);
        for (User user : userList) {
            System.out.println("根据用户id查询用户信息" + user);

        }
        sqlSession.close();
    }

    /**
     * 3、返回接口是一个用户，而不是用户集合
     * selectOne查询单个用户，返回User
     * parameter是传入参数
     */

    @org.junit.Test
    public void testFindById01() {
        //获取输入流对象
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("sqlConfig.xml");

        //获取SqlSessFactory(sqlsessiond的工厂类)的对象
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取sqlSession对象
        SqlSession sqlSession = sessionFactory.openSession();

        User user = sqlSession.selectOne("userMapper.findById", 1);

        System.out.println("查询单个用户" + user);
        sqlSession.close();


    }


    /**
     * 4、测试保存
     * 注意事务是不会去主动提交的
     */

    @org.junit.Test
    public void testSave() {
        //获取sql文件配置的流对象
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("sqlConfig.xml");

        //2、获取sqlsessiond的工厂类对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //3、获取sqlsession的对象，获取的sqlsession不能自动提交的
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //4、
        User user = new User();
        user.setUsername("天启");
        user.setPassword("abc123456");
        user.setName("tianqi");
        sqlSession.insert("userMapper.save", user);

        //只要修改了数据库就必须提交
        sqlSession.commit();

        sqlSession.close();
    }

    /**
     * 5、更新操作
     */
    @org.junit.Test
    public void testUptate() {
        //1、获取数据库配置流对象
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("sqlConfig.xml");

        //2、获取SqlSession工厂类对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //3、获取sqlSession的对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //更新数据库
        User user = new User();
        user.setId(5);
        user.setUsername("柳岩");
        user.setPassword("root123");
        user.setName("liuyan");

        sqlSession.update("userMapper.update", user);
        sqlSession.commit();
        sqlSession.close();


    }

    /**
     * 6、删除数据
     */
    @org.junit.Test
    public void testDelete() {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("sqlConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.delete("userMapper.delete",2);
        sqlSession.commit();
        sqlSession.close();

    }
}
