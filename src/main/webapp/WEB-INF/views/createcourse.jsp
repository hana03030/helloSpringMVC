<%--
  Created by IntelliJ IDEA.
  User: jhl03
  Date: 25. 4. 19.
  Time: 오전 12:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>수강 신청하기</title>
</head>
<body>
<h2>수강 신청하기</h2>
<sf:form method="post" action="${pageContext.request.contextPath}/docreatecourse" modelAttribute="course">
    <table>
        <tr>
            <td>교과코드: </td>
            <td><sf:input class="control" type="text" path="course_code"/> <br/>
                <sf:errors path="course_code"/>
            </td>
        </tr>
        <tr>
            <td>교과목명: </td>
            <td><sf:input class="control" type="text" path="course_name"/> <br/>
                <sf:errors path="course_name"/>
            </td>
        </tr>
        <tr>
            <td>교과구분: </td>
            <td><sf:input class="control" type="text" path="category"/> <br/>
                <sf:errors path="category"/>
            </td>
        </tr>
        <tr>
            <td>담당교수: </td>
            <td><sf:input class="control" type="text" path="professor"/> <br/>
                <sf:errors path="professor"/>
            </td>
        </tr>
        <tr>
            <td>학점: </td>
            <td><sf:input class="control" type="text" path="credit"/> <br/>
                <sf:errors path="credit"/>
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="수강신청하기"/> </td>
        </tr>
    </table>
</sf:form>

</body>
</html>
