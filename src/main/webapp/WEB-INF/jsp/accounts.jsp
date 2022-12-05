<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Account</title>
</head>

  <body>

 <h3>Счета</h3>

   <c:forEach items="${accounts}" var="account">
   <a href="<c:url value="/accounts?id=${account.id}"/>">${account.number}-${account.amount}</a> <br>
   </c:forEach>



  </body>

</html>