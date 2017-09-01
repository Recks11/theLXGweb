<%@ taglib prefix="spr" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: rex
  Date: 01/09/2017
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="fragment/imports.jsp" />
<style>
    body{
        background-color: aquamarine;
        font-family: 'Montserrat', sans-serif;
    }
    section{
        padding-top: 100px;
        min-height: 100%;
        background-color: #000000;
    }
    .gallery-content{
        max-width: 1280px;
    }
    .gallery-images-header{
        font-family: 'Montserrat', sans-serif;
        text-align: center;
        color: #ffd700;
    }
    .panel-content{
        padding: 20px;
        background-color: #000000;
    }
    .panel-footer{
        text-align: center;
    }
    .gallery-link{
        color: black;
    }
    .gallery-link:hover{
        text-decoration: none;
        color: black;
    }
</style>
<body>
<jsp:include page="fragment/navbar.jsp"/>
<section>
    <div class="container-fluid gallery-content">
        <div class="gallery-images-header">
            <h1>PICTURES</h1>
        </div>
        <div class="row">
            <div class="col-sm-4">
                <a href="https://drive.google.com/open?id=0Bwkw5lCnX8Y2VHBuWGpVczRjSk0" target="_blank" class="gallery-link underline-hover">
                    <div class="panel panel-default">
                        <div class="panel-content">
                            <img src="<spr:url value="/resources/images/theLXGlogo.png"/>" alt="logo" class="img-responsive panel-image"/>
                        </div>
                        <div class="panel-footer">
                            Week 1
                        </div>
                    </div>
                </a>
            </div>
            <div class="col-sm-4">
                <a href="https://drive.google.com/open?id=0Bwkw5lCnX8Y2aUJDREIxa2Q5UVk" target="_blank" class="gallery-link underline-hover">
                    <div class="panel panel-default">
                        <div class="panel-content">
                            <img src="<spr:url value="/resources/images/theLXGlogo.png"/>" alt="logo" class="img-responsive panel-image"/>
                        </div>
                        <div class="panel-footer">
                            Week 2
                        </div>
                    </div>
                </a>
            </div>
            <div class="col-sm-4">
                <a href="https://drive.google.com/open?id=0Bwkw5lCnX8Y2N3lZT0FKYTdXZ0U" target="_blank" class="gallery-link underline-hover">
                    <div class="panel panel-default">
                        <div class="panel-content">
                            <img src="<spr:url value="/resources/images/theLXGlogo.png"/>" alt="logo" class="img-responsive panel-image"/>
                        </div>
                        <div class="panel-footer">
                            Week 3
                        </div>
                    </div>
                </a>
            </div>
        </div>
        <div class="gallery-images-header">
            <h1>VIDEOS</h1>
        </div>
        <div class="row">
            <div class="col-sm-4">
                <a href="https://www.youtube.com/watch?v=PQvBp2MXe-U&t=2s" target="_blank" class="gallery-link underline-hover">
                    <div class="panel panel-default">
                        <div class="panel-content">
                            <img src="<spr:url value="/resources/images/goals-of-the-week-1.jpg"/>" width="100%" alt="logo" class="img-responsive panel-image"/>
                        </div>
                        <div class="panel-footer">
                            Goals of The Week 1
                        </div>
                    </div>
                </a>
            </div>
            <div class="col-sm-4">
                <a href="https://www.youtube.com/watch?v=QGHeflc0R9s" target="_blank" class="gallery-link underline-hover">
                    <div class="panel panel-default">
                        <div class="panel-content">
                            <img src="<spr:url value="/resources/images/goals-of-the-week-2.jpg"/>" width="100%" alt="logo" class="img-responsive panel-image"/>
                        </div>
                        <div class="panel-footer">
                            Goals of The Week 2
                        </div>
                    </div>
                </a>
            </div>
            <div class="col-sm-4">
                <%--<a href="">--%>
                    <%--<div class="panel panel-default">--%>
                        <%--<div class="panel-content">--%>
                            <%--<img src="<spr:url value="/resources/images/theLXGlogo.png"/>" alt="logo" class="img-responsive panel-image"/>--%>
                        <%--</div>--%>
                        <%--<div class="panel-footer">--%>
                            <%--Week 3--%>
                        <%--</div>--%>
                    <%--</div>--%>
                <%--</a>--%>
            </div>
        </div>
    </div>
</section>
<jsp:include page="fragment/footer.jsp"/>
</body>
</html>
