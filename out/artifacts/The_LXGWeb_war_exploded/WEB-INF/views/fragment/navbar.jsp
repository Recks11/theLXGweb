<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags"%>




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
                    <a class="navbar-brand" href="#">The LXG</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="navbarData">
                    <ul class="nav navbar-nav navbar-right text-center">
                        <li class="underline-hover"><a href="<spr:url value="/"/> ">HOME <span class="sr-only">(current)</span></a></li>
                        <li class="underline-hover"><a href="<spr:url value="/event/"/> ">EVENT DETAILS</a></li>
                        <%--<li class="dropdown">--%>
                            <%--<a href="#" class="dropdown-toggle"--%>
                               <%--data-toggle="dropdown" role="button" aria-haspopup="true"--%>
                               <%--aria-expanded="false">ITEM <span class="caret"></span></a>--%>
                            <%--<ul class="dropdown-menu">--%>
                                <%--<li><a href="#">Action</a></li>--%>
                                <%--<li><a href="#">Another action</a></li>--%>
                                <%--<li><a href="#">Something else here</a></li>--%>
                                <%--<li role="separator" class="divider"></li>--%>
                                <%--<li><a href="#">Separated link</a></li>--%>
                                <%--<li role="separator" class="divider"></li>--%>
                                <%--<li><a href="#">One more separated link</a></li>--%>
                            <%--</ul>--%>
                        <%--</li>--%>
                        <%--<li class="underline-hover"> <a href="#"> ABOUT US </a></li>--%>
                        <li class="underline-hover"> <a href="<spr:url value="/enter/"/> ">ENTER <i class="fa fa-edit"></i></a></li>
                    </ul>

                </div><!-- /.navbar-collapse -->
            </div><!-- /.container -->
        </div>
</nav>