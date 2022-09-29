<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Pablo-Quest</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<div class="w3-container w3-blue-grey w3-opacity w3-center">
    <h1>Pablo-Quest</h1>
</div>

<div class="w3-container w3-center">

    <div class="w3-bar w3-padding-large w3-padding-24">
        <header class="w3-container w3-center w3-padding-32">
            <h1><b>Полный провал</b></h1>
        </header>
        <div><img src="images/end.gif"></div>

        <header class="w3-container w3-center w3-padding-32">
            <h1><b>Где вы совершили роковую ошибку:</b></h1>
        </header>
        <c:set var="numberQuestion"/>
        <c:forEach items="${pageRepository.getStatistics()}" var="resp">
            <c:if test="${resp == 0}">
                <p>Вопрос <c:out value = "${numberQuestion}"/>: ответ неверный</p>
            </c:if>
            <c:if test="${resp != 0}">
                <c:set var="numberQuestion" value='${resp}'/>

            </c:if>
        </c:forEach>

        <div class="w3-container w3-center">
            <button class="w3-btn w3-round-large" style="width:40%"
                    onclick="location.href='${pageContext.request.contextPath}'"><b>На главную</b></button>
        </div>

    </div>
</div>
</body>
</html>
