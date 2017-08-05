<%--
  Created by IntelliJ IDEA.
  User: rex
  Date: 26/05/2017
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<jsp:include page="fragment/imports.jsp"/>
<link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/registerStyle.css"/>"/>
<link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/formStyle.css"/>"/>
<script src="<spr:url value="/resources/js/selectTeams.js"/>"></script>
<script src="<spr:url value="/resources/js/payVendor.js"/>"></script>
<body>
<jsp:include page="fragment/navbar.jsp"/>
<!-- top Container -->


<div class="bg-image">
    <div class="bg-cover">
        <section>
            <div class="container animated fadeIn">
                <div class="register-form">
                    <h2>Enter The Competition!</h2>
                    <br/>
                    <br/>

                    <form:form id="paymentForm" class="form-horizontal white-font" modelAttribute="playerObject" method="post">
                        <%--<script src="https://js.paystack.co/v1/inline.js"></script>--%>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="firstname">First Name:</label>
                            <div class="col-sm-10">
                                <form:input type="text" class="form-control" path="firstName" id="firstname" placeholder="First Name" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="lastname">Last Name:</label>
                            <div class="col-sm-10">
                                <form:input path="lastName" type="text" class="form-control" id="lastname" placeholder="Last Name"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="alias">alias:</label>
                            <div class="col-sm-10">
                                <form:input path="alias" type="text" class="form-control" id="alias" placeholder="Username"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="email">Email:</label>
                            <div class="col-sm-10">
                                <form:input path="email" type="text" class="form-control" id="email" placeholder="Enter email"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="phoneNumber">Phone Number:</label>
                            <div class="col-sm-10">
                                <form:input path="phoneNumber" type="text" class="form-control" id="phoneNumber" placeholder="Phone Number"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="location">Social:</label>
                            <div class="col-sm-10">
                                <label class="checkbox-inline"><input type="checkbox" class="require-one" name="social_acc" value="Instagram" id="instagram">Instagram</label>
                                <label class="checkbox-inline"><input type="checkbox" class="require-one" name="social_acc" value="Twitter" id = twitter>Twitter</label>
                                <label class="checkbox-inline">Please Select At Least One</label>
                            </div>
                        </div>
                        <fieldset id="tweet">
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="twitterHandle">Twitter Handle:</label>
                                <div class="col-sm-10">
                                    <form:input path="twitterHandle" type="text" class="form-control" id="twitterHandle" placeholder="Twitter"/>
                                </div>
                            </div>
                        </fieldset>
                        <fieldset id = "gram">
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="instagramHandle">Instagram Handle:</label>
                                <div class="col-sm-10">
                                    <form:input path="instagramHandle" type="text" class="form-control" id="instagramHandle" placeholder="Instagram"/>
                                </div>
                            </div>
                        </fieldset>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="team">Team:</label>
                            <div class="col-sm-5">
                                <select  name="teamCountry" class="form-control select-drop" id="teamNation" style="color: limegreen;">
                                    <option value="">&#8675;-- SELECT TEAM -- &#8675;</option>
                                    <option value="ENGLAND">ENGLAND</option>
                                    <option value="FRANCE">FRANCE</option>
                                    <option value="GERMANY">GERMANY</option>
                                    <option value="ITALY">ITALY</option>
                                    <option value="SPAIN">SPAIN</option>
                                </select>
                            </div>
                            <div class="col-sm-5 teamSel">
                                <select name="teamSelected" class="form-control select-drop" id="team" style="color: limegreen;"></select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="selectedTeam">Selected Team:</label>
                            <div class="col-sm-10">
                                <p id="selectedTeam" class="form-control-static" style="font-size: 20px; color: springgreen"></p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="location">Location:</label>
                            <div class="col-sm-10">
                                <label class="radioBtn"><form:radiobuttons path="location" items="${locationList}"></form:radiobuttons> </label>
                                <label class="radio-inline">Please Select One</label>
                                    <%--<label class="radio-inline"><input type="radio" name="locationRadio">Lagos Mainland</label>--%>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="pin">pin:</label>
                            <div class="col-sm-10">
                                <input name="pin" type="text" class="form-control ignore" id="pin" placeholder="PIN"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-12 text-center">

                                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                                <button id="registerBtn" type="submit" class="submitBtn btn-default" >Register</button>
                                <p class="gold" style="padding-top: 10px;"> REGISTRATION FEE IS &#8358;2000 </p>
                            </div>
                        </div>
                    </form:form>
                </div>
            </div>
        </section>
    </div>
</div>
<script src="<spr:url value="/resources/js/home-scroll-filter.js"/> "></script>
<script>var ctx = "${pageContext.request.contextPath}";</script>

</body>
</html>