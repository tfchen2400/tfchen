<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tfche
  Date: 2016/10/12
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>登录</title>
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="login page">
    <meta name="author" content="chentf">
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="js/bootstrap/css/bootstrap.min.css">

    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]>
    <script src="js/my/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="js/my/ie-emulation-modes-warning.js"></script>

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="js/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>

<div class="container">

    <form class="form-signin" role="form" action="dologin" method="post">
        <h2 class="form-signin-heading">登陆(${title.content})</h2>
        <c:if test="${msg != null}">
            <p style="color: red">${msg}!</p>
        </c:if>
        <input type="account" class="form-control" name="account" placeholder="账号:Account" required autofocus>
        <input type="password" class="form-control" name="password" placeholder="密码:Password" required>
        <!--
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> Remember me
            </label>
        </div>-->
        <button class="btn btn-lg btn-primary btn-block" type="submit">登陆</button>
        <button class="btn btn-lg btn-primary btn-block" type="button">注册</button>
    </form>

</div>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="js/my/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
