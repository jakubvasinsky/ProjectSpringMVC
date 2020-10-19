<%--
  Created by IntelliJ IDEA.
  User: Jakub
  Date: 19. 10. 2020
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <form:option value="" label="Choose your country:"/>
    <form:option value="" label="---------------------------"/>
<form:option value="Slovakia" label="Slovakia"/>
<form:option value="Czech Republic" label="Czech Republic"/>
<form:option value="Hungary" label="Hungary"/>
<form:option value="Romania" label="Romania"/>
<form:option value="Slovenia" label="Slovenia"/>
</form:select>
    <br><br>
    <input type="submit" value="Submit"/>

</form:form>

</body>
</html>
