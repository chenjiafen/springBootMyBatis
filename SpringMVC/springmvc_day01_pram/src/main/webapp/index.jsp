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
    性别：<input type="text" name="sex">
    <input type="submit" value="提交">
</form>
</body>
</html>
