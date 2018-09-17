<%--
  Created by IntelliJ IDEA.
  User: 19414
  Date: 2018/9/17
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>json交互测试</title>
    <script src="/resources/js/jquery.min.js"></script>
    <script>
        function requestJson() {
            $.ajax({
                type:"post",
                url:"/requestJson",
                contentType:"application/json;charset=utf-8",
                data:'{"name":"手机","price":99}',
                success:function (data) {
                    alert(data);
                }

            })
        }
        function responseJson() {
            $.ajax({
                type:"post",
                url:"/responseJson",
                // contentType:"application/json;charset=utf-8",
                data:'name=手机&price=99',
                success:function (data) {
                    console.log(data);
                    console.log(data.name);
                    var oj = JSON.parse(data);
                    console.log(oj.name);
                    alert(data.name);
                }

            })
        }
    </script>
</head>
<body>
<input type="button" onclick="requestJson()" value="请求json">
<input type="button" onclick="responseJson()" value="请求key/value">
</body>
</html>
