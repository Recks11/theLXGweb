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
<link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/allPlayers.css"/>"/>
<link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/playerTables.css"/>"/>
<body>
<jsp:include page="fragment/navbar.jsp"/>
<!-- top Container -->
<div class="bg-cover">
    <section>
        <div class="no-pad">
            <div class="about-details text-center mont-Font">
                <div class="row">
                    <c:set var="n" value="${numberOfGroups}"/>
                    <c:forEach begin="1" end="14" step="1" var="number">
                        <%--<c:if test="${number % 3 == 0}">--%>
                        <%--<div class="row">--%>
                        <%--</c:if>--%>
                    <div class="col-sm-4">
                        <div class="fixture-table">
                            <table id="fixtureTable" class="table table-bordered table-condensed text-center white-font" >
                                <caption>Group ${number}</caption>
                                <thead>
                                <tr class="text-center">
                                    <th>S/N</th>
                                    <th>Player</th>
                                    <th>P</th>
                                    <th>W</th>
                                    <th>D</th>
                                    <th>L</th>
                                    <th>Pts</th>
                                </tr>
                                </thead>
                                <tbody style="padding-bottom: 100px;">
                                <c:forEach items="${tables}" var="table">
                                    <c:if test="${table.group == number}">
                                        <tr>
                                            <td>${tables.indexOf(table)}</td>
                                            <td>${table.playerAlias}</td>
                                            <td>${table.played}</td>
                                            <td>${table.wins}</td>
                                            <td>${table.draws}</td>
                                            <td>${table.losses}</td>
                                            <td>${table.points}</td>
                                        </tr>
                                    </c:if>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>

                    <c:if test="${number % 3 == 0}">
                </div>
                        <c:if test="${number != 14}">
                <div class="row">
                        </c:if>

                    </c:if>
                    </c:forEach>
                </div>
            </div>
            <%--<jsp:include page="fragment/footer.jsp"/>--%>
    </section>
</div>
<script src="<spr:url value="/resources/js/home-scroll-filter.js"/> "></script>

</body>
</html>
