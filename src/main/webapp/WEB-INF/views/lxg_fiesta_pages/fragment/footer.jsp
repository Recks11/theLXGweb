<%@ taglib prefix="spr" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: rex
  Date: 22/09/2017
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<footer id="footer">
    <div class="container text-center">
        <div class="row">
            <div class="col-sm-3 white-font">
                <h4><img src="<spr:url value="/resources/lxg_fiesta/media/images/theLXGlogo-small.png"/>" class="img-responsive footer-img" style="display:inline" alt="THE LXG LOGO" height="auto"></h4>
                <p class="description">The League of Extraordinary Gamers</p>
            </div>
            <div class="col-sm-3 white-font">
                <ul class="footer-li">
                    <li class="first-line">NAVIGATION</li>
                    <li><a href="<spr:url value="/"/> ">HOME</a></li>
                    <li><a href="<spr:url value="/fiesta/home"/> ">FIESTA HOME</a></li>
                    <li><a href="<spr:url value="/fiesta/register"/>">REGISTER</a></li>
                    <%--<li><a href="<spr:url value="/fiesta/finalists"/>">FINALISTS</a></li>--%>
                    <li><a style="color: springgreen;" href="<spr:url value="/download/pdf/RuleBookNew.pdf"/>">RULE BOOK</a></li>
                </ul>
            </div>
            <div class="col-sm-3 white-font">
                <hr class="sr-only">
                <ul class="footer-li">
                    <li class="first-line">CALL US</li>
                    <li>+234 808 772 0872</li>
                    <li>+234 805 228 1093</li>
                </ul>
                <div class="container-fluid no-pad">
                    <ul class="footer-li">
                        <li class="first-line"> FOLLOW US</li>
                        <li><div class="footer-social">
                            <p><a href="#footer" onclick="socialClickOp('https://facebook.com/thereallxg')" style="font-size: 30px; color: white;">
                                <i class="fa fa-facebook"></i></a>
                                <a href="#footer" onclick="socialClickOp('https://twitter.com/thelxg_')" style="font-size: 30px; color: white;">
                                    <i class="fa fa-twitter"></i></a>
                                <a href="#footer" onclick="socialClickOp('https://instagram.com/thelxg_')" style="font-size: 30px; color: white;">
                                    <i class="fa fa-instagram"></i></a>
                                <a href="#footer" onclick="socialClickOp('https://www.youtube.com/channel/UChEKFU3rf_-9UWwfasaDi0A')" style="font-size: 30px; color: white;">
                                    <i class="fa fa-youtube-play"></i></a>
                            </p>
                        </div>
                        </li>
                        <li><small>@thelxg_</small></li>
                        <li><a href="mailto:info@thelxg.com.ng">email: info@thelxg.com.ng</a></li>
                    </ul>
                </div>

            </div>
            <div class="col-sm-3 white-font">
                <ul class="footer-li">
                    <li class="first-line">FEEDBACK</li>
                    <li>
                        <c:url value="/fiesta//sendFeedback" var="sendFeedback"/>
                        <form:form id="feedbackForm" action="${sendFeedback}" method="post" modelAttribute="feedbackObject" >
                            <div class="form-group">
                                <label for="emailAddress" class="col-form-label message-label">Email Address</label>
                                <form:input path="email" type="email" class="form-control" id="emailAddress" placeholder="E-Mail Address"/>
                            </div>
                            <div class="form-group">
                                <label for="message" class="col-form-label message-label">Message</label>
                                <form:textarea path="message" type="text" class="form-control" id="message" name="message" placeholder="Message" rows="5"></form:textarea>
                            </div>
                            <button class="btn btn-primary btn-sm message-btn">Submit</button>
                        </form:form>
                    </li>
                </ul>

            </div>
        </div>

    </div>
    <div class="container-fluid" style="border-top: 2px solid white">
        <p class="d-flex justify-content-end">copyright &copy; 2017 League of Extraordinary Gamers</p>
    </div>
    <script>
        $("#feedbackForm").validate({
            rules:{
                email:{
                    required: true,
                    email: true
                },
                message: {
                    required: "#email:valid",
                    minlength: 20
                }
            },
            messages:{
                email: "Please Enter a valid email",
                message: "Must be at least 20 characters"
            }
        });
    </script>
</footer>