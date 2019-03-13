<%--
  Created by IntelliJ IDEA.
  User: Jianpeng
  Date: 2019/3/13
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3 align="center">添加用户</h3>
    <form action="${path}/user/addUser" method="post">
        用户名称：<input type="text" name="name" align="center"/>
        <br/>
        性别：<input type="radio" name="sex" value="1">男
             <input type="radio" name="sex" value="0">女
        <br/>
        <input type="submit" value="提交" align="center"/>
    </form>
</body>
</html>
