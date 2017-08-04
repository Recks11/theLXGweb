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
        <section class="scroll">
            <div class="search text-center">
                <input type="text" id="myInput" onkeyup="myFunction()" placeholder="find Name">
            </div>
            <div class="no-pad">
                <div class="about-details text-center mont-Font">
                    <div class="fixture-table">
                        <table id="fixtureTable" class="table table-condensed text-center white-font">
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
                            <tbody style="overflow: scroll">
                            <c:forEach items="${fixtures}" var="fixture">
                                <tr>
                                    <td>${fixture.time}</td>
                                    <td>${fixture.homePlayer}</td>
                                    <td>${fixture.homeTeam}</td>
                                    <td>${fixture.homeScore}</td>
                                    <td>:</td>
                                    <td>${fixture.awayScore}</td>
                                    <td>${fixture.awayTeam}</td>
                                    <td>${fixture.awayPlayer}</td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
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
<jsp:include page="fragment/footer.jsp"/>
</body>
</html>
