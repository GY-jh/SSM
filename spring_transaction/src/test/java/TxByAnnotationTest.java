import com.gy.spring.controller.BooKController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author : GuYue
 * @Date : 2023/8/10 17:12
 * @Description :
 * 声明式事务的配置步骤：
 * 1、在spring的配置文件中配置事务管理器
 * 2、开启事务的注解驱动
 * 在需要被事务管理的方法上，添加@Transactional注解，该方法就会被事务管理
 * @Transactional 注解标识的位置：
 * 1、标识在方法上
 * 2、标识在类上，则类中所有的方法都会被事务管理
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx-annotation.xml")
public class TxByAnnotationTest {

    @Autowired
    private BooKController booKController;

    @Test
    public void testBuyBook() {
        booKController.buyBook(1, 1);
    }

}
