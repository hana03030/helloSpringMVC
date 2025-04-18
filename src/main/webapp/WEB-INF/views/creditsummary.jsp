<%--
  Created by IntelliJ IDEA.
  User: jhl03
  Date: 25. 4. 19.
  Time: 오전 3:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>학기별 이수 학점 조회</title>
</head>
<body>

<h2>학기별 이수 학점 조회</h2>
<table border="1">
    <tr>
        <th>년도</th>
        <th>학기</th>
        <th>취득 학점</th>
        <th>상세보기</th>
    </tr>
    <c:forEach var="summary" items="${creditSummary}">
        <tr>
            <td>${summary[0]}</td>
            <td>${summary[1]}</td>
            <td>${summary[2]}</td>
            <td>
                <form method="get" action="${pageContext.request.contextPath}/creditsummary">
                    <input type="hidden" name="year" value="${summary[0]}" />
                    <input type="hidden" name="semester" value="${summary[1]}" />
                    <input type="submit" value="링크" />
                </form>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <td>총계</td>
        <td></td>
        <td>${totalCredits}</td>
        <td></td>
    </tr>
</table>

<c:if test="${not empty courseDetails}">
    <h3>수강 내역</h3>
    <table border="1">
        <tr>
            <th>년도</th>
            <th>학기</th>
            <th>교과목명</th>
            <th>교과구분</th>
            <th>담당교수</th>
            <th>학점</th>
        </tr>
        <c:forEach var="course" items="${courseDetails}">
            <tr>
                <td>${course.year}</td>
                <td>${course.semester}</td>
                <td>${course.course_name}</td>
                <td>${course.category}</td>
                <td>${course.professor}</td>
                <td>${course.credit}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>

