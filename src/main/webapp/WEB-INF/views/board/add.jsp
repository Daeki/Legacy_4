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
	<h1>${board} Add Page</h1>
	
	<form action="./add" method="post" enctype="multipart/form-data">
		Title<input type="text" name="title">
		Writer<input type="text" name="writer" value="${member.id}" readonly>
		Contents<textarea name="contents" rows="" cols=""></textarea>
		
		<div id="fileResult">
			
		<!--
			<div>
				<input type="file" name="files"><button type="button">DEL</button>
			</div> 
			<input type="file" name="files">
			<input type="file" name="files">
		 -->
		</div>
		<div>
			<button type="button" id="fileAdd">FileAdd</button>
			<button type="button" class="del">Sample DEL</button>
		</div>
		
		<button type="submit">ADD</button>
	
	</form>
	<script src="../resources/js/file.js"></script>
</body>
</html>