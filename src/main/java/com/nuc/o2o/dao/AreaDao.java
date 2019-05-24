package com.nuc.o2o.dao;

import com.nuc.o2o.entity.Area;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface AreaDao {
    /**
     * 列出区域列表
     * @return arrayList
     */
    List<Area> queryArea();
}
