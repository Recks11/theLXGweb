<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/homeStyle.css"/>"/>
<jsp:include page="fragment/imports.jsp"/>
<body>

<jsp:include page="fragment/navbar.jsp"/>
<!-- top Container -->
<section id=banner>
    <div class="section-bg-color">
        <div class="container-fluid text-center" style="height: 100%;">
            <div class="home-face header-content animated fadeInDown">
                <div class="headText">
                    <h3>THE LEAGUE OF EXTRAORDINARY GAMERS</h3>
                    <h3> PRESENTS</h3>
                    <br/>
                    <br/>
                    <h3>LXG<span>FIFA 17</span> TOURNAMENT</h3>
                </div>
            </div>
        </div>
    </div>
</section>
<section class="section-0">
    <div class="darkGrey-color">
        <!-- Second Container -->
        <div class="container home-content-1 bg-2">
            <div class="home-content-text">
                <div class="row text-center">
                    <h1>ARE YOU BADASS AT FIFA 17?</h1>
                </div>
                <div class="row">
                    <div class="col-xs-12 text-center head-text mont-font">
                        <p>Earn yourself bragging rights and stand a chance to win &#8358;500,000</p>
                        <p>4 weekends, 12 Rounds, 1 winner</p>
                        <p class="gold">Venues at Lagos Mainland and Lagos Island</p>
                        <p class="gold">REGISTRATION FEE IS &#8358;2000</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-xs-12 text-center full-pad head-text mont-font">
                        <a class="enterBtn" href="<spr:url value="/enter/"/>"> Register Here </a>
                        <p style="padding-top: 6px;"> **Registration Closes on the 10th of July, 2017**</p>

                    </div>
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
                        <img src="<spr:url value="/resources/images/vectors-market.svg"/>" class="img-responsive prize-image" height="auto"/>
                    </div>

                    <div class="col-xs-12 col-md-8 col-md-pull-4">
                        <div class="prize-container text-center">
                            <H1 class=" gold mont-Font">FIRST PLACE</H1>
                            <p class="gold" >&#8358 500,000</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section class="section-2">
            <div class="container skewed-text">
                <div class="row">
                    <div class="col-xs-12 col-md-4 col-md-push-8">
                        <img src="<spr:url value="/resources/images/vectors-market2.svg"/>" class="img-responsive prize-image" height="auto"/>
                    </div>

                    <div class="col-xs-12 col-md-8 col-md-pull-4">
                        <div class="prize-container text-center">
                            <h2 class="silver mont-Font">SECOND PLACE</h2>
                            <p class="silver">&#8358 200,000</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section class="section-3">
            <div class="container skewed-text">
                <div class="row">
                    <div class="col-xs-12 col-md-4 col-md-push-8">
                        <img src="<spr:url value="/resources/images/medal.svg"/>" class="img-responsive prize-image" height="auto"/>
                    </div>

                    <div class="col-xs-12 col-md-8 col-md-pull-4">
                        <div class="prize-container text-center">
                            <h3 class="bronze mont-Font">THIRD PLACE</h3>
                            <p class="bronze">&#8358 100,000</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </div>
</section>

<%--<section class="bg-black vendor-section">--%>
    <%--<div class="container">--%>
        <%--<div class="row">--%>
            <%--<div class="col-xs-12 text-center full-pad white-font vendor-text">--%>
                <%--<h2>Are you a Startup or a Vendor?</h2>--%>

                <%--<p>Reach your target customers and make sales in our Trade fair</p>--%>
            <%--</div>--%>
        <%--</div>--%>
        <%--<div class="row white-font">--%>
            <%--<div class="col-xs-12 text-center full-pad">--%>
                <%--<a class="vendor-btn" href="<spr:url value="/vendor/"/>"> Details Here </a>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</section>--%>

<jsp:include page="fragment/footer.jsp"/>
<script src="<spr:url value="/resources/js/home-scroll-filter.js"/> "></script>
</body>
</html>
