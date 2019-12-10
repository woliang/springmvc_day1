<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>post请求</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/request/post.do" method="post">
        用户名<input type="text" name="username" />
        年龄<input type="text" name="age"/>
        <input type="submit" value="post提交"/>
    </form>

</body>
</html>