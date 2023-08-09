import com.gy.spring.proxy.CalculatorImpl;
import com.gy.spring.proxy.CalculatorStaticProxy;
import org.junit.Test;

/**
 * @author Guyue
 * @date 2023/8/9 11:57
 */
public class ProxyTest {

    @Test
    public void testProxy() {
        CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());
        proxy.add(1, 2);
    }

}
