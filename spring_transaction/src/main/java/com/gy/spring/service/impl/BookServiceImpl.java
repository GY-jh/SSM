package com.gy.spring.service.impl;

import com.gy.spring.dao.BookDao;
import com.gy.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: GuYue
 * @Date: 2023/8/10 16:51
 * @Description:
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    @Transactional
    public void buyBook(Integer userId, Integer bookId) {
        // 查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookId);
        // 更新图书的库存
        bookDao.updateStock(bookId);
        // 更新用户的余额
        bookDao.updateBalance(userId, price);
    }
}
