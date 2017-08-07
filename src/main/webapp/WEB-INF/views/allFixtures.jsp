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
<body>
<jsp:include page="fragment/navbar.jsp"/>
<!-- top Container -->
<div class="bg-cover">
    <section class="allFixtures">
        <div class="search text-center">
            <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for alias">
        </div>
        <div class="no-pad">
            <div class="about-details text-center mont-Font">
                <div class="fixture-table">
                    <c:choose>
                        <c:when test="${fixtures.size() == 0}">
                            <h3 style="color: #ffd700">Fixtures for this weekend have been played</h3>
                        </c:when>
                        <c:otherwise>
                            <table id="fixtureTable" class="table table-condensed text-center white-font" >
                                <thead>
                                <tr>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                </tr>
                                </thead>
                                <tbody style="padding-bottom: 100px;">
                                <c:forEach items="${fixtures}" var="fixture">
                                    <tr>
                                        <td>${fixture.fixtureTime}</td>
                                        <td>${fixture.homePlayer}</td>
                                        <td>${fixture.homeTeam}</td>
                                        <td>${fixture.homeScore}</td>
                                        <td>:</td>
                                        <td>${fixture.awayScore}</td>
                                        <td>${fixture.awayTeam}</td>
                                        <td>${fixture.awayPlayer}</td>
                                        <td>${fixture.group}</td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </c:otherwise>
                    </c:choose>

                </div>
            </div>
        </div>
        <%--<jsp:include page="fragment/footer.jsp"/>--%>
    </section>
</div>

<script>
    function myFunction() {
        // Declare variables
        var input, filter, table, tr, td,td1, i;
        input = document.getElementById("myInput");
        filter = input.value.toUpperCase();
        table = document.getElementById("fixtureTable");
        tr = table.getElementsByTagName("tr");

        // Loop through all table rows, and hide those who don't match the search query
        for (i = 0; i < tr.length; i++) {
            td = tr[i].getElementsByTagName("td")[1];//home player
            td1 = tr[i].getElementsByTagName("td")[7];//away player
            if (td||td1) {
                if (td.innerHTML.toUpperCase().indexOf(filter) > -1||td1.innerHTML.toUpperCase().indexOf(filter) > -1) {
                    tr[i].style.display = "";
                } else {
                    tr[i].style.display = "none";
                }
            }
        }
    }
</script>
<script src="<spr:url value="/resources/js/home-scroll-filter.js"/> "></script>
<script>
    $(document).ready(function () {
        setInterval(function () {
            updateDiv();
        }, 5000);
    });

    function updateDiv()
    {
        $("#allFixtures").load(window.location.href + " #allFixtures");
        console.log('Fixtures reloaded')
    }
</script>
</body>
</html>
