<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book List</title>
<style>
body{
	font-size:20px;
}
</style>
</head>

<body>
	<div align="center">
		<b>List Of Books</b><br/>
		<table border="2">
			<tr>
				<th>Name</th>
				<th>Author</th>
				<th>Number of Pages</th>
			</tr>

			<c:forEach var="book" items="${bookList}">
				<tr>
					<td><c:out value="${book.bookName}"></c:out></td>
					<td><c:out value="${book.author}"></c:out></td>
					<td><c:out value="${book.numberOfPages}"></c:out></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
