<%--
  Created by IntelliJ IDEA.
  User: rex
  Date: 24/05/2017
  Time: 00:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/homeStyle.css"/>"/>
<jsp:include page="fragment/imports.jsp"/>

<body>
<jsp:include page="fragment/navbar.jsp"/>
<!-- top Container -->
<section id=banner>
    <div class="section-bg-color">
        <div class="container text-center">
            <div class="home-face header-content animated fadeInDown">
                <div class="headText">
                    <h3>TheLXG PRESENTS</h3>
                    <img src="<c:url value="/resources/images/logo.png"/>" class="img-responsive" style="display:inline"
                         alt="THE LXG LOGO" width="100px" height="auto">
                    <h3>The LXG <span>FIFA 17</span> TOURNAMENT</h3>
                    <p class="slots-left"><span class="number">4096</span> slots left</p>
                </div>
            </div>
        </div>
    </div>
</section>
<section class="section-0">
    <div class="darkGrey-color">
        <!-- Second Container -->
        <div class="container home-content-1 bg-2">
            <div class="row text-center">
                <h1>ARE YOU BADASS AT FIFA 17?</h1>
            </div>
            <div class="row">
                <div class="col-xs-12 text-center head-text">
                    <p>Earn yourself bragging rights and stand a chance to win &#36;2000</p>
                    <p>4096 participants will participate in a Playstation 4 FIFA 17 competition across Lagos.</p>
                    <p> Participants will be split into equal halves with 2048 each coming from Lagos Mainland and Lagos Island.</p>
                    <p>Participants will compete in the preliminaries from the 1st of July to 16th of July, 2017.</p>
                    <p>All rounds will run on weekends only (i.e. Saturdays and Sundays) at specified venues.</p>
                    <p>The Main event will hold on the 5th of August, 2017</p>
                    <p> which will feature the final and third place matches.</p>
                </div>
            </div>
            <div class="row">
                <div class="col-xs-12 text-center full-pad">
                    <a class="enterBtn" href="<spr:url value="/enter/"/>"> Register Here </a>
                </div>
            </div>
        </div>
    </div>
</section>

<section class="section-bg">
    <div class="grey-color">
        <section class="section-1">
            <div class="container skewed-text">
                <div class="row">
                    <div class="col-xs-12 col-md-4 col-md-push-8">
                        <img src="<c:url value="/resources/images/vectors-market.svg"/>" class="img-responsive prize-image" height="auto"/>
                    </div>

                    <div class="col-xs-12 col-md-8 col-md-pull-4">
                        <div class="prize-container text-center">
                            <H1 class=" gold">FIRST PLACE</H1>
                            <p class="gold" >N500,000</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section class="section-2">
            <div class="container skewed-text">
                <div class="row">
                    <div class="col-xs-12 col-md-4 col-md-push-8">
                        <img src="<c:url value="/resources/images/vectors-market2.svg"/>" class="img-responsive prize-image" height="auto"/>
                    </div>

                    <div class="col-xs-12 col-md-8 col-md-pull-4">
                        <div class="prize-container text-center">
                            <h2 class="silver">SECOND PLACE</h2>
                            <p class="silver">N300,000</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section class="section-3">
            <div class="container skewed-text">
                <div class="row">
                    <div class="col-xs-12 col-md-4 col-md-push-8">
                        <img src="<c:url value="/resources/images/medal.svg"/>" class="img-responsive prize-image" height="auto"/>
                    </div>

                    <div class="col-xs-12 col-md-8 col-md-pull-4">
                        <div class="prize-container text-center">
                            <h3 class="bronze">THIRD PLACE</h3>
                            <p class="bronze">N100,000</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </div>
</section>

<%--<section>--%>
    <%--<div class="container">--%>
        <%--<div class="row">--%>
            <%--<div class="col-xs-12 text-center full-pad">--%>
                <%--VENDORS REGISTER HERE!--%>
            <%--</div>--%>
        <%--</div>--%>
        <%--<div class="row">--%>
            <%--<div class="col-xs-12 text-center full-pad">--%>
                <%--<a class="enterBtn" href="<spr:url value="/vendor/"/>"> Register Here </a>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</section>--%>

<jsp:include page="fragment/footer.jsp"/>
<script src="<c:url value="/resources/js/home-scroll-filter.js"/> "></script>
</body>
</html>
