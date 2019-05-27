package com.nuc.o2o.dao;

import com.nuc.o2o.entity.Shop;

/**
 * @author Calvin
 * @Description:
 */
public interface ShopDao {

    /**
     * 店铺注册
     * @param shop
     * @return
     */
    int insertShop(Shop shop);

    /**
     * 更新店铺信息
     * @param shop
     * @return
     */
    int updateShop(Shop shop);
}
