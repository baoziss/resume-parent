package com.baoziss.test;

import com.baoziss.entity.Information;
import com.baoziss.entity.Project;
import com.baoziss.entity.Skill;
import com.baoziss.service.ResumeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/8/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-basic.xml")
public class TestResume {

    @Autowired
    ResumeService resumeService;
    @Test
    public void testSelect(){
        Information infors = resumeService.getInfors("1");

        System.out.println(infors);
    }


}

