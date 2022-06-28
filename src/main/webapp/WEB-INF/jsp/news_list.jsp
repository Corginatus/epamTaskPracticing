<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:include page="header.jsp"/>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>

<c:forEach var="news" items="${newsList}">
    <tr>
        <div>
            <td>Title: ${news.title}; Date: ${news.date}</td>
            <td>Brief: ${news.brief}</td>
            <td>
                <form action="/user/view" method="get">
                    <input type="hidden" name="news_id" value="${news.id}"/>
                    <button type="submit">view</button>
                </form>
                <form action="/user/edit" method="get">
                    <input type="hidden" name="news_id" value="${news.id}"/>
                    <button type="submit">edit</button>
                </form>
                <input id="more-info" name="more-info" type="checkbox">
            </td>
        </div>
    </tr>
</c:forEach>