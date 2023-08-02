import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Guyue
 * @date 2023/8/2 16:15
 */
public class IOCByXMLTest {

    @Test
    public void testIOC() {
        // 获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        // 获取bean
        Object studentOne = ioc.getBean("studentOne");
        System.out.println(studentOne);
    }
}
