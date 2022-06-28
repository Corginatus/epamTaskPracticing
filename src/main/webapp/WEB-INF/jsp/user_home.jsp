<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<body>
<h1>${pageContext.request.userPrincipal.name}, welcome!</h1>
</body>
</html>