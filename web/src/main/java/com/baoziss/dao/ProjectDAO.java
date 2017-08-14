package com.baoziss.dao;

import com.baoziss.entity.Project;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 项目相关
 */
@Repository("projectDAO")
public interface ProjectDAO {
    //根据简介id获取项目
    List<Project> selectByInfor(String id);
}
