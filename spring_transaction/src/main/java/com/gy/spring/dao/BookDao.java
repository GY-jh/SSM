package com.gy.spring.dao;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: GuYue
 * @Date: 2023/8/10 16:51
 * @Description:
 */
public interface BookDao {

    /**
     * 根据图书的id查询图书的价格
     *
     * @param bookId
     * @return
     */
    Integer getPriceByBookId(Integer bookId);

    /**
     * 更新图书的库存
     *
     * @param bookId
     */
    void updateStock(Integer bookId);

    /**
     * 更新用户的余额
     *
     * @param userId
     * @param price
     */
    void updateBalance(Integer userId, Integer price);
}
