import com.chenjiafeng.domain.Product;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @author tyler.chen
 * @data 2019-11-20 10:17
 */
public class Test {

    /**
     * 1、查询所有商品
     * 注意点、数据配置?characterEncoding=utf8
     */
    @org.junit.Test
    public void testFindAll() {

        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Product> productList = sqlSession.selectList("productMapper.findAll");
        for (Product product : productList) {
            System.out.println("查询所有的产品" + product);

        }
    }

    /**
     * 2、通过pid查询产品
     */
    @org.junit.Test
    public void testByPid() {
        //获取输入流对象
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("sqlMapConfig.xml");
        //获取sqlSession工厂类对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<Product> productList = sqlSession.selectList("productMapper.findByPid", "1");
        for (Product product : productList) {
            System.out.println(product);
        }
        sqlSession.close();
    }

    /**
     * 3、查询pid查询产品，接收是单个产品
     */
    @org.junit.Test
    public void testById() {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sessionFactory.openSession();
        Product product = sqlSession.selectOne("productMapper.findByPid", "11");
        System.out.println("单个产品查询：" + product);
        sqlSession.close();
    }

    /**
     * 4、插入数据
     */
    @org.junit.Test
    public void testInster() {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();


        Product product = new Product();
        product.setPid("16");
        product.setPname("苹果x");
        product.setMarket_price(6669);
        product.setShop_price(7000);
        product.setPimage("products/1/c_0017.jpg");
        product.setPdate("2019-11-20");
        product.setPdesc("Apple iPhone 6 (A1586) 16GB 金色 移动联通电信4G手机长期省才是真的省！点击购机送费版，月月送话费，月月享优惠，畅享4G网络，就在联通4G！");


        sqlSession.insert("productMapper.save", product);
        sqlSession.commit();
        sqlSession.close();

    }
}
