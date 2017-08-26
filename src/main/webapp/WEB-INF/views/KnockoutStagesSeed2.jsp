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
    <script type="text/javascript" src="<spr:url value="/resources/js/jquery-3.2.1.min.js"/>"></script>
    <script type="text/javascript" src="<spr:url value="/resources/js/bootstrap.min.js"/>"></script>
    <script type="text/javascript" src="<spr:url value="/resources/js/jquery.bracket.min.js" />"></script>
</head>
<body id="body">

<jsp:include page="fragment/navbar.jsp"/>
<!-- top Container -->
<div class="bg-cover">
    <section id="reloadAll">
        <div class="no-pad about-content">
            <div class=" mont-Font">
                <h2 class="gold">TheLXG KNOCKOUT SEED 2!</h2>
                <div  class="row">
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

<script>
    $(document).ready(function () {

        initStaticData()
        setInterval(function () {
            console.log("lol")
            reload()
        }, 5000);
    });

    var apiQuery;

    var Data = {
        "teams" : [
            ["TEAM 1", "TEAM 2"],
            ["TEAM 3", "TEAM 4"],
            ["TEAM 5", "TEAM 6"],
            ["TEAM 7", "TEAM 8"],
            ["TEAM 9", "TEAM 10"],
            ["TEAM 11", "TEAM 12"],
            ["TEAM 13", "TEAM 14"],
            ["TEAM 15", "TEAM 16"],
            ["TEAM 17", "TEAM 18"],
            ["TEAM 19", "TEAM 20"],
            ["TEAM 21", "TEAM 22"],
            ["TEAM 23", "TEAM 24"],
            ["TEAM 25", "TEAM 26"],
            ["TEAM 27", "TEAM 28"],
            ["TEAM 29", "TEAM 30"],
            ["TEAM 31", "TEAM 32"]
        ],
        "results" : [
            [[0,0], [0,0], [0,0], [0,0], [0,0], [0,0], [0,0], [0,0], [0,0], [0,0], [0,0], [0,0], [0,0], [0,0], [0,0], [0,0]],
            [[0,0], [0,0], [0,0], [0,0], [0,0], [0,0], [0,0], [0,0]],
            [[0,0], [0,0], [0,0], [0,0]],
            [[0,0], [0,0]],
            [
                [0,0]
            ]
        ]
    };

    function initStaticData(){
        $('.saturday').bracket({
            teamWidth: 180,
            scoreWidth: 40,
            matchMargin: 7,
            roundMargin: 50,
            init: Data,
            centerConnectors: true,
            skipConsolationRound: false
        });
    }

    function initialiseData() {
        $.getJSON( "http://localhost:8080/thelxg.com.ng/Seed2ScoreAPI", function( data ) {
            apiQuery = data;
        });

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


    function reload() {
        var xhttp;
        if (window.XMLHttpRequest) {
            // code for modern browsers
            xhttp = new XMLHttpRequest();
            xhttp.responseType = "document"
        }
        xhttp.onreadystatechange = function() {
            if (this.readyState === 4 && this.status === 200) {
                var body = this.response;
                document.getElementById("body").innerHTML = $(body)["0"].body.innerHTML;
                console.log($(body));
                initialiseData();
            }
        };
        xhttp.open("GET",window.location.href , true);
        xhttp.send();
    }
</script>
<script src="<spr:url value="/resources/js/home-scroll-filter.js"/> "></script>
</body>
</html>