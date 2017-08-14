package com.baoziss.controller;

import com.baoziss.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/8/13.
 */
@Controller
@RequestMapping("/resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @RequestMapping("/getInfor")
    public String getInfor(HttpServletRequest request){
        request.setAttribute("infor",resumeService.getInfors("1"));
        return "main";
    }
}
