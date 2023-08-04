import com.gy.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Guyue
 * @date 2023/8/4 16:02
 */
public class LifeCycleTest {

    /**
     * 1、实例化
     * 2、依赖注入
     * 3、初始化，需要通过bean的init-method属性指定初始化的方法
     * 4、IOC容器关闭时销毁，需要通过bean的destroy-method属性指定销毁的方法
     */
    @Test
    public void test() {
        // ConfigurableApplicationContext是ApplicationContext的子接口，其中扩展了刷新和关闭容器的方法
        ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User user = ioc.getBean(User.class);
        System.out.println(user);
        ioc.close();
    }

}
