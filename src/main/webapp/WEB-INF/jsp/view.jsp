<jsp:include page="header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Log in with your account</title>
    <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/style.css">
</head>

<body>
<div>
    <div>
        <td>Title: ${news.title}; Date: ${news.date}</td>
        <td>Brief: ${news.brief}</td>
        <td>Content: ${news.content}</td>
    </div>
    <form action="/user/edit" method="get">
        <input type="hidden" name="news_id" value="${news.id}"/>
        <button type="submit">edit</button>
    </form>
    <form action="/user/delete" method="post">
        <input type="hidden" name="news_id" value="${news.id}"/>
        <input type="hidden" name="action" value="delete"/>
        <button type="submit">delete</button>
    </form>
    <a href="/user/news_list">Назад</a>
</div>
</body>
</html>