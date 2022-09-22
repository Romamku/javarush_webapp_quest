<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
        <form action="addUser" method="GET">
            <button type="submit" class="w3-btn w3-hover-green w3-round-large">Add user</button>
        </form>
        <form action="userList" method="GET">
            <button class="w3-btn w3-hover-light-blue w3-round-large">List users</button>
        </form>
        <div><img src="images/Pablo.jpg"></div>
    </div>
</div>
</body>
</html>

