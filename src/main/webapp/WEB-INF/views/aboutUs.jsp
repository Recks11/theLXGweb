<%--
  Created by IntelliJ IDEA.
  User: rex
  Date: 26/05/2017
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<jsp:include page="fragment/imports.jsp"/>
<link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/about.css"/>"/>
<body>
<jsp:include page="fragment/navbar.jsp"/>
<!-- top Container -->
    <div class="bg-cover">
        <section>
            <div class="no-pad about-content animated fadeInDownBig">
                <div class="about-details text-center">
                    <h2 class="gold">ABOUT US</h2>
                    <br/>
                   <P>The League of Extraordinary Gamers is a body that brings a convergence of gamers across the world.</P>
                    <P> We are building the spirit of gaming and developing a globally recognised community</P>
                    <p> of gamers and game enthusiasts.</P>
                </div>
            </div>
        </section>
    </div>
<script src="<spr:url value="/resources/js/home-scroll-filter.js"/> "></script>
<jsp:include page="fragment/footer.jsp"/>
</body>
</html>
