import com.gy.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Guyue
 * @date 2023/8/8 17:19
 */
public class IOCByAnnotationTest {

    /**
     * @Component：将类标识为普通组件
     * @Controller：将类标识为控制层组件
     * @Service：将类标识为业务层组件
     * @Repository：将类标识为持久层组件
     *
     * 通过注解+扫描所配置的bean的id，默认值为类的小驼峰，即类名的首字母为小写的结果
     * 可以她刚刚标识组件的注解的value属性值设置bean的自定义id
     *
     * @Autowired:实现自动装配功能的注解
     * 1、@Autowired注解能够标识的位置
     * a>标识在成员变量上,此时不需要设置成员变量的set方法
     * b>标识在set方法上
     * c>为当前成员变量赋值的有参构造上
     */

    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = ioc.getBean("controller", UserController.class);
        /*System.out.println(userController);
        UserService userService = ioc.getBean("userServiceImpl", UserService.class);
        System.out.println(userService);
        UserDao userDao = ioc.getBean("userDaoImpl", UserDao.class);
        System.out.println(userDao);*/
        userController.saveUser();
    }

}
