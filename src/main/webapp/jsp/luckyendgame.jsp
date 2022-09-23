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
      <h1><b>Поздравляем, вы выжили и вернулись в США</b></h1>
      <h2><b>Пабло грустит без вас</b></h2>
    </header>
    <div><img src="images/luckyend.gif"></div>

    <div class="w3-container w3-center">
      <button class="w3-btn w3-round-large" style="width:40%"
              onclick="location.href='${pageContext.request.contextPath}'"><b>На главную</b></button>
    </div>

  </div>
</div>
</body>
</html>
