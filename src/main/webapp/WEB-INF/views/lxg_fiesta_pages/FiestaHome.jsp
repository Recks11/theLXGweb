<%@ taglib prefix="spr" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: rex
  Date: 22/09/2017
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <jsp:include page="fragment/imports.jsp"/>
    <link rel="stylesheet" href="<spr:url value="/resources/lxg_fiesta/css/lxg_firesta_main.css"/> ">
    <link rel="stylesheet" href="<spr:url value="/resources/lxg_fiesta/css/FiestaFooterStyles.css"/> ">
    <link rel="stylesheet" href="<spr:url value="/resources/lxg_fiesta/css/FiestaFormStyles.css"/> ">
<body>
<%--Additional css files--%>

<%--end--%>
    <jsp:include page="fragment/navbar.jsp"/>

    <section class="hero-layer bg-image-container bg-hero-dark" style="width:100%; min-height: 50vw">
        <picture class="bg-hero-image" >
            <source srcset="<spr:url value="/resources/lxg_fiesta/media/images/fifa18-homepage-marquee-bg-lg.jpg"/>
                                ,<spr:url value="/resources/lxg_fiesta/media/images/fifa18-homepage-marquee-bg-lg-2x.jpg 2x"/>
                  " media="(min-width: 1280px)">
            <source srcset="<spr:url value="/resources/lxg_fiesta/media/images/fifa18-homepage-marquee-bg-md.jpg"/>
                                ,<spr:url value="/resources/lxg_fiesta/media/images/fifa18-homepage-marquee-bg-md-2x.jpg 2x"/>
                  " media="(min-width: 1024px)">
            <source srcset="<spr:url value="/resources/lxg_fiesta/media/images/fifa18-homepage-marquee-bg-sm.jpg"/>
                                ,<spr:url value="/resources/lxg_fiesta/media/images/fifa18-homepage-marquee-bg-sm-2x.jpg 2x"/>
                  " media="(min-width: 768px)">
            <source srcset="<spr:url value="/resources/lxg_fiesta/media/images/fifa18-homepage-marquee-bg-xs.jpg"/>
                                ,<spr:url value="/resources/lxg_fiesta/media/images/fifa18-homepage-marquee-bg-xs-2x.jpg 2x"/>
                  " media="screen">
            <img class="bg-hero-image-img img-fluid" alt="image"  src="<spr:url value="/resources/lxg_fiesta/media/images/fifa18-homepage-marquee-bg-xs.jpg"/> " style="margin-top: 50px;">
        </picture>
        <section class="hero-child">
            <h1 class="display-1 text-center">LXG'17 FIESTA</h1>
            <p class="text-center description">Date: 30th September - 1st October</p>
        </section>
    </section>
    <section class="events-container">
        <h1 class="display-3 text-center">FEATURES</h1>
        <br/>
        <br/>
        <div class="container">
            <div class="events row">
                <div class="col-md-2">
                    <div><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24">
                        <path fill="none" d="M0 0h24v24H0z"></path>
                        <path d="M1 9l2 2c4.97-4.97 13.03-4.97 18 0l2-2C16.93 2.93 7.08 2.93 1 9zm8 8l3 3 3-3c-1.65-1.66-4.34-1.66-6 0zm-4-4l2 2c2.76-2.76 7.24-2.76 10 0l2-2C15.14 9.14 8.87 9.14 5 13z"></path>
                    </svg></div>
                    <p>FREE WIFI</p>
                </div>
                <div class="col-md-2">
                    <svg  viewBox="1.071429 -47.142857 26.785714 23.571429" xmlns="http://www.w3.org/2000/svg">
                        <path d="M10.714286 -34.285714L10.714286 -40.714286L6.428571 -40.714286L6.428571 -36.428571C6.428571 -35.837054 6.637835 -35.332031 7.056362 -34.913504C7.474888 -34.494978 7.979911 -34.285714 8.571429 -34.285714ZM27.857143 -26.785714L27.857143 -23.571429L8.571429 -23.571429L8.571429 -26.785714L10.714286 -30.000000L8.571429 -30.000000C6.796875 -30.000000 5.281808 -30.627790 4.026228 -31.883371C2.770647 -33.138951 2.142857 -34.654018 2.142857 -36.428571L2.142857 -41.785714L1.071429 -42.857143L1.607143 -45.000000L9.642857 -45.000000L10.178571 -47.142857L26.250000 -47.142857L26.785714 -43.928571L25.714286 -43.392857L25.714286 -30.000000ZM27.857143 -26.785714"></path>
                    </svg>
                    <p>free beer</p>
                </div>
                <div class="col-md-2">
                    <svg width="27.857143" height="25.714286" viewBox="0.000000 -49.285714 27.857143 25.714286" xmlns="http://www.w3.org/2000/svg"><path d="M7.667411 -36.646205C6.841518 -38.454241 6.428571 -40.524554 6.428571 -42.857143L2.142857 -42.857143L2.142857 -41.250000C2.142857 -40.379464 2.670201 -39.475446 3.724888 -38.537946C4.779576 -37.600446 6.093750 -36.969866 7.667411 -36.646205ZM25.714286 -41.250000L25.714286 -42.857143L21.428571 -42.857143C21.428571 -40.524554 21.015625 -38.454241 20.189732 -36.646205C21.763393 -36.969866 23.077567 -37.600446 24.132254 -38.537946C25.186942 -39.475446 25.714286 -40.379464 25.714286 -41.250000ZM27.857143 -43.392857L27.857143 -41.250000C27.857143 -40.457589 27.625558 -39.659598 27.162388 -38.856027C26.699219 -38.052455 26.074219 -37.327009 25.287388 -36.679688C24.500558 -36.032366 23.535156 -35.488281 22.391183 -35.047433C21.247210 -34.606585 20.044643 -34.358259 18.783482 -34.302455C18.314732 -33.699777 17.784598 -33.169643 17.193080 -32.712054C16.768973 -32.332589 16.476004 -31.928013 16.314174 -31.498326C16.152344 -31.068638 16.071429 -30.569196 16.071429 -30.000000C16.071429 -29.397321 16.241629 -28.889509 16.582031 -28.476562C16.922433 -28.063616 17.466518 -27.857143 18.214286 -27.857143C19.051339 -27.857143 19.796317 -27.603237 20.449219 -27.095424C21.102121 -26.587612 21.428571 -25.948661 21.428571 -25.178571L21.428571 -24.107143C21.428571 -23.950893 21.378348 -23.822545 21.277902 -23.722098C21.177455 -23.621652 21.049107 -23.571429 20.892857 -23.571429L6.964286 -23.571429C6.808036 -23.571429 6.679688 -23.621652 6.579241 -23.722098C6.478795 -23.822545 6.428571 -23.950893 6.428571 -24.107143L6.428571 -25.178571C6.428571 -25.948661 6.755022 -26.587612 7.407924 -27.095424C8.060826 -27.603237 8.805804 -27.857143 9.642857 -27.857143C10.390625 -27.857143 10.934710 -28.063616 11.275112 -28.476562C11.615513 -28.889509 11.785714 -29.397321 11.785714 -30.000000C11.785714 -30.569196 11.704799 -31.068638 11.542969 -31.498326C11.381138 -31.928013 11.088170 -32.332589 10.664062 -32.712054C10.072545 -33.169643 9.542411 -33.699777 9.073661 -34.302455C7.812500 -34.358259 6.609933 -34.606585 5.465960 -35.047433C4.321987 -35.488281 3.356585 -36.032366 2.569754 -36.679688C1.782924 -37.327009 1.157924 -38.052455 0.694754 -38.856027C0.231585 -39.659598 0.000000 -40.457589 0.000000 -41.250000L0.000000 -43.392857C0.000000 -43.839286 0.156250 -44.218750 0.468750 -44.531250C0.781250 -44.843750 1.160714 -45.000000 1.607143 -45.000000L6.428571 -45.000000L6.428571 -46.607143C6.428571 -47.343750 6.690848 -47.974330 7.215402 -48.498884C7.739955 -49.023438 8.370536 -49.285714 9.107143 -49.285714L18.750000 -49.285714C19.486607 -49.285714 20.117188 -49.023438 20.641741 -48.498884C21.166295 -47.974330 21.428571 -47.343750 21.428571 -46.607143L21.428571 -45.000000L26.250000 -45.000000C26.696429 -45.000000 27.075893 -44.843750 27.388393 -44.531250C27.700893 -44.218750 27.857143 -43.839286 27.857143 -43.392857ZM27.857143 -43.392857"></path></svg>
                    <p>LXG'17 FINALS</p>
                </div>
                <div class="col-md-2">
                    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 110.73 110.73" xml:space="preserve">
                    <path d="M23.633,44.574c0.306,0.367,0.498,0.859,0.498,1.312V50.5c0,0.864-0.701,1.565-1.565,1.565h-3.499   c-0.864,0-1.564-0.701-1.564-1.565v-4.614c0-0.548,0.28-1.154,0.706-1.526l2.208-2.412c0.226-0.248,0.592-0.248,0.818,0   l2.404,2.627L23.633,44.574L23.633,44.574z M19.611,40.167l-2.627-2.404v0.006c-0.367-0.306-0.859-0.498-1.311-0.498h-4.616   c-0.864,0-1.564,0.701-1.564,1.565v3.499c0,0.864,0.7,1.564,1.564,1.564h4.616c0.547,0,1.153-0.281,1.525-0.706l2.413-2.208   C19.858,40.757,19.858,40.392,19.611,40.167z M43.477,39.752h23.812c1.182,0,2.143-0.962,2.143-2.145v-0.027V25.234v-0.063   c0-1.183-0.961-2.145-2.142-2.145H43.477c-1.181,0-2.142,0.962-2.142,2.145v0.027v12.346v0.063   C41.336,38.791,42.297,39.752,43.477,39.752z M20.417,39.723c0.226,0.246,0.592,0.246,0.818,0l2.404-2.628h-0.006   c0.306-0.367,0.498-0.859,0.498-1.312v-4.616c0-0.863-0.701-1.563-1.565-1.563h-3.499c-0.864,0-1.564,0.7-1.564,1.563v4.616   c0,0.546,0.28,1.152,0.706,1.525L20.417,39.723z M98.107,36.732c2.013,0,3.645,1.632,3.645,3.644c0,2.013-1.632,3.645-3.645,3.645   c-2.012,0-3.644-1.632-3.644-3.645C94.464,38.364,96.096,36.732,98.107,36.732z M98.107,37.947c-1.313,0-2.384,1.069-2.384,2.384   s1.07,2.386,2.384,2.386c1.315,0,2.385-1.07,2.385-2.386C100.492,39.017,99.424,37.947,98.107,37.947z M88.206,33.787h3.496   l-1.748-2.959L88.206,33.787z M93.599,32.525c0,2.013-1.631,3.644-3.645,3.644c-2.012,0-3.645-1.631-3.645-3.644   c0-2.013,1.632-3.645,3.645-3.645C91.968,28.88,93.599,30.513,93.599,32.525z M92.49,34.236l-2.536-4.294l-2.535,4.294H92.49z    M96.174,40.332c0,1.066,0.867,1.936,1.935,1.936s1.936-0.869,1.936-1.936c0-1.065-0.868-1.935-1.936-1.935   S96.174,39.266,96.174,40.332z M93.599,48.241c0,2.013-1.631,3.646-3.645,3.646c-2.012,0-3.645-1.632-3.645-3.646   c0-2.012,1.632-3.644,3.645-3.644C91.968,44.598,93.599,46.229,93.599,48.241z M90.466,48.241l1.709-1.709l-0.415-0.415   l-1.709,1.71l-1.709-1.71l-0.415,0.415l1.709,1.709l-1.709,1.709l0.415,0.414l1.709-1.708l1.709,1.708l0.415-0.414L90.466,48.241z    M110.726,77.349c-0.047,3.618-0.842,6.106-4.352,8.995c-6.122,4.729-14.394,1.643-16.145-0.941   c-1.751-2.585-3.243-6.604-4.432-10.095c-0.969-2.84-1.938-5.68-2.885-8.527c-0.303-0.908-1.062-1.249-1.831-1.588   c-0.093-0.04-0.277,0.05-0.385,0.129c-4.222,3.075-9.568,2.979-13.682-0.229c-0.209-0.164-0.524-0.276-0.79-0.276   c-1.215,0-4.345,0.004-7.418,0.009v0.015c-0.672-0.003-1.931-0.005-3.442-0.008c-1.511,0.003-2.771,0.005-3.442,0.008v-0.015   c-3.073-0.005-6.203-0.009-7.418-0.009c-0.266,0-0.581,0.112-0.79,0.276c-4.113,3.209-9.46,3.305-13.683,0.229   c-0.107-0.079-0.292-0.169-0.385-0.129c-0.77,0.339-1.528,0.68-1.831,1.588c-0.947,2.849-1.916,5.688-2.884,8.527   c-1.188,3.491-2.68,7.51-4.432,10.095c-1.751,2.584-10.022,5.672-16.145,0.941c-3.509-2.889-4.304-5.377-4.351-8.995   c-0.035-2.744,0.124-5.505,0.423-8.232c0.602-5.501,1.614-10.942,2.725-16.364c1.092-5.333,2.351-10.628,3.92-15.845   c0.71-2.361,1.567-4.656,2.938-6.729c1.072-1.619,2.123-3.251,3.222-4.851c0.201-0.293,0.563-0.499,0.889-0.679   c0.248-0.139,0.431-0.238,0.45-0.566c0.01-0.174,0.158-0.378,0.304-0.491c0.229-0.179,0.498-0.319,0.768-0.43   c3.877-1.587,7.779-1.652,11.702-0.165c0.333,0.126,0.522,0.352,0.49,0.698c-0.05,0.54,0.16,0.838,0.706,0.887   c0.043,0.004,0.085,0.026,0.124,0.047c0.924,0.478,1.917,0.642,2.944,0.646h8.716l-0.027,12.334c0,1.755,1.426,3.184,3.18,3.184   h23.812c1.754,0,3.181-1.429,3.181-3.184V25.273h8.652c1.027-0.004,2.021-0.168,2.944-0.646c0.039-0.021,0.081-0.043,0.124-0.047   c0.546-0.049,0.755-0.347,0.706-0.887c-0.032-0.347,0.156-0.572,0.49-0.698c3.923-1.487,7.824-1.422,11.702,0.165   c0.271,0.11,0.539,0.251,0.768,0.43c0.146,0.113,0.294,0.317,0.304,0.491c0.02,0.328,0.202,0.428,0.45,0.566   c0.326,0.18,0.688,0.386,0.889,0.679c1.1,1.6,2.15,3.231,3.223,4.851c1.371,2.073,2.227,4.368,2.937,6.729   c1.57,5.217,2.829,10.512,3.92,15.845c1.11,5.421,2.123,10.863,2.726,16.364C110.602,71.844,110.762,74.604,110.726,77.349z    M34.333,33.658c0,1.235,1,2.236,2.235,2.236c1.235,0,2.236-1.001,2.236-2.236v-4.6c0-1.234-1-2.235-2.236-2.235   c-1.234,0-2.235,1.001-2.235,2.235V33.658z M33.41,40.591c0-6.915-5.606-12.522-12.521-12.522c-6.916,0-12.522,5.607-12.522,12.522   c0,6.916,5.606,12.521,12.522,12.521C27.804,53.113,33.41,47.507,33.41,40.591z M43.481,59.1c0-3.594-2.913-6.507-6.507-6.507   c-3.593,0-6.506,2.913-6.506,6.507c0,3.594,2.913,6.506,6.506,6.506C40.568,65.605,43.481,62.693,43.481,59.1z M54.975,59.236   c0.125,0,0.251,0,0.375-0.013c0.385-0.044,0.702-0.204,0.894-0.555c0.137-0.245,0.161-0.514,0.141-0.788   c-0.043-0.579-0.511-1.017-1.091-1.017c-1.763,0-3.525,0-5.287,0c-0.035,0-0.071,0-0.119,0c0,0.126,0.006,0.235-0.002,0.347   c-0.005,0.087,0.028,0.107,0.112,0.107c0.943-0.003,1.887-0.003,2.831-0.003c0.661,0,1.321,0,1.983,0.001   c0.327,0,0.537,0.157,0.602,0.471c0.028,0.135,0.034,0.279,0.016,0.417c-0.05,0.382-0.261,0.556-0.646,0.556   c-1.258,0-2.518,0.009-3.777-0.004c-0.629-0.006-1.067,0.469-1.101,1.037c-0.028,0.472-0.012,0.945-0.018,1.418   c-0.001,0.061,0.02,0.084,0.083,0.084c0.259-0.002,0.518-0.005,0.778,0c0.073,0.002,0.09-0.028,0.089-0.095   c-0.002-0.356-0.001-0.715,0-1.071c0-0.107,0-0.214,0.012-0.32c0.033-0.298,0.235-0.579,0.636-0.575   C52.646,59.246,53.812,59.238,54.975,59.236z M62.326,56.865c-0.03,0-0.052,0-0.071,0c-1.016,0-2.03-0.006-3.044,0.007   c-0.339,0.004-0.629,0.153-0.833,0.435c-0.155,0.212-0.216,0.454-0.217,0.714c-0.001,0.699,0.004,1.399-0.002,2.101   c-0.004,0.408-0.202,0.71-0.693,0.699c-0.843-0.015-1.686-0.004-2.527-0.004c-0.021,0-0.042,0.002-0.063,0   c-0.057-0.005-0.081,0.019-0.08,0.078c0.004,0.104,0.004,0.207,0,0.312c-0.003,0.07,0.026,0.09,0.094,0.09   c0.998-0.002,1.995,0,2.992-0.002c0.262,0,0.515-0.056,0.737-0.201c0.344-0.229,0.483-0.565,0.487-0.961   c0.006-0.68,0.001-1.357,0.002-2.037c0.001-0.085,0.007-0.172,0.019-0.257c0.033-0.257,0.193-0.444,0.423-0.497   c0.073-0.02,0.152-0.022,0.229-0.022c0.807-0.001,1.613-0.001,2.419-0.001c0.021,0,0.046,0.008,0.062-0.002   c0.024-0.016,0.061-0.037,0.062-0.06C62.329,57.131,62.326,57.006,62.326,56.865z M71.929,33.658c0,1.235,1,2.236,2.234,2.236   c1.235,0,2.235-1.001,2.235-2.236v-4.6c0-1.234-1-2.235-2.235-2.235c-1.234,0-2.234,1.001-2.234,2.235V33.658z M80.263,59.1   c0-3.594-2.913-6.507-6.506-6.507c-3.595,0-6.508,2.913-6.508,6.507c0,3.594,2.913,6.506,6.508,6.506   C77.35,65.605,80.263,62.693,80.263,59.1z M102.364,40.591c0-6.915-5.605-12.522-12.521-12.522s-12.522,5.607-12.522,12.522   c0,6.916,5.606,12.521,12.522,12.521S102.364,47.507,102.364,40.591z M85.69,40.376c0,2.013-1.632,3.645-3.645,3.645   c-2.014,0-3.646-1.632-3.646-3.645c0-2.012,1.632-3.644,3.646-3.644C84.059,36.732,85.69,38.364,85.69,40.376z M84.028,38.35   h-3.965v3.964h3.965V38.35z M30.389,37.27h-4.616c-0.452,0-0.943,0.192-1.311,0.498v-0.006l-2.627,2.404   c-0.247,0.226-0.247,0.592,0,0.818l2.413,2.208c0.373,0.425,0.979,0.706,1.525,0.706h4.616c0.864,0,1.564-0.7,1.564-1.564v-3.499   C31.953,37.971,31.253,37.27,30.389,37.27z M83.578,38.797h-3.064v3.067h3.064V38.797z"></path>
                </svg>
                    <p>PLAY FIFA 18</p>
                </div>
                <div class="col-md-2">
                    <svg version="1.1" id="Capa_1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 45.057 45.057" xml:space="preserve">
                    <g>
                        <g>
                            <path d="M22.526,0C10.086,0,0,10.086,0,22.526c0,12.445,10.086,22.531,22.526,22.531c12.444,0,22.53-10.086,22.53-22.531
                                C45.057,10.086,34.971,0,22.526,0z M22.528,34.217c-6.455,0-11.688-5.232-11.688-11.688s5.233-11.688,11.688-11.688
                                c6.454,0,11.688,5.232,11.688,11.688C34.217,28.984,28.982,34.217,22.528,34.217z"></path>
                            <path d="M25.295,22.327v-0.073c1.971-0.806,2.492-2.145,2.492-3.577c0-2.708-2.258-4.607-5.417-4.607
                                c-3.16,0-5.415,1.899-5.415,4.607c0,1.433,0.529,2.771,2.498,3.577v0.073c-1.969,0.782-3.017,2.144-3.017,4.108
                                c0,2.199,1.839,4.558,5.925,4.558c4.087,0,5.938-2.358,5.938-4.558C28.301,24.469,27.266,23.109,25.295,22.327z M22.363,16.663
                                c1.228,0.053,1.863,0.887,1.863,1.888c0,0.976-0.703,2.059-1.863,2.059c-1.16,0-1.864-1.083-1.864-2.059
                                C20.498,17.549,21.135,16.715,22.363,16.663z M22.363,28.34c-1.321,0-2.139-1.154-2.115-2.283c0-1.186,0.745-2.408,2.115-2.408
                                c1.371,0,2.115,1.224,2.115,2.408C24.503,27.186,23.686,28.34,22.363,28.34z"></path>
                        </g>
                    </g>
                </svg>
                    <p>POOL</p>
                </div>
                <div class="col-md-2">
                    <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" id="Capa_1" x="0px" y="0px" viewBox="0 0 500.02 500.02" style="enable-background:new 0 0 500.02 500.02;" xml:space="preserve">
                    <g>
                        <g>
                            <path style="fill:#010002;" d="M57.96,223.661c17.062,35.254,45.357,63.874,80.749,83.058L84.403,433.395    c-2.65,6.186,0.211,13.355,6.405,16.005c1.561,0.675,3.195,0.992,4.796,0.992c4.731,0,9.234-2.772,11.217-7.397l53.99-125.928    c26.475,10.632,55.933,16.469,87.008,16.469c31.905,0,62.119-6.121,89.13-17.298l54.356,126.765    c1.983,4.617,6.487,7.389,11.217,7.389c1.601,0,3.227-0.317,4.796-0.992c6.194-2.65,9.055-9.819,6.405-16.013l-54.795-127.797    c34.595-19.248,62.241-47.585,78.953-82.359c32.628-6.657,61.509-21.272,62.119-38.554c0.675-19.313-15.851-30.035-44.577-34.53    c0.057-1.902,0.154-3.788,0.154-5.714c0-1.585-0.211-3.154-0.528-4.715c2.601-4.82,4.048-9.876,4.048-15.192    c0-46.886-107.419-74.897-211.27-74.897S36.533,77.664,36.533,124.541c0,5.316,1.447,10.38,4.048,15.2    c-0.301,1.561-0.52,3.121-0.52,4.706c0,1.772,0.089,3.512,0.138,5.267c-28.507,4.219-40.87,15.022-40.171,34.977    C0.646,202.364,26.747,217.232,57.96,223.661z M48.734,124.525c0.033-30.271,80.018-62.688,199.077-62.688    s199.036,32.409,199.077,62.679c0,0.008,0,0.016,0,0.024c0,7.844-5.414,15.834-15.444,23.37c-0.788,0.593-1.577,1.187-2.422,1.772    c-29.913,20.736-95.413,37.57-181.21,37.57c-119.084,0-199.077-32.425-199.077-62.704    C48.726,124.533,48.734,124.533,48.734,124.525z M475.029,187.489c-0.406,7.828-12.648,13.128-29.206,16.412    c3.755-10.99,6.446-22.508,8.039-34.473C469.494,172.346,475.566,177.239,475.029,187.489z M41.719,169.062    c1.585,12.095,4.292,23.735,8.08,34.831c-14.428-3.284-24.402-8.584-24.808-16.403C24.43,176.792,26.812,171.923,41.719,169.062z"></path>
                            <path style="fill:#010002;" d="M250.526,169.988c61.834,0,178.772-10.014,178.772-47.934c0-5.861-2.999-11.234-8.356-16.111    c-24.524-22.345-99.282-34.238-170.416-34.238c-64.11,0-131.163,9.665-161.742,27.93c-10.754,6.43-17.037,13.908-17.037,22.419    C71.746,159.974,188.684,169.988,250.526,169.988z M376.007,140.685l0.61-37.993c23.37,6.609,36.424,14.079,36.424,19.37    C413.041,127.102,400.263,134.369,376.007,140.685z M182.384,150.447c-13.136-1.349-24.873-3.056-35.351-4.967l0.772-48.316    c10.567-2.097,22.28-3.991,35.245-5.487L182.384,150.447z M207.469,89.483c11.144-0.78,22.923-1.268,35.319-1.414l-0.723,65.557    c-12.485-0.138-24.264-0.561-35.311-1.236L207.469,89.483z M294.339,152.39c-8.844,0.545-18.102,0.943-27.881,1.146l0.715-65.337    c9.738,0.252,18.996,0.748,27.922,1.398L294.339,152.39z M319.457,91.865c12.006,1.422,22.939,3.17,32.856,5.113l-0.78,48.95    c-9.827,1.723-20.72,3.268-32.783,4.511L319.457,91.865z M123.322,102.984l-0.593,37.099    c-22.776-6.17-34.733-13.136-34.733-18.021C88.004,116.844,100.627,109.52,123.322,102.984z"></path>
                        </g>
                    </g>
                </svg>
                    <p>BBQ</p>
                </div>
            </div>
        </div>
    </section>
<script type="text/javascript" src="<spr:url value="/resources/js/jquery-3.2.1.min.js"/>"></script>
<script type="text/javascript" src="<spr:url value="/resources/js/jquery.validate.min.js"/>"></script>
<jsp:include page="fragment/footer.jsp"/>
    <script src="<spr:url value="/resources/lxg_fiesta/js/popper.min.js"/>"></script>
    <script src="<spr:url value="/resources/lxg_fiesta/js/bootstrap.min.js"/>"></script>
    <script src="<spr:url value="/resources/lxg_fiesta/js/ie10-viewport-bug-workaround.js"/>"></script>
</body>
</html>