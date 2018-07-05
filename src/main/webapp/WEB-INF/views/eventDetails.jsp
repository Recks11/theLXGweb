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
                        <div class="col-xs-12 text-center head-text no-pad mont-Font">

                            <p>Participants across Lagos will participate in a Playstation 4 FIFA 17 competition.</p>
                            <p>The preliminaries will run from the 5th of August to the 27th of August, 2017, with all
                                games running on weekends only</p>
                            <p>This competition will run at Hitbox Games, Leisure Mall, Surulere</p>
                            <p>with the Main event holding on the 9th of september, 2017 </p>
                            <p>which will feature the final and third place matches.</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </div>
</div>
<!--JavaScript-->
<script type="text/javascript" src="<spr:url value="/resources/js/jquery-3.2.1.min.js"/>"></script>
<script type="text/javascript" src="<spr:url value="/resources/js/bootstrap.min.js"/>"></script>
<script type="text/javascript" src="<spr:url value="/resources/js/jquery.validate.min.js"/>"></script>
</body>
</html>
