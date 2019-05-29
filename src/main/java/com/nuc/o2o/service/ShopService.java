package com.nuc.o2o.service;

import com.nuc.o2o.dto.ShopExecution;
import com.nuc.o2o.entity.Shop;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;

/**
 * @author Calvin
 * @Description:
 */
public interface ShopService {
    /**
     * 创建商铺
     * @param shop
     * @param shopImg
     * @return
     */
    ShopExecution addShop(Shop shop, CommonsMultipartFile shopImg);

}
