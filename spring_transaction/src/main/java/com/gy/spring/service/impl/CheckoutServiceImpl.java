package com.gy.spring.service.impl;

import com.gy.spring.service.BookService;
import com.gy.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: GuYue
 * @Date: 2023/8/10 19:31
 * @Description:
 */
@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private BookService bookService;

    @Override
    @Transactional
    public void checkout(Integer userId, Integer[] bookIds) {
        for (Integer bookId : bookIds) {
            bookService.buyBook(userId, bookId);
        }
    }
}
