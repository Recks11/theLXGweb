<%@ taglib prefix="spr" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>

    <title>${title}</title>
    <!--Meta-->
    <%--<meta name="author" content="Ijiekhuamen Rex">--%>
    <!--  Essential META Tags -->
    <meta charset="UTF-8">

    <!-- Twitter Card data -->
    <meta name="twitter:card" content="summary">
    <meta name="twitter:site" content="@Recks11">
    <meta name="twitter:title" content="TheLXG - Home">
    <meta name="twitter:description" content="Welcome! to TheLXG fifa competition online registration page">
    <meta name="twitter:creator" content="@Recks11">
    <meta name="twitter:image" content="<spr:url value="/resources/images/metaThumbNail-lg.jpg"/> ">

    <meta property="og:title" content="TheLXG FIFA Competition">
    <meta property="og:description" content="Welcome to TheLXG Fifa competition online registration page.">
    <meta property="og:image" content="<spr:url value="/resources/images/metaThumbNail-lg.jpg"/> ">
    <meta property="og:url" content="http://www.thelxg.com.ng">


    <!--  Non-Essential, But Recommended -->

    <meta property="og:site_name" content="TheLXG - Home">
    <meta name="twitter:image:alt" content="TheLXG background">

    <sec:csrfMetaTags /> <!--//CSRF token for non-www-encoded-ajax requests-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="keywords" content="theLXG, fifa competition nigeria, thelxg fifa">
    <meta name="description" content="Welcome! to TheLXG fifa competition website. Register now and stand a chance to win N500,000">


    <!--Bootstrap-->
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/bootstrap3/bootstrap.min.css"/> "/>
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/jquery.selectBoxIt.css"/> "/>

    <!-- Fonts -->
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/font-awesome.min.css"/>"/>
    <link href="https://fonts.googleapis.com/css?family=Orbitron" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=BenchNine|Lilita+One|Montserrat|Open+Sans" rel="stylesheet">

    <!--favicon-->
    <link rel="icon" href="<spr:url value="/favicon.ico"/>">

    <!-- Animation Styles -->
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/animate/animate.min.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/animate/hover.css"/>"/>

    <!-- Personal Styles -->
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/navbarStyles.css"/> "/>
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/LXG_animate.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/generalStyles.css"/> "/>
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/footerStyles.css"/> "/>

    <!--JavaScript-->
    <script type="text/javascript" src="<spr:url value="/resources/js/jquery-3.2.1.min.js"/>"></script>
    <script type="text/javascript" src="<spr:url value="/resources/js/bootstrap.min.js"/>"></script>
    <script type="text/javascript" src="<spr:url value="/resources/js/jquery.validate.min.js"/>"></script>


    <!-- JqueryUI -->
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/jquery-ui.css"/> "/>
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/jquery-ui.structure.css"/> "/>
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/jquery-ui.theme.css"/> "/>
</head>