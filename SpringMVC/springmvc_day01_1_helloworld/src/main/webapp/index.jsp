<%--
  Created by IntelliJ IDEA.
  User: chenjiafeng
  Date: 2019-12-22
  Time: 01:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--isELIgnored="false" 不忽略el表达式--%>
    <a href="${pageContext.request.contextPath}/test/hello">请求1</a>
    <a href="/test/hello">请求2</a>
<form action="${pageContext.request.contextPath}/test/hello" method="post">
    <input type="text" name="name">
    <input type="text" name="age">
    <input type="submit">
</form>
</body>
</html>
