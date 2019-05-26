package com.nuc.o2o.dao;

import com.nuc.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Calvin
 * @Description:
 */
public class AreaDaoTest extends BaseTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQuery() {
        List<Area> areaList =areaDao.queryArea();
        assertEquals(2,areaList.size());
    }
}
