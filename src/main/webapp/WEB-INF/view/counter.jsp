<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
    <head>
        <meta charset="utf-8">
        <title>
            Counter
        </title>
        <link rel="stylesheet" href="<spring:url value='/static/css/styles.css'/>">
        <script type="text/javascript" src="<spring:url value='/static/libs/jquery-2.1.1.js'/>"></script>
        <script type="text/javascript" src="<spring:url value='/static/js/counter-operations.js'/>"></script>
    </head>
    <body>
        <script>
            window.URLs = {
                counterUrl: "<spring:url value='/counter'/>"
            };
        </script>
        <div id="main">
            <div id="count-block">
                <span id="countValue">${value}</span>
            </div>
            <div>
                <button onclick="Operations.increment()">
                    <span>+</span>
                </button>
                <button onclick="Operations.decrement()">
                    <span>-</span>
                </button>
            </div>
        </div>
    </body>
</html>