import com.chenjiafeng.domain.Product;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author tyler.chen
 * @data 2019-11-22 14:57
 */

public class test {
    SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("sqlConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    }

    @Test
    public void testFindAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Product> productList = sqlSession.selectList("userMapper.findAll");
        for (Product product : productList) {
            System.out.println(product);
        }

    }
}
