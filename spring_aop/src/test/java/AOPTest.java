import com.gy.spring.aop.annotation.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Guyue
 * @date 2023/8/9 17:07
 */
public class AOPTest {

    @Test
    public void testAopByAnnotation() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.sub(2, 1);
    }

}
