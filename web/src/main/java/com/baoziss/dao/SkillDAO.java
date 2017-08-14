package com.baoziss.dao;

import com.baoziss.entity.Skill;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 技能相关
 */
@Repository("skillDAO")
public interface SkillDAO {
    //根据简介id获取
    List<Skill> selectByInfor(String id);
}
