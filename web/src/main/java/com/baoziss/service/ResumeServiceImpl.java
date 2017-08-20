package com.baoziss.service;

import com.baoziss.dao.InformationDAO;
import com.baoziss.entity.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 简历相关业务操作实现
 */
@Service("resumeService")
@Transactional
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private InformationDAO informationDAO;

    /**
     * 根据id获取一条简历
     */
    public Information getInfors(String id) {
        Information select = informationDAO.select(id);
        return select;
    }
}
