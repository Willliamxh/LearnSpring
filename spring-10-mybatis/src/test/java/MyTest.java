import com.kuang.mapper.UserMapper;
import com.kuang.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * @author Willam_xh
 * @create 2021-05-24 15:06
 */
public class MyTest {
    @Test
    public void test() throws IOException {
//        String resource="mybatis-config.xml";
//        InputStream in = Resources.getResourceAsStream(resource);
//
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
//        SqlSession sqlSession = sessionFactory.openSession(true);
//
//
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> users = mapper.selectUser();
//        for (User user : users) {
//            System.out.println(user);
//
//        }



        /*
        * 1.编写数据源配置
        * 2.sqlSessionFactory
        * 3.sqlSessionTemplate
        * 4.需要给接口添加实现类
        * 5.测试  将自己写的实现类注入到Spring类中 测试使用
        * */



        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        List<User> users = userMapper.selectUser();

        for (User user : users) {
            System.out.println(user);


        }


    }
}
