<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rex
  Date: 28/07/2017
  Time: 18:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <jsp:include page="../fragment/admin/imports.jsp"/>
</head>
<body>
<jsp:include page="../fragment/admin/navbar.jsp"/>
<section class="admin-body">
    <section class="admin-wrapper">
        <div class="centered-parent">
            <div class="centered-content text-center">
                <p style="font-size: 16px">Number of registered participants</p>
                <p style="font-size: 120px">${numberRegistered}</p>
                <p style="font-size: 16px">Number in Mainland</p>
                <p style="font-size: 120px">${mainlandRegistered}</p>
                <p style="font-size: 16px">Number in island</p>
                <p style="font-size: 120px">${islandRegistered}</p>
            </div>
        </div>
    </section>
</section>
</body>
</html>
