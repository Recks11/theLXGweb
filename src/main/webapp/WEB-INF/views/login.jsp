<%--
  Created by IntelliJ IDEA.
  User: Ijiekhuamen Rex
  Date: 3/7/2017
  Time: 3:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spr" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--favicon-->
    <link rel="icon" href="<spring:url value="/favicon.ico"/>">

    <title>LXG - Login</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/loginStyle.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/css/font-awesome.min.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/css/LXG_animate.css"/>"/>
</head>
<body>
<div class="parent">
    <div class="login-form">
        <div class="actual-form">
            <!--<c:url value="/login" var="login"/>-->
            <div class="form-body">
                <a href="<spr:url value="/"/>"><img class="profile-img"
                                                    src="<c:url value="/resources/images/theLXGlogo-small.png"/>"
                                                    alt="Amuwo-odofin"/></a>
                <form:form class="form-signin" action="login" method="post">
                    <div class="input-group">
                        <i class="fa fa-user"></i>
                        <input path="username" id="username" type="text" class="form-control underline-blue"
                               name="username" placeholder="Username"/>
                    </div>
                    <div class="input-group">
                        <i class="fa fa-lock"></i>
                        <input id="password" type="password" class="form-control underline-blue" name="password"
                               placeholder="Password"/>
                    </div>
                    <div class="submit-btn">
                        <input type="submit" value="login" class="underline-blue"/>
                    </div>
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
                    <%--Sign in</button>--%>
                    <c:if test="${not empty error}">
                        <div id="status" class="text-center" style="padding-top:5px; text-align: center">
                                ${error}
                        </div>
                    </c:if>
                    <c:if test="${not empty message}">
                        <div id="status" class="text-center" style="padding-top:5px; text-align: center">
                                ${message}
                        </div>
                    </c:if>
                </form:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>