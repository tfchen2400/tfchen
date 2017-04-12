<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <title>person</title>
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta charset="UTF-8">
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="js/bootstrap/css/bootstrap.min.css">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="js/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="header">
    <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                        data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Chentf system</a>
            </div>


            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">欢迎：${sessionScope.get("userInfo").account}
                            <c:if test='${sessionScope.get("userInfo").type == "1"}'>(会员)</c:if>
                            <c:if test='${sessionScope.get("userInfo").type == "0"}'>(管理员)</c:if>
                            <span class="caret"></span>
                        </a>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="#">设置账户</a></li>
                            <!--
                            <li><a href="#">Another action</a></li>
                            <li><a href="#">Something else here</a></li>
                            -->
                            <li class="divider"></li>
                            <li><a href="loginOut">登出</a></li>
                        </ul>
                    </li>
                    <li style="padding-top: 5px;padding-bottom: 5px;">
                        <img style="height: 40px; margin-left: 10px; margin-right: 15px;" src="img/pen.jpg">
                    </li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div>
    </nav>
</div>
<div class="col-xs-2 sidebarContainer" style="margin-top: 70px;">
    <aside class="sidebar">
        <a href="#" class="list-group-item">用户管理</a>
        <a href="#" class="list-group-item">菜单1</a>
        <a href="#" class="list-group-item">菜单1</a>
        <a href="#" class="list-group-item">菜单1</a>
        <a href="#" class="list-group-item">菜单1</a>
    </aside>
</div>
<div class="col-xs-10 mainContainer container-fluid" style="height:100%;overflow: auto;margin-top: 50px;">
    <div style="margin-top: 20px;">
        <ol class="breadcrumb">
            <li><a href="#">Chentf system</a></li>
            <li class="active">mainPage</li>
        </ol>
    </div>
    <div>
        <div class="jumbotron">
            <h1>欢迎登陆页面！</h1>
            <p>这是一个超大屏幕（Jumbotron）的实例。</p>
            <p><a class="btn btn-primary btn-lg" role="button">
                学习更多</a>
            </p>
        </div>
    </div>
</div>
</body>
</html>
