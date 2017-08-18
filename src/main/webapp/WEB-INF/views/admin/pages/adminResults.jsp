<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <jsp:include page="../../fragment/admin/imports.jsp" />
    <style>
        .table>tbody>tr>td, .table>tbody>tr>th, .table>tfoot>tr>td, .table>tfoot>tr>th, .table>thead>tr>td, .table>thead>tr>th {

            border: 0;
        }
        .table{
            background-color: transparent;
        }
        .fixture-table{
            max-width: 1200px;
            margin: 0 auto;
        }
        .table>tbody>tr>td{
            font-size: 15px;
        }
        .updatedFixture{
            background: gold;
            color: black;
        }
    </style>
    <script>
        var playerId = [""]
    </script>
</head>
<body>
<jsp:include page="../../fragment/admin/navbar.jsp"/>
<section class="admin-body">
    <section class="admin-wrapper">
        <section>
            <div class="search text-center">
                <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for alias" style="color: gold;">
            </div>
            <div class="no-pad">
                <div class="about-details text-center mont-Font">
                    <div class="fixture-table">
                        <c:choose>
                            <c:when test="${fixtures.size() == 0}">
                                <h3> no fixtures </h3>
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
                                    </tr>
                                    </thead>
                                    <tbody style="padding-bottom: 100px;">
                                    <c:forEach items="${fixtures}" var="fixture">
                                        <tr>
                                            <td>${fixture.homePlayer}</td>
                                            <td>${fixture.homeTeam}</td>
                                            <td>${fixture.homeScore}</td>
                                            <td>:</td>
                                            <td>${fixture.awayScore}</td>
                                            <td>${fixture.awayTeam}</td>
                                            <td>${fixture.awayPlayer}</td>
                                            <td>Group: ${fixture.group}</td>
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
    </section>
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
</section>
</body>
</html>
