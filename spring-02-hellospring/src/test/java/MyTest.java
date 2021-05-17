import com.kuang.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Willam_xh
 * @create 2021-05-06 10:31
 */
public class MyTest {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象 现在都在Spring中管理了 要使用 直接从里面取出来
        Hello hello = (Hello)context.getBean("hello");

        System.out.println(hello.toString());

    }
}
