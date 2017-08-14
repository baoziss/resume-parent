package com.baoziss.entity;

import java.io.Serializable;

/**
 * 项目
 */
public class Project implements Serializable {
    private String id;//主键
    private String name;//项目名
    private String url;//项目源码地址
    private String job;//项目职责

    private Information information;//所属简历

    public Project() {
    }

    public Project(String id, String name, String url, String job, Information information) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.job = job;
        this.information = information;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
