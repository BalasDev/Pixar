<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
  <title>Personal Manager</title>
</head>
<body>
<div>
  <h1>Persoanl Manager</h1>
  <c:if test = "${!empty personal}">
    <table>
      <tr>
        <th>Фамилия</th>
        <th>Имя</th>
        <th>Отчество</th>
      </tr>
      <c:forEach items = "${personal}" var = "personal">
        <tr>
          <td>${personal.lastName}</td>
          <td>${personal.firstName}<td>
          <td>${personal.secondName}<td>
        </tr>
      </c:forEach>
    </table>
  </c:if>
</div>
</body>
</html>