package com.gy.spring.service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: GuYue
 * @Date: 2023/8/10 16:50
 * @Description:
 */
public interface BookService {

    /**
     * 买书
     *
     * @param userId
     * @param bookId
     */
    void buyBook(Integer userId, Integer bookId);
}
