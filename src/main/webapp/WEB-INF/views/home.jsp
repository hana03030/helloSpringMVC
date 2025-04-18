<%--
  Created by IntelliJ IDEA.
  User: jhl03
  Date: 25. 4. 19.
  Time: 오전 12:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>학사 정보 시스템</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      text-align: center;
      margin-top: 100px;
    }

    .menu-button {
      display: inline-block;
      width: 300px;
      padding: 20px;
      margin: 20px;
      font-size: 20px;
      font-weight: bold;
      background-color: #4CAF50;
      color: white;
      text-decoration: none;
      border-radius: 12px;
      transition: background-color 0.3s;
    }

    .menu-button:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>

<h1>📘 학사 정보 시스템</h1>

<a href="${pageContext.request.contextPath}/creditsummary" class="menu-button">
  학기별 이수 학점 조회
</a><br>

<a href="${pageContext.request.contextPath}/createcourse" class="menu-button">
  수강 신청하기
</a><br>

<a href="${pageContext.request.contextPath}/showcreated" class="menu-button">
  수강 신청 조회
</a>

</body>
</html>
