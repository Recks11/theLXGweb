<%@ taglib prefix="spr" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>

    <title> TheLXG - Admin</title>
    <!--Meta-->
    <%--<meta name="author" content="Ijiekhuamen Rex">--%>
    <!--  Essential META Tags -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <sec:csrfMetaTags /> <!--//CSRF token for non-www-encoded-ajax requests-->
    <!--Bootstrap-->
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/bootstrap3/bootstrap.min.css"/> "/>

    <base href="http://localhost:8080/thelxg.com.ng/">
    <!-- Fonts -->
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/font-awesome.min.css"/>"/>

    <!--favicon-->
    <link rel="icon" href="<spr:url value="/favicon.ico"/>">

    <%--<!-- Animation Styles -->--%>
    <%--<link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/animate/animate.min.css"/>"/>--%>
    <%--<link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/animate/hover.css"/>"/>--%>

    <!-- Personal Styles -->
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/adminStyles.css"/> "/>

    <!--JavaScript-->
    <script type="text/javascript" src="<spr:url value="/resources/js/jquery-3.2.1.min.js"/>"></script>
    <script type="text/javascript" src="<spr:url value="/resources/js/bootstrap.min.js"/>"></script>
    <script type="text/javascript" src="<spr:url value="/resources/js/jquery.validate.min.js"/>"></script>

</head>