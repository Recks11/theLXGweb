<%--
  Created by IntelliJ IDEA.
  User: rex
  Date: 26/05/2017
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<jsp:include page="fragment/imports.jsp"/>
<link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/registerStyle.css"/>"/>
<script src="<spr:url value="/resources/js/payPlayer.js"/>"></script>
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
                        <script src="https://js.paystack.co/v1/inline.js"></script>
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
                                <label class="checkbox-inline"><input type="checkbox" value="Instagram" id="instagram">Instagram</label>
                                <label class="checkbox-inline"><input type="checkbox" value="Twitter" id = twitter>Twitter</label>
                                <label class="checkbox-inline"> Select at least one</label>
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
                            <label class="control-label col-sm-2" for="team">Select Team:</label>
                            <div class="col-sm-5">
                                <form:select path="teamCountry" class="form-control" id="teamNation" items="${teamCountry}"> </form:select>
                            </div>
                            <div class="col-sm-5 teamSel">
                                <form:select path="teamSelected" class="form-control" id="team" items="${team}"> </form:select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="selectedTeam">Selected Team:</label>
                            <div class="col-sm-10">
                                <p id="selectedTeam" class="form-control-static">{{someone@example.com}}</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="location">Location:</label>
                            <div class="col-sm-10">
                                <label class="radioBtn"><form:radiobuttons path="location" items="${locationList}"></form:radiobuttons> </label>
                                <%--<label class="radio-inline"><input type="radio" name="locationRadio">Lagos Island--%>
                                <%--<label class="radio-inline"><input type="radio" name="locationRadio">Lagos Mainland</label>--%>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-12 text-center">
                                <button type="submit" class="submitBtn btn-default" <%--onclick="payWithPayStack()"--%>>Register</button>
                                <p class="gold" style="padding-top: 10px;"> REGISTRATION FEE IS &#8358;2000 </p>
                                <%--<button id="btn-save" type="button" class="submitBtn btn-default" onclick="test()"> Pay and Register </button>--%>
                                    <%--onclick="payWithPayStack()--%>
                            </div>
                        </div>
                    </form:form>
                </div>
            </div>
        </section>
    </div>
</div>

</body>
</html>