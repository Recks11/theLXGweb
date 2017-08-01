<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>

<jsp:include page="fragment/imports.jsp"/>
<link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/homeStyle.css"/>"/>
<body>
<script>
    // Set the date we're counting down to
    var countDownDate = new Date("Aug 5, 2017 00:00:00").getTime();

    // Update the count down every 1 second
    var x = setInterval(function() {

        // Get todays date and time
        var now = new Date().getTime();

        // Find the distance between now an the count down date
        var distance = countDownDate - now;

        // Time calculations for days, hours, minutes and seconds
        var days = Math.floor(distance / (1000 * 60 * 60 * 24));
        var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
        var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
        var seconds = Math.floor((distance % (1000 * 60)) / 1000);

        // Output the result in an element with id="demo"
        document.getElementById("timeLeft").innerHTML = days + "<span style=\" color: springgreen; \">d</span> " + hours + "<span style=\" color: springgreen; \">h</span> "
            + minutes + "<span style=\" color: springgreen; \">m</span> " + seconds + "<span style=\" color: springgreen; \">sec</span> ";

        // If the count down is over, write some text
        if (distance < 0) {
            clearInterval(x);
            document.getElementById("timeLeft").innerHTML = "Competition has begun, ";
        }
    }, 1000);
</script>
<jsp:include page="fragment/navbar.jsp"/>
<!-- top Container -->
<section id=banner>
    <div class="section-bg-color">
        <div class="container-fluid text-center" style="height: 100%;">
            <div class="home-face header-content animated fadeInDown centered-parent">
                <div class="centered-content">
                    <div class="headText">
                        <h3>THE LEAGUE OF EXTRAORDINARY GAMERS</h3>
                        <h3> PRESENTS</h3>
                        <br/>
                        <br/>
                        <h3>LXG<span>FIFA 17</span> TOURNAMENT</h3>
                        <h3 id="timeLeft"></h3>
                        <p class="gold">&#8680; <a href="<spr:url value="/download/pdf/ruleBook.pdf"/>">Download rule book</a> &#8678;</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<section class="section-0">
    <div class="darkGrey-color">
        <!-- Second Container -->
        <div class="container home-content-1 bg-2 centered-parent">
            <div class="home-content-text centered-content">
                <div class="row text-center">
                    <h1>ARE YOU BADASS AT FIFA 17?</h1>
                </div>
                <div class="row">
                    <div class="col-xs-12 text-center head-text mont-font">
                        <p>Earn yourself bragging rights and stand a chance to win &#8358;500,000</p>
                        <br/>
                        <p class="gold">Venues at Lagos Mainland and Lagos Island</p>
                        <p class="gold">REGISTRATION FEE IS &#8358;2000</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-xs-12 text-center full-pad head-text mont-font">
                        <a class="enterBtn" href="<spr:url value="/enter/"/>"> Register Here </a>
                        <p style="padding-top: 6px;"> **Competition starts 5th August, 2017**</p>
                        <p class="gold" style="margin-top: 6px;">
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

<section class="sponsor-bg vendor-section">
    <div class="sponsor-container">
        <div class="row">
            <div class="sponsor-parent">
                <div><img src="<spr:url value="/resources/images/Web_Sponsors/red-media.png"/>" alt="Red Media" class="img-responsive sponsor-image" /> </div>
                <div><img src="<spr:url value="/resources/images/Web_Sponsors/Pulse-4-.png"/>" alt="Pulse 4 NG" class="img-responsive sponsor-image" /> </div>
                <div><img src="<spr:url value="/resources/images/Web_Sponsors/CYCLES.png"/>" alt="Cycles" class="img-responsive sponsor-image" /></div>
            </div>
            <div class="sponsor-parent">
                <div><img src="<spr:url value="/resources/images/Web_Sponsors/innards logo.png"/>" alt="Innards Ventures" class="img-responsive sponsor-image" /> </div>
                <div><img src="<spr:url value="/resources/images/Web_Sponsors/walkr.png"/>" alt="WALKR" class="img-responsive sponsor-image" /> </div>
                <div><img src="<spr:url value="/resources/images/Web_Sponsors/puvrex.png"/>" alt="Purvey" class="img-responsive sponsor-image" /> </div>
            </div>
            <div class="sponsor-parent">
                <div><img src="<spr:url value="/resources/images/Web_Sponsors/White.png"/>" alt="Godwin Olatunde" class="img-responsive sponsor-image" /></div>
                <div><img src="<spr:url value="/resources/images/Web_Sponsors/toby_daniels.png"/>" alt="Toby Daniels" class="img-responsive sponsor-image" /> </div>
                <div><img src="<spr:url value="/resources/images/Web_Sponsors/naijaloaded.png"/>" alt="NaijaLoaded" class="img-responsive sponsor-image" /></div>
            </div>
            <div class="sponsor-parent">
                <div><img src="<spr:url value="/resources/images/Web_Sponsors/Burger_zone.png"/>" alt="Burger Zone" class="img-responsive sponsor-image" style="margin-top: 40px;"/> </div>
                <div><img src="<spr:url value="/resources/images/53vn-future-logo.png"/>" alt="53vn" class="img-responsive sponsor-image" style="margin-top: 40px;"/></div>
                <div><img src="<spr:url value="/resources/images/KRAKS Events Logo small.png"/>" alt="Kraks TV" class="img-responsive sponsor-image" style="margin-top: 40px;"/></div>
            </div>
            <div class="sponsor-parent">
                <div><img src="<spr:url value="/resources/images/Web_Sponsors/ynaija_small.PNG"/>" alt="Y naija" class="img-responsive sponsor-image" style="margin-top: 40px;"/> </div>
                <div><img src="<spr:url value="/resources/images/Web_Sponsors/arcoLOGO.png"/>" alt="Arco" class="img-responsive sponsor-image" style="margin-top: 40px;"/></div>
                <div><img src="<spr:url value="/resources/images/Web_Sponsors/jekaplay_small.JPG"/>" alt="jekaplay" class="img-responsive sponsor-image" style="margin-top: 40px;"/></div>
            </div>
        </div>
    </div>
</section>

<jsp:include page="fragment/footer.jsp"/>
<script src="<spr:url value="/resources/js/home-scroll-filter.js"/> "></script>
</body>
</html>
