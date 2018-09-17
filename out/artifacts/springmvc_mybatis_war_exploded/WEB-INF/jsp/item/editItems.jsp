<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>SpringMVC 用户管理</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script>


        function list1() {
            document.listForm.action="list";
            document.listForm.submit();
        }

        function updateItems() {
            document.listForm.action="updateItems";
            document.listForm.submit();
        }
    </script>
</head>
<body>
<div class="container">
    <h1>SpringMVC 博客系统-用户管理</h1>
    <hr/>

    <%--<h3>所有用户 <a href="/admin/items/add" type="button" class="btn btn-primary btn-sm">添加</a>--%>
        <%--<a href="/report/export" type="button" class="btn btn-primary btn-sm">导出excel表格</a>--%>
    <%--</h3>--%>
    <form id="listForm" name="listForm" action="list" method="post">
        <table>
            <tr>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
            </tr>
        <tr>
            <td></td>
            <td><input name="itemCustom.name"></td>
            <td><input type="button" value="查询" onclick="list1()"></td>
            <td><input type="button" value="批量修改提交" onclick="updateItems()"></td>
        </tr>
        </table>
        <table class="table table-bordered table-striped">
            <tr>
                <th>选择</th>
                <%--<th>ID</th>--%>
                <th>名称</th>
                <th>价格</th>
                <th>时间</th>
                <th>操作</th>
            </tr>

            <c:forEach items="${items}" var="item">
                <tr>
                    <td><input type="checkbox" name="itemsId" value="${item.id}"> </td>
                    <%--<td>${item.id}</td>--%>
                    <td><input name="name" value="${item.name}"> </td>
                    <td><input name="price" value="${item.price}"></td>
                    <input  type="text" class="form-control" name="createTime"
                            value="<fmt:formatDate value="${item.createTime}"
                    type="DATE" pattern="yyyy-MM-dd hh:mm:ss"/>"/>
                    <td>
                        <%--<a href="/item/show/${item.id}" type="button" class="btn btn-sm btn-success">详情</a>--%>
                        <%--<a href="/item/edit?id=${item.id}" type="button" class="btn btn-sm btn-warning">修改</a>--%>
                        <%--<a href="/item/delete/${item.id}" type="button" class="btn btn-sm btn-danger">删除</a>--%>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </form>
</div>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>
