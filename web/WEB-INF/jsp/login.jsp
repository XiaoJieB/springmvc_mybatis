<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 19414
  Date: 2018/9/18
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${userName}
<c:if test="${userName} != null">
    ${userName} <a herf="/logout">退出</a>
</c:if>
<form method="post" action="/auth">
    <input type="text" name="userName"><br/>
    <input type="password" name="password"><br/>
    <input type="submit" value="提交">
</form>

</body>
</html>
