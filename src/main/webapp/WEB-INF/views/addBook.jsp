<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Add Book</title>
</head>
<body>
<h2>Add New Book</h2>
<form action="${pageContext.request.contextPath}/books/add" method="post">
  <label for="title">Title:</label>
  <input type="text" id="title" name="title" required>
  <br>
  <label for="author">Author:</label>
  <input type="text" id="author" name="author" required>
  <br>
  <input type="submit" value="Add Book">
</form>
<br>
<a href="${pageContext.request.contextPath}/books">Back to Books List</a>
</body>
</html>
