package com.baoziss.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 基本信息实体类
 */
public class Information implements Serializable{

    private String id;//主键
    private String name;//姓名：吴龙涛
    private Integer sex;//性别：男    （1 女 or 0 男）
    private Integer age;//年龄：23
    private String money;//期望薪资：5000~6000
    private Date bir;//生日：1994-05-13
    private String degree;//学历：本科
    private String school;//毕业院校：河南大学
    private String major;//专业：计算机科学与技术
    private String location;//现居：上海市徐汇区
    private String homeLocation;//籍贯：河南洛阳
    private String phone;//手机号：17839248230
    private String email;//邮箱：505628125@qq.com
    private String selfIntroduce;
    /**
     * 自我介绍：
     * 河大社联游戏竞技大赛负责人之一。
     * 河大爱的罗曼斯校园歌手大赛负责人之一。
     * 互联网生态大会志愿者负责人之一。
     *
     * 踏实肯干，喜欢接受新知识。
     * 吃苦耐劳，热爱编程。
     * 喜欢团队工作。
     * 乐于分享知识，共同进步提高。
     * 喜爱音乐，性格活泼。
     */
    private List<Skill> skills;
    /**
     * 熟练掌握java基础
     * 熟练掌握java web，掌握jsp，servlet以及jdbc开发步骤
     * 熟练使用jstl，以及EL表达式
     * 熟练使用struts2，了解struts2值栈，掌握struts2中JSP标签库的使用
     * 熟练使用mybatis，熟练编写mapper文件，熟练使用mybatis子查询，了解mybatis缓存
     * 熟练使用数据库mysql、oracle能够使用PowerDesigner进行项目库表设计
     * 熟练使用maven，通过maven构建项目，添加maven项目依赖
     * 熟练使用开发工具myeclipse、idea
     * 熟练使用tomcat，通过tomcat发布网页，以及通过工具配置tomcat动态部署项目
     * 熟悉spring，springmvc集成配置过程，了解springMVC工作流程，了解spring面向切面编程，以及依赖注入思想
     * 熟悉MVC思想，熟悉springMVC基于注解的发布rest风格服务
     * 熟悉linux常用基础指令
     * 了解springboot
     * 了解dubbo集成spring使用
     * 了解nosql数据库如redis、mongodb
     */
    private List<Project> projects;//项目信息

    public Information() {
    }

    public Information(String id, String name, Integer sex, Integer age, String money, Date bir, String degree, String school, String major, String location, String homeLocation, String phone, String email, String selfIntroduce, List<Skill> skills, List<Project> projects) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.money = money;
        this.bir = bir;
        this.degree = degree;
        this.school = school;
        this.major = major;
        this.location = location;
        this.homeLocation = homeLocation;
        this.phone = phone;
        this.email = email;
        this.selfIntroduce = selfIntroduce;
        this.skills = skills;
        this.projects = projects;
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHomeLocation() {
        return homeLocation;
    }

    public void setHomeLocation(String homeLocation) {
        this.homeLocation = homeLocation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSelfIntroduce() {
        return selfIntroduce;
    }

    public void setSelfIntroduce(String selfIntroduce) {
        this.selfIntroduce = selfIntroduce;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Information{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", money='" + money + '\'' +
                ", bir=" + bir +
                ", degree='" + degree + '\'' +
                ", school='" + school + '\'' +
                ", major='" + major + '\'' +
                ", location='" + location + '\'' +
                ", homeLocation='" + homeLocation + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", selfIntroduce='" + selfIntroduce + '\'' +
                ", skills=" + skills +
                ", projects=" + projects +
                '}';
    }
}
