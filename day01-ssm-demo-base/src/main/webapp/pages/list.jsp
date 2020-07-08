<%--
  Created by IntelliJ IDEA.
  User: pc7
  Date: 2020/7/8
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表页面</title>
</head>
<body>
    <h3>这是用户列表页面</h3>
    <table>
        <thead>
        <tr>
            <th>用户名</th>
            <th>余额</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="account">
            <tr>
                <td>${account.name}</td>
                <td>${account.money}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
