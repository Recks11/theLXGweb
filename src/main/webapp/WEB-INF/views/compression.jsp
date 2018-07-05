<%--
  Created by IntelliJ IDEA.
  User: rex
  Date: 23/09/2017
  Time: 00:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.github.ziplet.filter.compression.statistics.*" %>
<html>
<head>
    <title>WAR Status</title>
</head>
<body>
<%
    CompressingFilterStats stats = (CompressingFilterStats) application.getAttribute(CompressingFilterStats.STATS_KEY);
%>

<h4>GZIP Servlet Statistics (com.github.ziplet.filter.compression.CompressingFilter)</h4>
<table border="1">
    <tr>
        <td>resp num compressed</td>
        <td><%= stats.getNumResponsesCompressed() %>
        </td>
    </tr>
    <tr>
        <td>resp num not compressed</td>
        <td><%= stats.getTotalResponsesNotCompressed() %>
        </td>
    </tr>
    <tr>
        <td>resp input bytes</td>
        <td><%= stats.getResponseInputBytes() %>
        </td>
    </tr>
    <tr>
        <td>resp compressed out bytes</td>
        <td><%= stats.getResponseCompressedBytes() %>
        </td>
    </tr>
    <tr>
        <td>resp mean compression ratio</td>
        <td><%= stats.getResponseAverageCompressionRatio() %>
        </td>
    </tr>
    <tr>
        <td>req num compressed</td>
        <td><%= stats.getNumRequestsCompressed() %>
        </td>
    </tr>
    <tr>
        <td>req num not compressed</td>
        <td><%= stats.getTotalRequestsNotCompressed() %>
        </td>
    </tr>
    <tr>
        <td>req input bytes</td>
        <td><%= stats.getRequestInputBytes() %>
        </td>
    </tr>
    <tr>
        <td>req compressed out bytes</td>
        <td><%= stats.getRequestCompressedBytes() %>
        </td>
    </tr>
    <tr>
        <td>req mean compression ratio</td>
        <td><%= stats.getRequestAverageCompressionRatio() %>
        </td>
    </tr>
</table>
</body>
</html>
