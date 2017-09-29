<%@ taglib prefix="spr" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: rex
  Date: 29/09/2017
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="fragment/imports.jsp"/>
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/lxg_fiesta/css/meetFinalistsStyles.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/lxg_fiesta/css/FiestaFormStyles.css"/> ">
    <link rel="stylesheet" href="<spr:url value="/resources/lxg_fiesta/css/FiestaFooterStyles.css"/> ">
</head>
<body>
    <jsp:include page="fragment/navbar.jsp"/>
    <section class="finalists-section">
        <h1 class="display-1 text-center"> MEET THE FINALISTS </h1>
    </section>
    <script type="text/javascript" src="<spr:url value="/resources/js/jquery-3.2.1.min.js"/>"></script>
    <script type="text/javascript" src="<spr:url value="/resources/js/jquery.validate.min.js"/>"></script>
    <jsp:include page="fragment/footer.jsp"/>
</body>
</html>
