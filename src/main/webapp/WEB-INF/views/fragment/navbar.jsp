<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>


<nav class="navbar navbar-default navbar-inverse navbar-fixed-top">

        <div class="container-fluid">
            <div class="col-sm-12">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbarData" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="<spr:url value="/"/> "><img src="<spr:url value="/resources/images/theLXGlogo.png"/>" class="img-responsive nav-image" style="display:inline"
                                                          alt="THE LXG LOGO" height="auto"></a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="navbarData">
                    <ul class="nav navbar-nav navbar-right text-center">
                        <%--<li class="underline-hover"><a href="<spr:url value="/"/> ">HOME <span class="sr-only">(current)</span></a></li>--%>
                        <li class="underline-hover"><a href="<spr:url value="/event/"/> ">EVENT DETAILS</a></li>
                        <%--<li class="underline-hover"><a href="<spr:url value="/vendor/"/> ">VENDORS</a></li>--%>
                        <li class="underline-hover"> <a href="<spr:url value="/enter/"/> ">ENTER <i class="fa fa-edit"></i></a></li>
                        <li class="underline-hover"><a href="<spr:url value="/aboutUs"/>">  ABOUT US</a></li>
                        <li class="underline-hover"><a href="<spr:url value="/faq"/>">  FAQ</a></li>
                    </ul>

                </div><!-- /.navbar-collapse -->
            </div><!-- /.container -->
        </div>
</nav>