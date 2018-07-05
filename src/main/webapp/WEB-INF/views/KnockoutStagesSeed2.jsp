<%@ taglib prefix="spr" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rex
  Date: 26/08/2017
  Time: 03:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html id="html" class="no-js" lang="">
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Title</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=1280, initial-scale=1">

    <link rel="apple-touch-icon" href="apple-touch-icon.png">
    <!-- Place favicon.ico in the root directory -->
    <%--<jsp:include page="fragment/imports.jsp"/>--%>

    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/bootstrap3/bootstrap.min.css"/> "/>
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/LXG_animate.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/generalStyles.css"/> "/>
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/footerStyles.css"/> "/>
    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/about.css"/>"/>

    <link rel="stylesheet" type="text/css" href="<spr:url value="/resources/css/navbarStyles.css"/> "/>
    <link rel="stylesheet" href="<spr:url value="/resources/css/jquery.bracket.min.css" />">
    <link rel="stylesheet" href="<spr:url value="/resources/css/KnockoutStyles.css" />">
    <%--<script src="<spr:url value="/resources/js/jquery-3.2.1.min.js" />"></script>--%>
</head>
<body id="body">

<jsp:include page="fragment/navbar.jsp"/>
<!-- top Container -->
<div class="bg-cover">
    <section id="reloadAll">
        <div class="no-pad about-content">
            <div class=" mont-Font">
                <h2 class="gold">LXG'17 KNOCKOUT SEED 2!</h2>
                <div class="row">
                    <div class="col-sm-12">
                        <div class="saturday" style="width: 100%;height: 1000px;">

                        </div>

                        <div id="results"></div>
                    </div>
                </div>
            </div>

        </div>
    </section>
</div>
<jsp:include page="fragment/footer.jsp"/>
<script type="text/javascript" src="<spr:url value="/resources/js/jquery.bracket.min.js"/>"></script>
<script>
    $.holdReady(true);
    getDataFromSeedAPI();
    $.holdReady(false);

    $(document).ready(function () {

        getTableDataFromDatabase();
        setInterval(function () {

            getTableDataFromDatabase()
        }, 5000);
    });

    var apiQuery;

    function initialiseData() {

        getDataFromSeedAPI();

        $('.saturday').bracket({
            teamWidth: 180,
            scoreWidth: 40,
            matchMargin: 7,
            roundMargin: 50,
            init: apiQuery,
            centerConnectors: true,
            skipConsolationRound: false
        });
    }


    function getTableDataFromDatabase() {
        var xhttp;
        if (window.XMLHttpRequest) {
            // code for modern browsers
            xhttp = new XMLHttpRequest();
            xhttp.responseType = "document"
        }
        xhttp.onreadystatechange = function () {
            if (this.readyState === 4 && this.status === 200) {
                var body = this.response;
                document.getElementById("body").innerHTML = $(body)["0"].body.innerHTML;
                console.log($(body));
                initialiseData();
            }
        };
        xhttp.open("GET", window.location.href, true);
        xhttp.send();
    }

    function getDataFromSeedAPI() {

        // $.getJSON("http://localhost:8080/thelxg.com.ng/Seed2ScoreAPI", function (data) {
       $.getJSON( window.location.origin + "/Seed2ScoreAPI", function( data ) {
            apiQuery = data;
        });
    }

</script>
<script src="<spr:url value="/resources/js/home-scroll-filter.js"/> "></script>
</body>
</html>