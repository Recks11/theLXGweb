<%@ taglib prefix="spr" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: rex
  Date: 22/09/2017
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="contianer">
    <nav class="navbar fixed-top navbar-expand-md navbar-inverse navbar-dark bg-hero-dark d-flex flex-row justify-content-between">
        <a class="navbar-brand" href="<spr:url value="/"/> ">
            <img src="<spr:url value="/resources/lxg_fiesta/media/images/theLXGlogo-small.png"/>" width="80"  class="d-inline-block align-top" alt="LXG'17 FIESTA">
        </a>
        <button class="navbar-toggler" type="button"
                data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="navbar-collapse collapse" id="navbarsExampleDefault" aria-expanded="false" style="">
            <ul class="navbar-nav mr-auto justify-content-end">
                <li class="nav-item">
                    <a class="nav-link ${home}" href="<spr:url value="/fiesta/home"/> ">18 HOME <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item ">
                    <a class="nav-link ${register}" href="<spr:url value="/fiesta/register"/>">REGISTER</a>
                </li>
                <li class="nav-item">
                    <%--<a class="nav-link" href="#">EVENT DESCRIPTION</a>--%>
                </li>
            </ul>
        </div>
    </nav>
</div>
