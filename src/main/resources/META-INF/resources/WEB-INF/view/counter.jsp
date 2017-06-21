<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
    <head>
        <meta charset="utf-8">
        <title>
            Counter
        </title>
        <script type="text/javascript" src="<spring:url value='/static/libs/jquery-2.1.1.js'/>"></script>
        <script type="text/javascript" src="<spring:url value='/static/js/counter-operations.js'/>"></script>
        <style type="text/css">
            #main {
                margin-top: 15%;
                margin-left: 40%; /* Отступ слева */
                padding: 10px; /* Поля вокруг текста */
            }

            button {
                height: 30px;
                width: 10%;
                border-color: #e38e21;
                color: #282828;
                text-shadow: 0 1px rgba(221,221,221,0.5);
                -webkit-box-shadow: 0 1px #dbd6cf;
                -moz-box-shadow: 0 1px #dbd6cf;
                box-shadow: 0 1px #dbd6cf;
                background-color: #ffa437;
                background-image: -webkit-gradient(linear, left bottom, left top, from(#ffa437), to(#fdd93e));
                background-image: -webkit-linear-gradient(bottom, #ffa437, #fdd93e);
                background-image: -moz-linear-gradient(bottom, #ffa437, #fdd93e);
                background-image: -o-linear-gradient(bottom, #ffa437, #fdd93e);
                background-image: linear-gradient(to top, #ffa437, #fdd93e);
            }

            #count-block {
                text-align: center;
                position: relative;
                font: 110px/normal 'Open Sans';
                width: 20%;
            }
        </style>
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