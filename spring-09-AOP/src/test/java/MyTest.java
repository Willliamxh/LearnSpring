import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Willam_xh
 * @create 2021-05-18 15:50
 */
public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService2 = context.getBean("userService", UserService.class);

        userService2.add();



    }
}
