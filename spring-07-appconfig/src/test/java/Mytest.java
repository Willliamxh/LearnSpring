import com.kuang.config.KuangConfig;
import com.kuang.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Willam_xh
 * @create 2021-05-17 9:40
 */
public class Mytest {

    public static void main(String[] args) {
        //如果完全使用了配置类方式去做 我们就只能通过 annotationconfig上下文来获取容器 通过配置类class对象加载

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KuangConfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser.getName());


    }
}
