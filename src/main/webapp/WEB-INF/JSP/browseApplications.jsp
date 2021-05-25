<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Applications Browser</title>
</head>
<body>
<h1 style="text-align: center">---Applications Browser---</h1>
<p style="text-align: right"><a href="loginPage.jsp">Log out</a><br></p>
<a href="receivedMatches.jsp">Watch matches</a><br>
<a href="yourApplication.jsp">Your application</a><br>
Keywords:
<input type="checkbox" name="relationship" value="keyword"> Relationship
<input type="checkbox" name="friendship" value="keyword"> Friendship
<input type="checkbox" name="chatting" value="keyword"> Chatting
<input type="checkbox" name="games" value="keyword"> Games
<input type="checkbox" name="food" value="keyword"> Food
<input type="checkbox" name="anime" value="keyword"> Anime
<input type="checkbox" name="music" value="keyword"> Music
<input type="checkbox" name="study" value="keyword"> Study
<input type="checkbox" name="sports" value="keyword"> Sports <br>
<a href="">Apply</a>

<table border="1" align="center" width="100%">
    <tr>
        <th>First name</th>
        <th>Sex</th>
        <th>Age</th>
        <th>KeyWords</th>
        <th>About me</th>
        <th>Match</th>
    </tr>
    <tr>
        <td>Kris</td>
        <td>Male</td>
        <td>19</td>
        <td>Friendship, Games, Music</td>
        <td>I'm looking for a friend to play games and listen to music</td>
        <td><a href="">Send</a></td>
    </tr>
    <tr>
        <td>Mia</td>
        <td>Female</td>
        <td>24</td>
        <td>Relationship, Food, Music</td>
        <td>Looking for the love of my life. I love cooking and listening to classical music</td>
        <td><a href="">Send</a></td>
    </tr>
    <tr>
        <td>Fred</td>
        <td>Male</td>
        <td>26</td>
        <td>Chatting, Sports, Anime</td>
        <td>I'm fond of sport and would like to exchange experiences with someone</td>
        <td><a href="">Send</a></td>
    </tr>
</table>
</body>
</html>