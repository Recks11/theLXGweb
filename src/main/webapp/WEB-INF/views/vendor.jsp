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
<link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/registerStyle.css"/>"/>
<link rel="stylesheet" type="text/css" href="<spr:url value="/resources/js/payVendor.js"/>"/>
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

                    <form:form class="form-horizontal white-font" modelAttribute="vendorObject" method="post">
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="businessName">First Name:</label>
                            <div class="col-sm-10">
                                <form:input type="text" class="form-control" path="businessName" id="fname"
                                            placeholder="Business Name"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="email">Email:</label>
                            <div class="col-sm-10">
                                <form:input path="email" type="text" class="form-control" id="email"
                                            placeholder="Enter email"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="phoneNumber">Phone Number:</label>
                            <div class="col-sm-10">
                                <form:input path="phoneNumber" type="text" class="form-control" id="phoneNumber"
                                            placeholder="Phone Number"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="description">Twitter Handle:</label>
                            <div class="col-sm-10">
                                <form:textarea path="description" type="text" class="form-control description"
                                               id="description" placeholder="Description" rows="5" cssStyle="
                                               border: 2px solid white; border-radius: 5px;"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="standLocation">Location:</label>
                            <div class="col-sm-10">
                                <label class="radioBtn"><form:radiobuttons path="standLocation"
                                                                           items="${locationList}"></form:radiobuttons></label>
                                    <%--<label class="radio-inline"><input type="radio" name="locationRadio">Lagos Island--%>
                                    <%--<label class="radio-inline"><input type="radio" name="locationRadio">Lagos Mainland</label>--%>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-12 text-center">
                                <button type="submit" class="submitBtn btn-default" onclick="payWithPayStack()">
                                    Register
                                </button>
                            </div>
                        </div>
                    </form:form>
                </div>
            </div>
        </section>
    </div>
</div>

<script src="https://js.paystack.co/v1/inline.js"></script>
</body>
</html>
