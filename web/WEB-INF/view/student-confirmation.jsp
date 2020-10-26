<%--
  Created by IntelliJ IDEA.
  User: Jakub
  Date: 19. 10. 2020
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Student Confirmation</title>
</head>
<body style="background-image: url('http://www.ozniesmesami.sk/wp-content/uploads/2017/04/web-background.jpg')">
The students Name: ${student.studentName}
<br><br>
The students Email: ${student.eMail}
<br><br>
The students Country: ${student.country}
<br><br>
The students Favorite Programming Language: ${student.favoriteLanguage}
<br><br>
The students Operating System: <%--${student.operatingSystems}--%>
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li>${temp}</li>

    </c:forEach>


</ul>




</body>
</html>
