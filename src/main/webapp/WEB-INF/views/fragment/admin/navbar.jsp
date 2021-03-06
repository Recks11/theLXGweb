<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="<spring:url value="/"/>">Back to TheLXG web</a>
    </div>
    <div class="collapse navbar-collapse navbar-ex1-collapse">
        <ul class="nav navbar-nav side-nav" id="accordion">
            <li class=""><a href="<spring:url value="/admin/"/>"><i class="fa fa-bullseye"></i> Dashboard</a></li>

            <li class="">
                <a data-toggle="collapse" data-parent="#accordion" href="#users"><i class="fa fa-user"></i> Players</a>
                <div id="users" class="panel-collapse collapse">
                    <div class="side-content">
                        <ul>
                            <li><a href="<spring:url value="/admin/players/all"/>"><i class="fa fa-user"></i> All
                                Players</a></li>
                            <li><a href="<spring:url value="/admin/players/changeTeam"/>"><i class="fa fa-user"></i>
                                Change Team</a></li>
                            <li><a href="<spring:url value="/admin/players/getData/"/>"><i class="fa fa-user"></i> get
                                Data </a></li>
                        </ul>
                    </div>
                </div>
            </li>

            <li class="">
                <a data-toggle="collapse" data-parent="#accordion" href="#events"><i class="fa fa-globe"></i> Knockout
                    <i class="fa fa-arrow-down"></i></a>
                <div id="events" class="panel-collapse collapse">
                    <div class="side-content">
                        <ul>
                            <li>
                                <a data-toggle="collapse" data-parent="#accordion" href="#Seed1"><i
                                        class="fa fa-user"></i> Seed 1 </a>
                                <div id="Seed1" class="panel-collapse collapse">
                                    <div class="side-content">
                                        <ul>
                                            <li>
                                                <a href="<spring:url value="/admin/competition/fixtures/knockout/${1}"/>"><i
                                                        class="fa fa-user"></i> 1 </a></li>
                                            <li>
                                                <a href="<spring:url value="/admin/competition/fixtures/knockout/${2}"/>"><i
                                                        class="fa fa-user"></i> 2 </a></li>
                                            <li>
                                                <a href="<spring:url value="/admin/competition/fixtures/knockout/${3}"/>"><i
                                                        class="fa fa-user"></i> 3 </a></li>
                                            <li>
                                                <a href="<spring:url value="/admin/competition/fixtures/knockout/${4}"/>"><i
                                                        class="fa fa-user"></i> 4 </a></li>
                                            <li>
                                                <a href="<spring:url value="/admin/competition/fixtures/knockout/${5}"/>"><i
                                                        class="fa fa-user"></i> 5 </a></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <a data-toggle="collapse" data-parent="#accordion" href="#Seed2"><i
                                        class="fa fa-user"></i> Seed 2 </a>
                                <div id="Seed2" class="panel-collapse collapse">
                                    <div class="side-content">
                                        <ul>
                                            <li>
                                                <a href="<spring:url value="/admin/competition/fixtures/knockout/${6}"/>"><i
                                                        class="fa fa-user"></i> 1 </a></li>
                                            <li>
                                                <a href="<spring:url value="/admin/competition/fixtures/knockout/${7}"/>"><i
                                                        class="fa fa-user"></i> 2 </a></li>
                                            <li>
                                                <a href="<spring:url value="/admin/competition/fixtures/knockout/${8}"/>"><i
                                                        class="fa fa-user"></i> 3 </a></li>
                                            <li>
                                                <a href="<spring:url value="/admin/competition/fixtures/knockout/${9}"/>"><i
                                                        class="fa fa-user"></i> 4 </a></li>
                                            <li>
                                                <a href="<spring:url value="/admin/competition/fixtures/knockout/${10}"/>"><i
                                                        class="fa fa-user"></i> 5 </a></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <a data-toggle="collapse" data-parent="#accordion" href="#Finals"><i
                                        class="fa fa-user"></i> FINALS! </a>
                                <div id="Finals" class="panel-collapse collapse">
                                    <div class="side-content">
                                        <ul>
                                            <li>
                                                <a href="<spring:url value="/admin/competition/fixtures/knockout/${11}"/>"><i
                                                        class="fa fa-user"></i> Quaters </a></li>
                                            <li>
                                                <a href="<spring:url value="/admin/competition/fixtures/knockout/${12}"/>"><i
                                                        class="fa fa-user"></i> Semis </a></li>
                                            <li>
                                                <a href="<spring:url value="/admin/competition/fixtures/knockout/${13}"/>"><i
                                                        class="fa fa-user"></i> Final + 3rd place </a></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            <li><a href="<spring:url value="/admin/competition/results"/>"><i class="fa fa-user"></i>
                                Results </a></li>
                        </ul>
                    </div>
                </div>
            </li>
        </ul>


        <ul class="nav navbar-nav navbar-right navbar-user">
            <li class="dropdown user-dropdown">
                <c:if test="${pageContext.request.userPrincipal.name != null}">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="margin-right: 15px;">
                        <i class="fa fa-user"></i> ${pageContext.request.userPrincipal.name}<b class="caret"></b></a>

                    <ul class="dropdown-menu">
                        <li><a>
                            <c:url var="logoutUrl" value="/logout"/>
                            <form:form action="${logoutUrl}" method="post"
                                       cssStyle="margin-bottom: 0;padding: 7px 0 7px;">
                                <i class="fa fa-power-off"></i>
                                <input type="submit" class="logout-btn" value="Log out"/>
                                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                            </form:form></a>
                        </li>
                    </ul>
                </c:if>
            </li>
        </ul>
    </div>
</nav>