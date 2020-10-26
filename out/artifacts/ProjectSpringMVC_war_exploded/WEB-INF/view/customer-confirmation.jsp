<%--
  Created by IntelliJ IDEA.
  User: Jakub
  Date: 22. 10. 2020
  Time: 12:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Customer Confirmation</title>
</head>
<body style="background-image: url('http://www.ozniesmesami.sk/wp-content/uploads/2017/04/web-background.jpg')">

The customer is confirmed: ${customer.firstName} ${customer.lastName}
<br><br>
Free passes: ${customer.freePasses}
<br><br>
Postal code: ${customer.postalCode}
<br><br>
Course code: ${customer.courseCode}
</body>
</html>
