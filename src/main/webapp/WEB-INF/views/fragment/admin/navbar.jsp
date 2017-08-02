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
            <li class=""><a href="<spring:url value="/admin/"/>"><i class="fa fa-bullseye"></i>  Dashboard</a></li>

            <li class="">
                <a data-toggle="collapse" data-parent="#accordion" href="#users"><i class="fa fa-user"></i>  Players</a>
                <div id="users" class="panel-collapse collapse">
                    <div class="side-content">
                        <ul>
                            <li><a href="<spring:url value="/admin/players/all"/>"><i class="fa fa-user"></i> All Players</a></li>
                            <li><a href="<spring:url value="/admin/players/changeTeam"/>"><i class="fa fa-user"></i> Change Team</a></li>
                            <li><a href="<spring:url value="/admin/players/fixtures"/>"><i class="fa fa-user"></i> Fixtures </a></li>
                        </ul>
                    </div>
                </div>
            </li>
        </ul>

        <ul class="nav navbar-nav navbar-right navbar-user">
            <li class="dropdown user-dropdown">
                <c:if test="${pageContext.request.userPrincipal.name != null}">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-user"></i>  ${pageContext.request.userPrincipal.name}<b class="caret"></b></a>

                    <ul class="dropdown-menu">
                        <li><a href="#"><i class="fa fa-user"></i> Profile</a></li>
                        <li class="divider"></li>
                        <li><a >
                            <c:url var="logoutUrl" value="/logout"/>
                            <form:form action="${logoutUrl}" method="post" cssStyle="margin-bottom: 0;padding: 7px 0 7px;">
                                <i class="fa fa-power-off"></i>
                                <input type="submit" class="logout-btn" value="Log out" />
                                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                            </form:form></a>
                        </li>
                    </ul>
                </c:if>
            </li>
        </ul>
    </div>
</nav>