<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/13
  Time: 23:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>简历</title>
</head>
<body>
<h1 style="text-align: center">简历</h1>
<table align="center" style="width: 800px;">
    <tr>
        <td>${requestScope.infor.name}&nbsp;&nbsp;<c:if test="${requestScope.infor.sex}==0">男</c:if><c:if test="${requestScope.infor.sex}==1">女</c:if>&nbsp;&nbsp;${requestScope.infor.age}岁(<fmt:formatDate value="${requestScope.infor.bir}" pattern="yyyy-MM-dd"/>)</td>
        <td>${requestScope.infor.degree}</td>
    </tr>

    <tr>
        <td>毕业院校：${requestScope.infor.school}</td>
        <td>期望薪资：${requestScope.infor.money}</td>
    </tr>
    <tr>
        <td colspan="2">专业：${requestScope.infor.major}</td>
    </tr>
    <tr>
        <td>现居住地：${requestScope.infor.location}</td>
        <td>籍贯：${requestScope.infor.homeLocation}</td>
    </tr>
    <tr>
        <td colspan="2">电话：${requestScope.infor.phone}</td>
    </tr>
    <tr>
        <td colspan="2">邮箱：${requestScope.infor.email}</td>
    </tr>
    <tr>
        <td>${requestScope.infor.selfIntroduce}</td>
    </tr>
    <tr>
        <td colspan="2"><hr/></td>
    </tr>
    <tr>
        <td colspan="2"><span style="border: 1px solid blueviolet; background-color: beige;">&nbsp;·个人技能·&nbsp;</span></td>
    </tr>
    <c:forEach items="${requestScope.infor.skills}" var="skill">
    <tr>
        <td colspan="2">${skill.detail}</td>
    </tr>
    </c:forEach>
    <tr>
        <td colspan="2"><hr/></td>
    </tr>
    <tr>
        <td colspan="2"><span style="border: 1px solid blueviolet; background-color: beige;">&nbsp;·项目描述·&nbsp;</span></td>
    </tr>
    <c:forEach items="${requestScope.infor.projects}" var="project">
    <tr>
        <td colspan="2">项目名：${project.name}</td>
    </tr>
    <tr>
        <td>源码url：<a href="${project.url}" target="_blank">${project.url}</a></td>
    </tr>
    <tr>
        <td>项目职责： ${project.job}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
