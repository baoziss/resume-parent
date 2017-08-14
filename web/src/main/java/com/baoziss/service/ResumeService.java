package com.baoziss.service;


import com.baoziss.annotation.JedisQuery;
import com.baoziss.entity.Information;
import org.springframework.stereotype.Service;

/**
 * 简历相关服务操作接口
 */
public interface ResumeService {
    //根据用户主键获取简历
    @JedisQuery
    Information getInfors(String id);
}
