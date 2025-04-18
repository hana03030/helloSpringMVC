<%--
  Created by IntelliJ IDEA.
  User: jhl03
  Date: 25. 4. 19.
  Time: 오전 12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>교과코드</th>
        <th>교과목명</th>
        <th>교과구분</th>
        <th>담당교수</th>
        <th>학점</th>
    </tr>
    <c:forEach var="course" items="${id_courses}">
        <tr>
            <td>${course.course_code}</td>
            <td>${course.course_name}</td>
            <td>${course.category}</td>
            <td>${course.professor}</td>
            <td>${course.credit}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
