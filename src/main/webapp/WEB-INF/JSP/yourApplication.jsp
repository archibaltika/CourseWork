<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Your application</title>
</head>
<body>
<form action="browseApplications.jsp" method="POST" >
    <form action="browseApplications.jsp" method="POST">
        ---Your application---<br/>
        First name: <input name="firstname" type="text" placeholder="John" required/><br/>
        Last name: <input name="lastname" type="text" placeholder="Hastings" required/><br/>
        Sex: <input type="radio" id="maleButton" name="sex" value="male" required>
        <label for="maleButton">Male</label>
        <input type="radio" id="femaleButton" name="sex" value="female">
        <label for="femaleButton">Female</label><br/>
        Age: <input name="age" type="number" min="16" max="100" required/><br/>
        Telegram Tag: <input name="telegramtag" type="text" placeholder="@JohnHa"/><br/>
        Email: <input name="email" type="email" placeholder="example@google.com" required/><br/>
        Phone number: <input name="phoneNumber" type="tel" placeholder="+380973534556"/><br/>
        Keywords:
        <input type="checkbox" name="relationship" value="keyword"> Relationship
        <input type="checkbox" name="friendship" value="keyword"> Friendship
        <input type="checkbox" name="chatting" value="keyword"> Chatting
        <input type="checkbox" name="games" value="keyword"> Games
        <input type="checkbox" name="food" value="keyword"> Food
        <input type="checkbox" name="anime" value="keyword"> Anime
        <input type="checkbox" name="music" value="keyword"> Music
        <input type="checkbox" name="study" value="keyword"> Study
        <input type="checkbox" name="sports" value="keyword"> Sports
        <br/>About me:<br/>
        <textarea name="aboutme" rows="10" cols="100"></textarea>
        <input type="submit" value="Save"/>
        <input type="reset" value="Clear all">
    </form>
</form>
</body>
</html>