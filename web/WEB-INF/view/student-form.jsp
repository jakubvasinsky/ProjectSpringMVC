<%--
  Created by IntelliJ IDEA.
  User: Jakub
  Date: 19. 10. 2020
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">

Name: <form:input path="studentName"/>
    <br><br>
Email: <form:input path="eMail"/>
    <br><br>
Country: <form:select path="country">
  <%--  <form:option value="" label="Choose your country:"/>
    <form:option value="" label="---------------------------"/>--%>
<form:options items = "${student.countryOptions}" />
</form:select>
    <br><br>
Favorite Programming Language:

    Java <form:radiobutton path="favoriteLanguage" value="Java"/>
    C# <form:radiobutton path="favoriteLanguage" value="C#"/>
    Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
    PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>

    <br><br>

Operating System:
    MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
    Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
    Linux <form:checkbox path="operatingSystems" value="Linux"/>


    <br><br>
    <input type="submit" value="Submit"/>

</form:form>

</body>
</html>
