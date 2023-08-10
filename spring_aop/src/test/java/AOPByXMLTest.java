import com.gy.spring.aop.xml.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Guyue
 * @date 2023/8/9 17:07
 */
public class AOPByXMLTest {

    @Test
    public void testAOPByXML() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-xml.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.add(1, 1);
    }

}
