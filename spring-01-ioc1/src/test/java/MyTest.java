import com.kuang.dao.UserDaoOrcleImpl;
import com.kuang.dao.UserDapMySqlImpl;
import com.kuang.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Willam_xh
 * @create 2021-05-06 9:41
 */
public class MyTest {
    public static void main(String[] args) {

//        //用户实际调用的是业务层 Dao层他们不需要接触
//        UserServiceImpl userService = new UserServiceImpl();
//
//        //之前程序是主动创建对象！控制权在程序猿手上
//        //使用了set注入之后，程序不再具有主动性，而是变成了被动的接收对象
//        //这种思想 本质上解决了周二中问题 我们程序猿不用再去管理对象创建了 耦合性大大减少
//        //这个就是IOC的原型 控制反转 反转 就是把主动权交给了别人手里
//        userService.setUserDao(new UserDaoOrcleImpl());
//        userService.setUserDao(new UserDapMySqlImpl());
//        userService.getUser();
//
////        userService.getUser();

        //获取applicationcontext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        //容器再收 天下我有 需要什么直接get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl)applicationContext.getBean("UserServiceImpl");
        userServiceImpl.getUser();



    }
    
    
    @Test
    public void test1(){

    }




}
