package com.gy.spring.service.impl;

import com.gy.spring.dao.BookDao;
import com.gy.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    /**
     * @Transactional :
     * 事务属性：只读(readOnly = true)
     * 对一个查询操作来说，如果我们把它设置成只读，就能够明确告诉数据库，这个操作不涉及写操作。这样数据库就能够针对查询操作来进行优化。
     * 对增删改操作设置只读会抛出下面异常：
     * Caused by: java.sql.SQLException: Connection is read-only. Queries leading to data modification are not allowed
     * <p>
     * 事务属性：超时(timeout = 3)
     * 事务在执行过程中，有可能因为遇到某些问题，导致程序卡住，从而长时间占用数据库资源。而长时间占用资源，大概率是因为程序运行出现了问题（可能是Java程序或MySQL数据库或网络连接等等）。
     * 此时这个很可能出问题的程序应该被回滚，撤销它已做的操作，事务结束，把资源让出来，让其他正常程序可以执行。
     * 执行过程中抛出异常：
     * org.springframework.transaction.TransactionTimedOutException: Transaction timed out: deadline was Thu Aug 10 17:51:19 HKT 2023
     * <p>
     * 事务属性：回滚策略
     * 声明式事务默认只针对运行时异常回滚，编译时异常不回滚。
     * 可以通过@Transactional中相关属性设置回滚策略
     * rollbackFor属性：需要设置一个Class类型的对象
     * rollbackForClassName属性：需要设置一个字符串类型的全类名
     * noRollbackFor属性：需要设置一个Class类型的对象
     * rollbackFor属性：需要设置一个字符串类型的全类名
     *
     * 事务属性：事务隔离级别
     * 数据库系统必须具有隔离并发运行各个事务的能力，使它们不会相互影响，避免各种并发问题。一个事务与其他事务隔离的程度称为隔离级别。
     * SQL标准中规定了多种事务隔离级别，不同隔离级别对应不同的干扰程度，隔离级别越高，数据一致性就越好，但并发性越弱。
     *隔离级别一共有四种：
     * 读未提交：READ UNCOMMITTED
     * 读已提交：READ COMMITTED
     * 可重复读：REPEATABLE READ
     * 串行化：SERIALIZABLE
     */

    @Override
    /*@Transactional(
            // readOnly = true
            // timeout = 3
            // noRollbackFor = ArithmeticException.class
            // noRollbackForClassName = "ArithmeticException"
            // isolation = Isolation.DEFAULT
            propagation = Propagation.REQUIRES_NEW
    )*/
    public void buyBook(Integer userId, Integer bookId) {
       /* try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        // 查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookId);
        // 更新图书的库存
        bookDao.updateStock(bookId);
        // 更新用户的余额
        bookDao.updateBalance(userId, price);
        // System.out.println(1/0);
    }
}
