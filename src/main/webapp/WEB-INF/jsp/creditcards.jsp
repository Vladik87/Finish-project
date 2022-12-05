<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Credit cards</title>
</head>

<body>

<h3>Кредитные карты</h3>

<c:forEach items="${cards}" var="card">
  <a href="<c:url value="/creditcards=${card.id}"/>">${card.number} <br>
</c:forEach>



</body>

</html>