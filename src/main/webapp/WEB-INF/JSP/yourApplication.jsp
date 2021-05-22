<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Your application</title>
</head>
<body>
<form action="action_form" method="POST">
    <form action="action_form" method="POST">
        Your application<br/>
        First name: <input name="firstname" type="text" placeholder="John" required/><br/>
        Last name: <input name="firstname" type="text" placeholder="Hastings" required/><br/>
        Sex: <input type="radio" id="maleButton" name="sex" value="male" required>
        <label for="maleButton">Male</label>
        <input type="radio" id="femaleButton" name="sex" value="female">
        <label for="femaleButton">Female</label><br/>
        Age: <input name="age" type="number" required/><br/>
        Telegram Tag: <input name="lastname" type="text" placeholder="@JohnHa"/><br/>
        Email: <input name="lastname" type="email" placeholder="example@google.com"/><br/>
        Phone number: <input name="phoneNumber" type="tel"/><br/>
        <input type="submit"/>
        <input type="reset">
    </form>
</form>
</body>
</html>