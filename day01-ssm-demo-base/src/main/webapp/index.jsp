<%--
  Created by IntelliJ IDEA.
  User: pc7
  Date: 2020/7/8
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <a href="account/findAll">测试</a>

    <h3>测试保存</h3>
    <form action="account/saveAccount" method="post">
        <input type="text" name="name">
        <input type="text" name="money">
        <input type="submit" value="提交">
    </form>
</body>
</html>
