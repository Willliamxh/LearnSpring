import com.kuang.mapper.UserMapper;
import com.kuang.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author Willam_xh
 * @create 2021-05-24 20:33
 */


/*
* 声明试事务：AOP
* 编程式事务：需要在代码中，进行事务的管理
* */


public class myTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        List<User> users = userMapper.selectUser();

        for (User user : users) {
            System.out.println(user);
        }






    }
}
