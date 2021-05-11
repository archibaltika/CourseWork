<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="/LoginServlet" method="post">
    <label for="login">Login:</label><br>
    <input type="text" id="login" name="login"><br>
    <label for="password">Password:</label><br>
    <input type="password" id="password" name="password"><br><br>
    <input type="submit" value="Login" formaction="/LoginServlet">
    <input type="submit" value="Sign in" formaction="/SignInServlet">
</form>
</body>
</html>
