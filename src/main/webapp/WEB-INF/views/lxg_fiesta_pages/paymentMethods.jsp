<%--
  Created by IntelliJ IDEA.
  User: rex
  Date: 29/09/2017
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<jsp:include page="fragment/imports.jsp"/>
<link rel="stylesheet" type="text/css" href="<spr:url value="/resources/lxg_fiesta/css/paymentStyles.css"/>"/>
<link rel="stylesheet" type="text/css" href="<spr:url value="/resources/lxg_fiesta/css/FiestaFormStyles.css"/> ">
<link rel="stylesheet" href="<spr:url value="/resources/lxg_fiesta/css/FiestaFooterStyles.css"/> ">
<body>
<jsp:include page="fragment/navbar.jsp"/>
<!-- top Container -->
<div class="bg-cover">

    <section class="container">
        <div class="no-pad about-content animated fadeInDownBig">
            <div class="faq-details text-left mont-Font">
                <br/>
                <h2 class="gold">Cash Registration</h2>
                <br/>
                <p class="gold" style="margin-bottom: 2px;">&#8595; Pay into this account</p>
                <p class="children">&#8594; Name: ADELIYI OLUWASEYI DAVID</p>
                <p class="children">&#8594; Amount: &#8358;2000</p>
                <p class="children">&#8594; Account Type: Savings</p>
                <p class="children">&#8594; Account Number: 2062888776</p>
                <p class="children" style="margin-bottom: 10px;">&#8594; Bank: UBA</p>
                <p class="gold" style="margin-bottom: 2px;">&#8595; Send evidence of payment (your teller) and your
                    registration data to <a href="mailto:info@thelxg.com.ng"
                                            style="text-decoration: none; color:rgb(32, 28, 85);; font-size: inherit">info@thelxg.com.ng </a>
                </p>
                <p class="children">Registration data includes:</p>
                <p class="children">&#8594; First Name</p>
                <p class="children">&#8594; Last Name</p>
                <p class="children">&#8594; Alias(nickname)</p>
                <p class="children">&#8594; Email Address</p>
                <p class="children">&#8594; Phone Number</p>
                <p class="children">&#8594; Twitter Handle / Instagram Handle or both</p>
                <p class="children">&#8594; Selected Team</p>
                <p class="children" style="margin-bottom: 10px;">&#8594; Location (lagos island / lagos Mainland)</p>
                <p class="gold">&#10003; You will receive an email confirming your registration</p>
            </div>
        </div>
    </section>
</div>
<script type="text/javascript" src="<spr:url value="/resources/js/jquery-3.2.1.min.js"/>"></script>
<script type="text/javascript" src="<spr:url value="/resources/js/jquery.validate.min.js"/>"></script>
<script src="<spr:url value="/resources/js/home-scroll-filter.js"/> "></script>
<script src="<spr:url value="/resources/lxg_fiesta/js/popper.min.js"/>"></script>
<script src="<spr:url value="/resources/lxg_fiesta/js/bootstrap.min.js"/>"></script>
<script src="<spr:url value="/resources/lxg_fiesta/js/ie10-viewport-bug-workaround.js"/>"></script>
<jsp:include page="fragment/footer.jsp"/>

</body>
</html>
