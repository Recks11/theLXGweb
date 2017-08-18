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
<style>
</style>
<body>
<jsp:include page="fragment/navbar.jsp"/>
<!-- top Container -->
<div class="bg-cover">
    <section id="allTables">
        <div class="no-pad">
            <div class="about-details text-center mont-Font">
                <div class="row">
                    <c:set var="n" value="${numberOfGroups}"/>
                    <c:forEach begin="1" end="27" step="1" var="number">
                        <%--<c:if test="${number % 3 == 0}">--%>
                        <%--<div class="row">--%>
                        <%--</c:if>--%>
                    <div class="col-sm-4">
                        <div class="fixture-table">
                            <table id="fixtureTable" class="table table-bordered table-condensed text-center white-font" >
                                <caption class="text-center" style="color: gold;">Group ${number}</caption>
                                <thead>
                                <tr class="text-center">
                                    <th>S/N</th>
                                    <th>Player</th>
                                    <th>P</th>
                                    <th>W</th>
                                    <th>D</th>
                                    <th>L</th>
                                    <th>GD</th>
                                    <th>Pts</th>
                                </tr>
                                </thead>
                                <tbody style="padding-bottom: 100px;">
                                <c:forEach items="${tables}" var="table">
                                    <c:if test="${table.group == number}">
                                        <tr>
                                            <td></td>
                                            <td>${table.playerAlias}</td>
                                            <td>${table.played}</td>
                                            <td>${table.wins}</td>
                                            <td>${table.draws}</td>
                                            <td>${table.losses}</td>
                                            <td>${table.goalDifference}</td>
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
                        <c:if test="${number != 27}">
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
<script>
    $(document).ready(function () {
        setInterval(function () {
            updateDiv();
    }, 3000);
    });

    function updateDiv()
    {
        $("#allTables").load(window.location.href + " #allTables");
        console.log('page reloaded')
    }
</script>
</body>
</html>