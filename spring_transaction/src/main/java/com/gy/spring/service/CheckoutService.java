package com.gy.spring.service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: GuYue
 * @Date: 2023/8/10 19:29
 * @Description:
 */
public interface CheckoutService {

    /**
     * 结账
     *
     * @param userId
     * @param bookIds
     */
    void checkout(Integer userId, Integer[] bookIds);
}
