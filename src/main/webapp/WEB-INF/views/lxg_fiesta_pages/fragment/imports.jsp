<%@ taglib prefix="spr" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: rex
  Date: 22/09/2017
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <!--Meta-->
    <meta name="author" content="Ijiekhuamen Rex">
    <!--  Essential META Tags -->
    <meta charset="UTF-8">
    <!-- Twitter Card data -->
    <meta name="twitter:title" content="LXG'17 FIESTA - HOME">
    <meta name="twitter:description" content="Welcome to the LXG'17 FIESTA​. Click to register">
    <meta name="twitter:creator" content="@Recks11">
    <meta name="twitter:image" content="http://www.thelxg.com.ng/resources/lxg_fiesta/media/images/LXG'17_FIESTA.jpg">
    <meta name="twitter:card" content="summary_large_image">
    <meta name="twitter:image:alt" content="TheLXG background">
    <meta property="og:title" content="LXG'17 FIESTA - HOME">
    <meta property="og:description" content=" Welcome to the League of Extraordinary Gamers FIFA 17 competition​. Click to register">
    <meta property="og:image" content="http://www.thelxg.com.ng/resources/lxg_fiesta/media/images/LXG'17_FIESTA.jpg">
    <meta property="og:url" content="http://www.thelxg.com.ng/fiesta/home">
    <meta property="og:type" content="website" />
    <meta property="og:site_name" content="TheLXG - Home">
    <sec:csrfMetaTags /> <!--//CSRF token for non-www-encoded-ajax requests-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="keywords" content="theLXG, fifa competition nigeria, thelxg fifa, lxg fiesta">
    <meta name="description" content="Welcome! to LXG'17 fiesta.">
    <title>${title}</title>

    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="icon" href="<spr:url value="/favicon.ico"/>">
    <link rel="apple-touch-icon" href="<spr:url value="/apple-touch-icon"/> ">

    <link rel="apple-touch-icon" href="<spr:url value="/resources/lxg_fiesta/media/images/theLXGlogo-small.png"/> ">
    <!-- Place favicon.ico in the root directory -->
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/font-awesome.min.css"/>"/>
    <link rel="stylesheet" href="<spr:url value="/resources/lxg_fiesta/css/bootstrap.min.css"/> ">
    <link rel="stylesheet" href="<spr:url value="/resources/lxg_fiesta/css/navbar4.0.css"/>">
</head>

