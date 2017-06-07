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
<link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/vendorStyle.css"/>"/>
<body>
<jsp:include page="fragment/navbar.jsp"/>
<!-- top Container -->


<div class="bg-image">
    <div class="bg-cover">
        <section>
            <div class="no-pad vendor-content animated fadeInDownBig">
                <div class="vendor-details text-center">
                    <h2 >STARTUPS AND VENDORS</h2>
                    <br/>
                    <div class="row">
                        <%--<div class="col-xs-4">--%>
                            <%--<h2>Startups and Vendors</h2>--%>
                        <%--</div>--%>
                        <div class="col-xs-12 text-left head-text"  >
                            <p>LXG 17 trade fair creates a platform for businesses to grow their customer base, market their products and ultimately, make profit.</p><br/>
                            <p>The trade fair is scheduled to hold on the 15th, 16th, 22nd, 23rd, 29th and 30th of July, 2017.</p>
                            <p>Time is 9am - 6pm.</p>
                            <h2 class="text-center gold">DAILY PRICING</h2>
                            <p class="pricing">Lagos Mainland - 20,000 Naira/stand</p>
                            <p class="pricing">Lagos Island - 30,000 Naira/stand</p>
                            <p class="pricing">***You get 10% discount if you book for 2 days and above.***</p>
                            <h2 class="text-center gold">HOW TO BOOK</h2>

                            <p>1. Pay into this account</p>
                            <p class="children">Name: ADELIYI OLUWASEYI DAVID</p>
                            <p class="children">Account Number: 2062888776</p>
                            <p class="children">Bank: UBA</p>
                            <p>OR</p>
                            <p class="children">Name: ADARE OLUWASOLA BOLADE</p>
                            <p class="children">Account Number: 3061633000</p>
                            <p class="children">Bank: FIRST BANK OF NIGERIA</p>
<br/>

                            <p class="parent">2. Send a mail to fair@thelxg.com.ng including the following details.</p>
                            <p class="children">&rarrb; Name of Business</p>
                            <p class="children">&rarrb; Brief description of your business</p>
                            <p class="children">&rarrb; Phone number</p>
                            <p class="children">&rarrb; Where do you want your stand? - Lagos Mainland or Lagos Island or both</p>
                            <p class="children">&rarrb; No. of Days Booked</p>
                            <p class="children">&rarrb; Attached evidence of Payment</p>
<br/>
                            <p>3. We will send you a mail confirming your booking.</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </div>
</div>
<script src="<spr:url value="/resources/js/home-scroll-filter.js"/> "></script>
<jsp:include page="fragment/footer.jsp"/>
</body>
</html>
