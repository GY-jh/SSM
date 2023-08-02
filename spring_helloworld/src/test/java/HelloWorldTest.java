import com.gy.spring.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Guyue
 * @date 2023/8/2 16:03
 */
public class HelloWorldTest {

    @Test
    public void test() {
        // 获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取IOC容器中的bean对象
        HelloWorld hellworld = (HelloWorld) ioc.getBean("hellworld");
        hellworld.sayHello();
    }

}
