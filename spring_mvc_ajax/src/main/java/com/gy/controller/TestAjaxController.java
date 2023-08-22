package com.gy.controller;

import com.gy.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: GuYue
 * @Date: 2023/8/22 20:10
 * @Description :
 * 1、@RequestBody：将请求体中的内容和控制器方法的形参进行绑定
 * <p>
 * 2、使用@RequestBody注解将JSON格式的请求参数转换为Java对象
 * a>导入Jackson的依赖
 * b>在SpringMVC的配置文件中设置<mvc:default-servlet-handler/>
 * c>在处理请求的控制器方法的形参位置，直接设置JSON格式的请求参数要转换的Java类型的形参，然后使用@RequestBody注解标识即可
 * <p>
 * 3、@ResponseBody：将所标识的控制器方法的返回值作为响应报文的响应体协议到浏览器
 * <p>
 * 4、使用@ResponseBody注解响应浏览器JSON格式的数据
 * a>导入Jackson的依赖
 * b>在SpringMVC的配置文件中设置<mvc:default-servlet-handler/>
 * c>将需要转换为JSON字符串的Java对象直接作为控制器的方法的返回值，使用@ResponseBody注解标识控制器方法
 * 就可以将Java对象直接转换为JSON字符串，并响应到浏览器
 * <p>
 * 常用的Java对象转换为JSON的结果：
 * 实体类 --> json对象
 * map --> json对象
 * list --> json数组
 */
@Controller
public class TestAjaxController {

    @RequestMapping("/test/ajax")
    public void testAjax(Integer id, @RequestBody String requestBody, HttpServletResponse response) throws IOException {
        System.out.println("requestBody:" + requestBody);
        System.out.println("id:" + id);
        response.getWriter().write("hello,axios");
    }


    @RequestMapping("/test/RequestBody/json")
    public void testRequestBody(@RequestBody Map<String, Object> map, HttpServletResponse response) throws IOException {
        System.out.println(map);
        response.getWriter().write("hello,RequestBody");
    }

    public void testRequestBody(@RequestBody User user, HttpServletResponse response) throws IOException {
        System.out.println(user);
        response.getWriter().write("hello,RequestBody");
    }

    @RequestMapping("/test/ResponseBody")
    @ResponseBody
    public String testResponseBody() {
        return "success";
    }

    @RequestMapping("/test/ResponseBody/json")
    @ResponseBody
    public List<User> testResponseBodyJson() {
        User user1 = new User(1001, "admin1", "123456", 21, "男");
        User user2 = new User(1002, "admin2", "123456", 22, "男");
        User user3 = new User(1003, "admin3", "123456", 23, "男");
        List<User> list = Arrays.asList(user1, user2, user3);
        return list;
    }
    /*public Map<String, Object> testResponseBodyJson() {
        User user1 = new User(1001, "admin1", "123456", 21, "男");
        User user2 = new User(1002, "admin2", "123456", 22, "男");
        User user3 = new User(1003, "admin3", "123456", 23, "男");
        Map<String, Object> map = new HashMap<>();
        map.put("1001",user1);
        map.put("1002",user2);
        map.put("1003",user3);
        return map;
    }*/
    /*public User testResponseBodyJson() {
        User user = new User(1001, "admin", "123456", 20, "男");
        return user;
    }*/

}
