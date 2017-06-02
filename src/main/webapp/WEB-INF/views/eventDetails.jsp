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
<link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/eventStyle.css"/>"/>
<body>
<jsp:include page="fragment/navbar.jsp"/>
<!-- top Container -->


<div class="bg-image">
    <div class="bg-cover">
        <section>
            <div class="no-pad event-content animated fadeInDownBig">
                <div class="event-details text-center">
                    <h2>ABOUT THE COMPETITION</h2>
                    <br/>
                    <div class="row">
                        <div class="col-xs-12 text-center head-text no-pad">

                            <p>Earn yourself bragging rights and stand a chance to win  &#8358;500,000</p>
                            <p>4096 participants will participate in a Playstation 4 FIFA 17 competition across Lagos.</p>
                            <p> Participants will be split into equal halves with 2048 each coming from Lagos Mainland and Lagos Island.</p>
                            <p>Participants will compete in the preliminaries from the 1st of July to 16th of July, 2017.</p>
                            <p>All rounds will run on weekends only (i.e. Saturdays and Sundays) at specified venues.</p>
                            <p>The Main event will hold on the 5th of August, 2017</p>
                            <p> which will feature the final and third place matches.</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </div>
</div>

</body>
</html>
