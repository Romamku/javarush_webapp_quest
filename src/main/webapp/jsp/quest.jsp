<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Quest_question</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <style>
        body, h1, h2, h3, h4, h5 {
            font-family: "Raleway", sans-serif
        }
    </style>
</head>
<body class="w3-light-grey">
<div class="w3-content" style="max-width:1400px">
    <header class="w3-container w3-center w3-padding-32">
        <h1><b>${pageRepository.getGamePage(index).getTitle()}</b></h1>
        <p>${pageRepository.getGamePage(index).getQuestion()}</p>
    </header>
    <div class="w3-row">
        <c:forEach items="${pageRepository.getGamePage(index).getCards()}" var="card">
            <div class="w3-col l6">
                <div class="w3-card-4 w3-margin w3-white">
                    <img src="images/IMGG.png" style="width:100%">
                    <div class="w3-container">
                        <h3><b>${card.getIdeaOne()}</b></h3>
                        <h5>${card.getIdeaTwo()}</h5>
                    </div>

                    <div class="w3-container">
                        <p>${card.getRespond()}</p>
                        <div class="w3-row">
                            <div class="w3-col m8 s12">
                                <p>
                                    <button class="w3-button w3-padding-large w3-white w3-border"
                                            onclick="location.href='${pageContext.request.contextPath}/quest?questionId=${pageRepository.getNextIndex(index, card)}'">
                                        <b>Ответить</b></button>
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </c:forEach>
    </div>
    <div class="w3-container w3-center">
        <button class="w3-btn w3-round-large" style="width:40%"
                onclick="location.href='${pageContext.request.contextPath}'"><b>На главную</b></button>
    </div>
</div>
</body>
</html>
