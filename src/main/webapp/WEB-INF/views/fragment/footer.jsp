<%@ taglib prefix="spr" uri="http://www.springframework.org/tags"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<footer id="footer" class="bg-footer">
    <div class="container-fluid text-center">
        <div class="col-sm-3 white-font">
            <H4><img src="<spr:url value="/resources/images/theLXGlogo.png"/>" class="img-responsive footer-img" style="display:inline"
                     alt="THE LXG LOGO" height="auto"></H4>
            <p>The League of Extraordinary Gamers</p>

            <%--<h4>About us:</h4>--%>
            <%--<P>The League of Extraordinary Gamers is a body that brings a convergence of gamers across the world.--%>
                <%--We are building the spirit of gaming and developing a globally recognised community of gamers and game enthusiasts.</p>--%>
        </div>
        <div class="col-sm-3 white-font">
            <ul class="footer-li">
                <li class="first-line">NAVIGATION</li>
                <li><a href="<spr:url value="/"/> ">HOME</a></li>
                <%--<li><a href="<spr:url value="/vendor/"/> ">VENDORS</a></li>--%>
                <li><a style="color: springgreen;" href="<spr:url value="/fixtures/"/> ">FIXTURES</a></li>
                <li><a href="<spr:url value="/event/"/> ">EVENT DETAILS</a></li>
                <%--<li><a href="<spr:url value="/enter/"/> ">ENTER COMPETITION</a></li>--%>
                <%--<li> <a href="<spr:url value="/enter/registrationCenters"/> "> REGISTRATION CENTERS </a></li>--%>
                <li><a href="<spr:url value="/aboutUs"/> ">ABOUT US</a></li>
                <li><a href="<spr:url value="/faq"/> ">FAQ</a></li>
                <li><a style="color: springgreen;" href="<spr:url value="/download/pdf/RuleBookNew.pdf"/>">RULE BOOK</a></li>
            </ul>
        </div>
        <div class="col-sm-3 white-font">
            <hr class="sr-only"/>
            <ul class="footer-li">
                <li class="first-line">CALL US</li>
                <li>+234 808 772 0872</li>
                <li>+234 817 698 9182</li>
            </ul>
        </div>
        <div class="col-sm-3 white-font">
            <div class="container-fluid no-pad">

                <ul class="footer-li">
                    <li class="first-line"> FOLLOW US</li>
                    <li><div class="footer-social">
                        <p><a href="#footer" onclick="socialClickOp('https://facebook.com/thereallxg')" style="font-size: 30px; color: white;">
                            <i class="fa fa-facebook"></i></a>
                            <a href="#footer" onclick="socialClickOp('https://twitter.com/thelxg_')" style="font-size: 30px; color: white;">
                            <i class="fa fa-twitter"></i></a>
                            <a href="#footer" onclick="socialClickOp('https://instagram.com/thelxg_')" style="font-size: 30px; color: white;">
                                <i class="fa fa-instagram"></i></a>
                            <a href="#footer" onclick="socialClickOp('https://www.youtube.com/channel/UChEKFU3rf_-9UWwfasaDi0A')" style="font-size: 30px; color: white;">
                                <i class="fa fa-youtube-play"></i></a>
                        </p>
                        </div>
                    </li>
                    <li><small>@thelxg_</small></li>
                    <li><a href="mailto:info@thelxg.com.ng">email: info@thelxg.com.ng</a></li>
                </ul>

            </div>
        </div>
    </div>
    <div class="container-fluid">
    <div class="row">
        <div class="col-xs-offset-2 col-xs-8 text-center white-font no-bottom-margin bottom-foot">
            <hr/>
            <p class="no-bottom-margin"> <small>Website made By <a onclick="socialClickOp('https://twitter.com/recks11')" href="#footer">Ijiekhuamen Rex</a></small> </p>
            <p><small>medal icons made by <a href="http://www.flaticon.com/authors/vectors-market"> vector market </a> from <a href="http://www.flaticon.com"> www.flaticon.com </a></small></p>
        </div>
    </div>
    </div>


</footer>
