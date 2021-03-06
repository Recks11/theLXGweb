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
<link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/faq.css"/>"/>
<body>
<jsp:include page="fragment/navbar.jsp"/>
<!-- top Container -->
<div class="bg-cover">

    <section>
        <div class="no-pad about-content animated fadeInDownBig">
            <div class="faq-details text-left mont-Font">
                <h2 class="gold">FAQ</h2>
                <br/>
                <p>Q1: How do I know the venue for my fixture?</p>
                <p class="gold">A1: The exact venue for your fixture will be sent to you via email.</p>
                <br/>
                <p>Q2: I didn't get an email when I registered, what should I do?</p>
                <p class="gold">A2: Send a mail to info@thelxg.com.ng using a valid email address and your complaint. We
                    will take it form there.</p>
                <br/>
                <p>Q3: How will I know the time for my game?</p>
                <p class="gold">A3: Times for your fixture will be sent to you before each game provided as you qualify
                    for each round of the competition</p>
                <br/>
                <p>Q4: Do I have to pay once or will I pay for each game I play?</p>
                <p class="gold">A4: You only pay once for the competition. Your payment secures you to every game in the
                    competition, provided you qualify for those games.</p>
                <br/>
                <p>Q5: How many matches will I play to win &#8358;500,000?</p>
                <p class="gold">A5: To win the &#8358;500,000, you must qualify from the group stages to the knock out
                    rounds before you reach the finals. A win then secures you the cash prize.</p>
                <br/>
                <p>Q6: Is it a PlayStation 3, PlayStation 4, X Box or X Box one competition?</p>
                <p class="gold">A6: It is a PlayStation 4 competition.</p>
                <br/>
                <p>Q7: What teams will be used for the competition? FUT teams or the regular teams?</p>
                <p class="gold">A7: The regular teams will be used for the competition. Not FUT teams.</p>
                <br/>
                <%--<p>Q8: Can I bring my PlayStation 4 controller along with me?</p>--%>
                <%--<p class="gold">A8: Yes, you can come along with your PlayStation 4 controller. You will be allowed to use it for your game.</p>--%>
                <%--<br/>--%>
                <br/>
                <br/>
                <p class="text-right">*** Don't seem to find what you're looking for. Kindly send a mail to <span
                        class="gold"><a href="mailto:info@thelxg.com.ng">info@thelxg.com.ng</a></span> or reach us via
                    our social media channels and we'd be glad to answer your questions.</p>
            </div>
        </div>
    </section>
</div>
<script src="<spr:url value="/resources/js/home-scroll-filter.js"/> "></script>
<jsp:include page="fragment/footer.jsp"/>
</body>
</html>
