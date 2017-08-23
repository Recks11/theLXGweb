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
<link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/formStyle.css"/>"/>
<style>
    .form-horizontal .form-group {
        color: rgb(200,200,200);
        font-size: unset;
    }
    .submitBtn:hover{
        background-color: gold;
        color: black;
    }
</style>
<body>
<jsp:include page="fragment/navbar.jsp"/>
<!-- top Container -->
    <div class="bg-cover">
        <section>
            <div class="no-pad about-content animated fadeInDownBig">
                <div class="about-details text-center mont-Font">
                    <h2 class="gold">VOTE FOR YOR PLAYER!</h2>
                    <br/>

                    <form:form id="paymentForm" class="form-horizontal white-font" modelAttribute="voteObject" method="post">
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="Alias">PLAYER ALIAS:</label>
                            <div class="col-sm-10">
                                <form:select id="Alias" path="playerAlias" cssClass="form-control" items="${votes}"></form:select>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-12 text-center">
                                <button class="submitBtn btn-default" ${buttonStatus}>VOTE</button>
                            </div>
                        </div>
                    </form:form>
                </div>
            </div>
        </section>
    </div>
<script src="<spr:url value="/resources/js/home-scroll-filter.js"/> "></script>
<script src="<spr:url value="/resources/js/vote.js"/> "></script>
<jsp:include page="fragment/footer.jsp"/>
</body>
</html>