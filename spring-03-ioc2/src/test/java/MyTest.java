import com.kuang.pojo.User;
import com.kuang.pojo.User1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Willam_xh
 * @create 2021-05-06 15:00
 */
public class MyTest {
    public static void main(String[] args) {
//        User user = new User();
        //Spring 容器 类似婚介所 婚介网站 那些人已经注册了
        ApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User1 user = (User1)Context.getBean("U22");
        user.show();
    }
}
