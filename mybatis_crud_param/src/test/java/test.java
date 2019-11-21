import com.itheima.dao.UserDao;
import com.itheima.domain.QueryVo;
import com.itheima.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取Dao接口动态代理对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        //设置参数对象
        User user = new User();
        user.setUsername("韦小宝");
        user.setPassword("bbling123");
        user.setName("weixiaobao");
        user.setBirthday("1990-11-20");

        userDao.save(user);
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     *3、多条件查询
     */

    @Test
    public void testFindByQuerVo(){
        //获取sqlSession
        SqlSession sqlSession=  sqlSessionFactory.openSession();
        //获取Dao接口动态代理对象
        UserDao userDao=sqlSession.getMapper(UserDao.class);
        QueryVo queryVo =new QueryVo();
        User user=new User();
        user.setUsername("小");
        queryVo.setUser(user);
        queryVo.setStarIndex(0); //分页显示
        queryVo.setPageSize(2);   //查询个数
        List<User> userList= userDao.findByCondition(queryVo);
        for (User user1 : userList) {
            System.out.println("用户："+user1);

        }
        sqlSession.close();
    }

    /**
     *testFindByQuerVo的另一种实现方式
     * 缺点：不适合团队协作
     * 如果需要，要先确定VO的参数
     */

    @Test
    public void testFindByMap(){
        //获取sqlSession
        SqlSession sqlSession=  sqlSessionFactory.openSession();
        //获取Dao接口动态代理对象
        UserDao userDao=sqlSession.getMapper(UserDao.class);
        QueryVo queryVo =new QueryVo();

        //创建map对象
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("username","小");
        map.put("starIndex",0);
        map.put("pageSize",2);
        List<User> userList= userDao.findByMap(map);
        for (User user1 : userList) {
            System.out.println("用户："+user1);

        }
        sqlSession.close();
    }

    /**
     * 根据多参数的多条件查询
     */
    @Test
    public void testFindByManyParam(){
        //获取sqlSession
        SqlSession sqlSession=  sqlSessionFactory.openSession();
        //获取Dao接口动态代理对象
        UserDao userDao=sqlSession.getMapper(UserDao.class);
        List<User> userList= userDao.findByManyParam("小",0,2);
        for (User user1 : userList) {
            System.out.println("用户："+user1);

        }
        sqlSession.close();
    }
}
