<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tg" tagdir="/WEB-INF/tags" %>
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
        <div class="table-responsive">
            <table class="table table-striped table-condensed">
                <thead>
                <tr>
                    <th>S/N</th>
                    <th>Full Name</th>
                    <th>Alias</th>
                    <th>Email</th>
                    <th>Team</th>
                    <th>Phone Number</th>
                    <th>Player ID</th>
                    <th>Mail</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody style="overflow: scroll">
                <c:forEach items="${allPlayers.pageList}" var="player">
                    <tr>
                        <td>${player.id}</td>
                        <td>${player.firstName}  ${player.lastName}</td>
                        <td>${player.alias}</td>
                        <td>${player.email}</td>
                        <td>${player.teamSelected}</td>
                        <td>${player.phoneNumber}</td>
                        <td>${player.playerId}</td>
                        <td>${player.mailStatus}</td>
                        <td class="text-center"><a href="<spr:url value="/admin/all/get/${player.playerId}"/>" class="btn btn-success btn-xs" type="button">info</a>
                            <a href="<spr:url value="/admin/all/mail/${player.playerId}"/>" class="btn btn-info btn-xs">Resend Mail</a>
                            <a href="<spr:url value="/admin/all/delete/${player.playerId}"/>" class="btn btn-danger btn-xs">delete</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        <jsp:useBean id="allPlayers" scope="request"
                     type="org.springframework.beans.support.PagedListHolder" />
        <c:url value="/admin/players/all" var="pagedLink">
            <c:param name="page" value="~"/>
        </c:url>
        <div class="pull-right">
            <tg:pagination pagedList="${allPlayers}" pagedLink="${pagedLink}"/>
        </div>
    </section>
</section>
</body>
</html>
