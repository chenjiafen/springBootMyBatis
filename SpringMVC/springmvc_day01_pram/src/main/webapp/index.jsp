<%--
  Created by IntelliJ IDEA.
  User: chenjiafeng
  Date: 2019-12-22
  Time: 23:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/saveUser" method="post">
    用户名：<input type="text" name="username"><br>
    年龄： <input type="text" name="age"><br>
    性别：<input type="text" name="sex"><br>
    List集合参数： <input type="text" name="list[0]">
    <input type="text" name="list[1]"><br>


    一个角色对象：<input type="text" name="role.id">
    <input type="text" name="role.roleName"><br>
    多个角色：<input type="text" name="roleList[0].id">
            <input type="text" name="roleList[0].roleName">
            <input type="text" name="roleList[1].id">
            <input type="text" name="roleList[1].roleName"><br>

    map集合：<input type="text" name="map[one]">
            <input type="text" name="map[two]">
            <input type="text" name="map[three]">
    <input type="submit" value="提交">
</form>
</body>
</html>
