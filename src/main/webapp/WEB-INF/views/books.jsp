<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Books List</title>
</head>
<body>
<h2>Books List</h2>
<table border="1">
    <tr>
        <th>Title</th>
        <th>Author</th>
    </tr>
    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.title}</td>
            <td>${book.author}</td>
        </tr>
    </c:forEach>
</table>
<br>
<a href="${pageContext.request.contextPath}/books/add">Add New Book</a>
</body>
</html>