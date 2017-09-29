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
        <h1 class="display-3 text-center"> MEET THE FINALISTS </h1>
        <div class="container-fluid text-center">
            <div class="row">
                <div class="flex-parent">
                    <div><img src="<spr:url value="/resources/lxg_fiesta/media/finalists/IFY30.JPG"/>" alt="Red Media" class="img-responsive finalist-image"/> </div>
                    <div><img src="<spr:url value="/resources/lxg_fiesta/media/finalists/OBINNA1231.JPG"/>" alt="Pulse 4 NG" class="img-responsive finalist-image"/> </div>
                </div>
                <div class="flex-parent">
                    <div><img src="<spr:url value="/resources/lxg_fiesta/media/finalists/BUGATTI.JPG"/>" alt="Godwin Olatunde" class="img-responsive finalist-image"/></div>
                    <div><img src="<spr:url value="/resources/lxg_fiesta/media/finalists/GODMC.JPG"/>" alt="Toby Daniels" class="img-responsive finalist-image" /> </div>
                </div>
                <div class="flex-parent">
                    <div><img src="<spr:url value="/resources/lxg_fiesta/media/finalists/MAGNANIMOUS.JPG"/>" alt="Burger Zone" class="img-responsive finalist-image"/> </div>
                    <div><img src="<spr:url value="/resources/lxg_fiesta/media/finalists/KAYJAY.JPG"/>" alt="53vn" class="img-responsive finalist-image" /></div>
                </div>
                <div class="flex-parent">
                    <div><img src="<spr:url value="/resources/lxg_fiesta/media/finalists/MR.OGA.JPG"/>" alt="Innards Ventures" class="img-responsive finalist-image"/> </div>
                    <div><img src="<spr:url value="/resources/lxg_fiesta/media/finalists/THE_BRAZILIAN.JPG"/>" alt="WALKR" class="img-responsive finalist-image"/> </div>
                </div>
            </div>
        </div>
    </section>
    <script type="text/javascript" src="<spr:url value="/resources/js/jquery-3.2.1.min.js"/>"></script>
    <script type="text/javascript" src="<spr:url value="/resources/js/jquery.validate.min.js"/>"></script>
    <jsp:include page="fragment/footer.jsp"/>
</body>
</html>
