package com.baoziss.dao;

import com.baoziss.entity.Information;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 简介相关
 */
@Repository("informationDAO")
public interface InformationDAO {
    //查询
    Information select(String id);
}





