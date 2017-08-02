<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags" %>
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
    <jsp:include page="../../fragment/admin/imports.jsp" />
</head>
<body>
<jsp:include page="../../fragment/admin/navbar.jsp"/>
<section class="admin-body">
    <section class="admin-wrapper">
        <div>
            <a href="<spr:url value="/admin/players/fixtures/generate"/>" class="btn btn-success"> generate fixtures</a>
            <c:if test="${!empty playerList}">
                <p>pending fixture list ${playerList}</p>
            </c:if>
        </div>
        <br/>
        <div>
            <a href="<spr:url value="/admin/players/fixtures/generateGroup"/>" class="btn btn-info"> generate groups</a>
            <c:if test="${!empty groupListStatus}">
                <p> ${groupListStatus}</p>
            </c:if>
        </div>

        <a href="<spr:url value="/admin/players/fixtures/sendMail"/>" class="btn btn-info"> sendMail</a>

    </section>
</section>
</body>
</html>
