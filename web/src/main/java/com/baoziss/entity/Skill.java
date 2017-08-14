package com.baoziss.entity;

import java.io.Serializable;

/**
 * 技能相关
 */
public class Skill implements Serializable {
    private String id;//主键
    private String detail;//详细描述

    private Information information;//所属简历

    public Skill() {
    }

    public Skill(String id, String detail, Information information) {
        this.id = id;
        this.detail = detail;
        this.information = information;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id='" + id + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
