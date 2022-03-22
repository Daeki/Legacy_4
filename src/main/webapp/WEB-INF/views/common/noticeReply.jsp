<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${noticeReply}" var="dto">
	<tr>
		<td>${dto.contents}</td>
		<td>${dto.writer}</td>
		<td>
		 <c:if test="${member.id eq dto.writer}">	
		 	<button class="update" type="button">Update</button>
		 	<button class="del" type="button" data-num="${dto.replyNum}">Delete</button>
		 </c:if>
		 </td>
	</tr>
</c:forEach>
    
    