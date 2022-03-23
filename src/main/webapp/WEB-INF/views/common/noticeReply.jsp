<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${noticeReply}" var="dto" varStatus="i">
	<tr class="bg">
		<%-- <td id="up${i.index}">${dto.contents}</td> --%>
		<td id="up${dto.replyNum}">${dto.contents}</td>
		<td>${dto.writer}</td>
		<td>
		 <c:if test="${member.id eq dto.writer}">	
		 	<%-- <button class="update" type="button" data-index="${i.index}">Update</button> --%>
		 	<button class="update" type="button" data-index="${dto.replyNum}">Update</button>
		 	<button class="del" type="button" data-num="${dto.replyNum}">Delete</button>
		 </c:if>
		 </td>
	</tr>
</c:forEach>
    
    