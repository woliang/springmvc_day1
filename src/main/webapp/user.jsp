<%@page pageEncoding="UTF-8" isELIgnored="false" contentType="text/html; UTF-8" %>
<html>
<body>
    <form action="${pageContext.request.contextPath}/parameter/para3.do" method="post">

        用户名<input  type="text" name="username"/><br/>
        密码<input  type="password" name="password"/><br/>
        生日<input  type="date" name="birthday"/><br/>
        地址<input  type="text" name="address.seat"/><br/>
        邮箱<input  type="text" name="address.zip"/><br/>
        <input type="submit" value="提交" />

    </form>

</body>
</html>