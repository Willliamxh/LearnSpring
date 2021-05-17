import com.kuang.pojo.Student;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Willam_xh
 * @create 2021-05-10 15:19
 */
public class MyTest {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student)context.getBean("student");
        System.out.println(student.getName());
//        System.out.println(student.getAddress());//这个是空的 因为没有注入进去

        //接下来我们全部注入完成之后
        System.out.println(student);



    }


    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = (User)context.getBean("user2");
        User user1 = context.getBean("user2", User.class);
//        原型模式就是不一样的 但是user的单例模式（Spring默认是单例模式 永久只有一种）是一样
        System.out.println(user == user1);
        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());


    }

}
