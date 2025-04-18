<%--
  Created by IntelliJ IDEA.
  User: jhl03
  Date: 25. 4. 19.
  Time: 오전 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="course" items="${id_courses}">
  <p><c:out value="${course}"> </c:out></p>
</c:forEach>
</body>
</html>
