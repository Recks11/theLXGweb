<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <jsp:include page="../../fragment/admin/imports.jsp" />
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/formStyle.css"/>"/>
</head>
<body>
<jsp:include page="../../fragment/admin/navbar.jsp"/>

<script src="<spr:url value="/resources/js/selectTeams.js"/>"></script>
<script>
    var teamSelectedInHiddenInput = document.getElementById('#teamSelected');
    $(document).ready(function () {
       $('#id').val('${playerObject.id}');
        <%--$('#teamNation').val('${playerObject.teamCountry}');--%>
        <!--$('#teamSelected').val('${playerObject.teamSelected}');-->
        $('#alias').val('${playerObject.alias}');
    });
</script>
<section class="admin-body">
    <section class="admin-wrapper">
        <section>
            <div class="container animated fadeIn">
                <div class="register-form">
                    <h2>Enter The Competition!</h2>
                    <br/>
                    <br/>

                    <form:form id="paymentForm" class="form-horizontal white-font" modelAttribute="playerObject" method="post" action="change.team">
                        <%--<script src="https://js.paystack.co/v1/inline.js"></script>--%>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="firstname">First Name:</label>
                            <div class="col-sm-10">
                                <input id="id" name="id" style="color: black" type="hidden"/>
                                <p class="form-control-static" id="firstname" style="font-size: 20px;" > ${playerObject.firstName}</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="lastname">Last Name:</label>
                            <div class="col-sm-10">
                                <p id="lastname" class="form-control-static" style="font-size: 20px;"> ${playerObject.lastName}</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="alias">alias:</label>
                            <div class="col-sm-10">

                                <p class="form-control-static" id="plalyerAlias" style="font-size: 20px;"> ${playerObject.alias}</p>
                                <input id="alias" name="alias" style="color: black" type="hidden"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="lxgId">Selected Team:</label>
                            <div class="col-sm-10">
                                <p id="lxgId" class="form-control-static" style="font-size: 20px; color: springgreen"> ${playerObject.playerId} </p>
                            </div>
                        </div>
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
                                <p id="selectedTeam" class="form-control-static" style="font-size: 20px; color: springgreen"> ${playerObject.teamSelected}</p>
                                <%--<input id="teamSelected" name="teamSelected" style="color: black" />--%>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="selectedTeam">Selected Team:</label>
                            <div class="col-sm-10">
                                <input id="id" name="id" style="color: black" type="hidden"/>
                                <input id="id" name="id" style="color: black" type="hidden"/>
                                <input id="id" name="id" style="color: black" type="hidden"/>
                                <input id="id" name="id" style="color: black" type="hidden"/>
                                <input id="id" name="id" style="color: black" type="hidden"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-12 text-center">

                                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                                <button id="registerBtn" type="submit" class="submitBtn btn-default" >Change Team</button>
                            </div>
                        </div>
                    </form:form>
                </div>
            </div>
        </section>
    </section>
</section>
</body>
</html>
