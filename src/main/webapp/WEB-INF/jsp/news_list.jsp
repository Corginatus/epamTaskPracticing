<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="header.jsp"/>

<html lang="en">
<body>
<h1>${pageContext.request.userPrincipal.name}, welcome!</h1>
<div>

</div>
</body>
</html>