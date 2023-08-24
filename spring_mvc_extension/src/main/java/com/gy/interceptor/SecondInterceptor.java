package com.gy.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: GuYue
 * @Date: 2023/8/23 16:07
 * @Description :
 * 拦截器的三个方法：
 * preHandle()：在控制器方法执行之前执行，器返回值表示对控制器方法的拦截（false）或放行（true）
 * postHandle()：在控制器方法执行之后执行
 * afterCompletion()：在控制器方法执行之后，且渲染视图完毕
 * <p>
 * 多个拦截器的执行顺序和SpringMVC的配置文件中配置的顺序有关
 * preHandle()按照配置的顺序执行，postHandle()和 afterCompletion()按照配置的反序执行
 * <p>
 * 若拦截器中有某个拦截器的preHandle()返回了false
 * 拦截器的preHandle()返回false和它之前的拦截器的preHandle()都会执行
 * 所有的拦截器的postHandle()都不执行
 * 拦截器的preHandle()返回false之前的拦截器的afterCompletion()会执行
 */
@Controller
public class SecondInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("SecondInterceptor-->preHandle");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("SecondInterceptor-->postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("SecondInterceptor-->afterCompletion");
    }
}
