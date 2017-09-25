<%@ taglib prefix="spr" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: rex
  Date: 22/09/2017
  Time: 18:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="fragment/imports.jsp"/>
<link rel="stylesheet" href="<spr:url value="/resources/lxg_fiesta/css/register_fiesta.css"/> ">
<link rel="stylesheet" href="<spr:url value="/resources/lxg_fiesta/css/FiestaFormStyles.css"/> ">

<body class="bg-hero-dark">
<jsp:include page="fragment/navbar.jsp"/>
<section class="bg-wrapper">
    <div class="bg-cover">
        <div class="container form-container">
            <h1>LXG'17 FIESTA</h1>
            <h4>Register for event</h4>

            <form:form modelAttribute="FiestaPlayerObject" method="post" id="fiestaRegForm" action="">
                <script src="https://js.paystack.co/v1/inline.js"></script>
                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="firstName" class="col-form-label">First Name</label>
                        <form:input type="text" class="form-control" path="firstName" placeholder="First Name"/>
                    </div>
                    <div class="form-group col-md-6">
                        <label for="lastName" class="col-form-label">Last Name</label>
                        <form:input type="text" class="form-control" path="lastName" placeholder="Last Name"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="alias" class="col-form-label">Alias</label>
                    <form:input type="text" class="form-control" path="alias" placeholder="Username"/>
                </div>
                <div class="form-group">
                    <label for="emailAddress" class="col-form-label">Email Address</label>
                    <form:input type="email" class="form-control" path="email" id="emailAddress" placeholder="E-Mail Address"/>
                </div>
                <div class="form-group">
                    <label for="phoneNumber" class="col-form-label">Phone Number</label>
                    <form:input type="text" class="form-control" path="phoneNumber" placeholder="phone Number"/>
                </div>
                <div class="form-group">
                    <div class="form-check-inline">
                        <label class="form-check-label" style="padding-left: 0;">
                            SOCIAL MEDIA:
                        </label>
                    </div>
                    <div class="form-check form-check-inline">
                        <label class="form-check-label">
                            <input class="form-check-input" type="checkbox" id="twitter" value="Twitter"/> Twitter
                        </label>
                    </div>
                    <div class="form-check form-check-inline">
                        <label class="form-check-label">
                            <input class="form-check-input" type="checkbox" id="instagram" value="Instagram"/> Instagram
                        </label>
                    </div>
                </div>
                <fieldset id="tweet">
                    <div class="form-group">
                        <label for="twitterHandle" class="col-form-label">Twitter</label>
                        <form:input type="text" class="form-control" path="twitterHandle" placeholder="Twitter Handle"/>
                    </div>
                </fieldset>
                <fieldset id="gram">
                    <div class="form-group">
                        <label for="instagramHandle" class="col-form-label">Instagram</label>
                        <form:input type="text" class="form-control" path="instagramHandle" placeholder="Instagram Handle"/>
                    </div>
                </fieldset>
                <div class="form-group form-button-wrapper">
                    <button type="submit" class="btn btn-primary">REGISTER</button>
                    <p> LIMITED SLOTS AVAILABLE</p>
                    <p> REGISTRATION FEE IS &#8358;2000</p>
                </div>
            </form:form>
        </div>
    </div>
</section>

<script>
    var ctx = "${pageContext.request.contextPath}";
</script>

<%--<script type="text/javascript" src="<spr:url value="/resources/lxg_fiesta/js/jquery-3.1.1.slim.min.js"/>"></script>--%>
<script type="text/javascript" src="<spr:url value="/resources/js/jquery-3.2.1.min.js"/>"></script>
<script type="text/javascript" src="<spr:url value="/resources/js/jquery.validate.min.js"/>"></script>
<script type="text/javascript" src="<spr:url value="/resources/lxg_fiesta/js/popper.min.js"/>"></script>
<script type="text/javascript" src="<spr:url value="/resources/lxg_fiesta/js/bootstrap.min.js"/>"></script>
<script type="text/javascript" src="<spr:url value="/resources/lxg_fiesta/js/ie10-viewport-bug-workaround.js"/>"></script>
<script type="text/javascript" src="<spr:url value="/resources/lxg_fiesta/js/register_fiesta.js"/>"></script>
</body>
</html>
