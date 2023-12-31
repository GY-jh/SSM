import com.gy.spring.proxy.Calculator;
import com.gy.spring.proxy.CalculatorImpl;
import com.gy.spring.proxy.ProxyFactory;
import org.junit.Test;

/**
 * @author Guyue
 * @date 2023/8/9 11:57
 */
public class ProxyTest {

    /**
     * 动态代理有两种：
     * 1、JDK动态代理，要求必须有接口，最终生成的代理类和目标类实现相同的接口
     * 在com.sun.proxy包下，类名为$proxy2
     * 2、cglib动态代理，最终生成的代理类会继承目标类，并且在目标类子啊相同的包下
     */

    @Test
    public void testProxy() {
        /*CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());
        proxy.add(1, 2);*/
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.div(1, 0);
    }

}
