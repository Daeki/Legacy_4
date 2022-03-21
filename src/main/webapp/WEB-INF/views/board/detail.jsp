<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/header_css.jsp"></c:import>

</head>
<body>
<c:import url="../template/header.jsp"></c:import>
	<h1>${board} Detail Page</h1>
	
	<h3>Title : ${dto.title}</h3>
	<h3>Writer : ${dto.writer}</h3>
	<h3>Contents : ${dto.contents}</h3>
	<div>
		<c:forEach items="${dto.fileDTOs}" var="f">
			<a href="./fileDown?fileNum=${f.fileNum}">${f.oriName}</a>		
		</c:forEach>
	</div>
	
	<hr>
	
	<form action="../noticeReply/add" method="post"  enctype="application/x-www-form-urlencoded">
		<input type="hidden" name="num" value="${dto.num}" id="num">
		<input type="text" readonly name="writer" value="${member.id}" id="writer">
		<textarea rows="" cols="" name="contents" id="contents"></textarea>
		<button type="button" id="reply">REPLY</button>
	</form>
	
	<table id="replyResult">
		
	
	</table>
	
	
	
	<a href="./list">List</a>
	
	<c:if test="${member.id eq dto.writer}">
	<a href="./delete?num=${dto.num}">Delete</a>
	<a href="./update?num=${dto.num}">update</a>
	</c:if>
	
	<c:if test="${board ne 'notice'}">
		<a href="./reply?num=${dto.num}">Reply</a>
	</c:if>
	
	<script src="../resources/js/noticeReply.js"></script>
</body>
</html>