<%--
  Created by IntelliJ IDEA.
  User: nykim
  Date: 2022/12/13
  Time: 12:55 오전
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<p> <a href="${pageContext.request.contextPath}/offers"> Show current offers</a></p>
<p> <a href="${pageContext.request.contextPath}/createoffer"> Add a new offer</a></p>

<p> <a href="${pageContext.request.contextPath}/courses"> 수강내역보기</a></p>
<p> <a href="${pageContext.request.contextPath}/createcourse"> 수강신청하기</a></p>
<p> <a href="${pageContext.request.contextPath}/showcreated"> 수강신청조회</a></p>
</body>
</html>
