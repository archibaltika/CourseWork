<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="/LoginServlet" method="post">
    Login: <input type="text" id="login" name="login"><br>
    Password: <input type="password" name="password"><br><br>
    <input type="submit" value="Login" formaction="/browseApplications.jsp">
    <input type="submit" value="Sign in" formaction="/browseApplications.jsp">
</form>
</body>
</html>
