<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>���� ����</title>
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script type="text/javascript">
// 	function deleteUser(userId){
// 		var result = confirm(userId +" ����ڸ� ������ �����Ͻðڽ��ϱ�?");
// 		if(result) {
// 			location.href = "deleteUser.do/"+userId;
// 		}
// 	}
</script>

</head>
<body>
	<div class="container">
		<h2 class="text-center">���� ���</h2>
		<table class="table table-bordered table table-hover"> 
			<thead> 
				<tr> 
					<th>����</th> 
					<th>�۰�</th> 
					<th>������ȣ</th>
					<th>�帣</th>
					<th>&nbsp;</th>
					<th>&nbsp;</th>
				</tr> 
		</thead> 
		<tbody> 
			<c:forEach var="book" items="${bookList}">
				<tr>
					<td>
					 	<a href="getBook.do?title=${book.title}">${book.title}</a>
					 </td>
					<td>${book.author}</td>
					<td>${book.isbn}</td>
					<td>${book.genre}</td>
					<td>
					     <a href="updateBookForm.do?id=${book.id}">����</a>
					</td>
					<td><a href="#" onclick="deleteBook('${book.id}')">����</a></td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="7">
					<a href="insertBookForm.do">���� ���</a>
				</td>
			</tr>
		</tbody> 
	</table>
	</div>
</body>
</html>

































