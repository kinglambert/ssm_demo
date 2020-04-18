<%--
  Created by IntelliJ IDEA.
  User: Lambert
  Date: 2020/4/17
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Account</h1>
    ${account}
    <table border="1">
        <tr>
            <td>姓名</td>
            <td>工资</td>
        </tr><tr>
            <td>${account.name}</td>
            <td>${account.money}</td>
        </tr>
    </table>
</body>
</html>
