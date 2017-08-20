package com.baoziss.service;


import com.baoziss.entity.Information;

/**
 * 简历相关服务操作接口
 */
public interface ResumeService {
    //根据用户主键获取简历
    Information getInfors(String id);
}
