package com.gy.spring.controller;

import com.gy.spring.service.BookService;
import com.gy.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: GuYue
 * @Date: 2023/8/10 16:49
 * @Description:
 */
@Controller
public class BooKController {

    @Autowired
    private BookService bookService;
    @Autowired
    private CheckoutService checkoutService;

    public void buyBook(Integer userId, Integer bookId) {
        bookService.buyBook(userId, bookId);
    }

    public void checkout(Integer userId, Integer[] bookIds) {
        checkoutService.checkout(userId, bookIds);
    }
}
