<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>学生成绩管理系统</title>
</head>
<body>

    <h2>查询到的信息如下：</h2>
    <table>
        <tr>
            <td>id：</td>
            <td>${id}</td>
        </tr>
        <tr>
            <td>name：</td>
            <td>${ame}</td>
        </tr>
        <tr>
            <td>chinese：</td>
            <td>${chinese}</td>
        </tr>
        <tr>
            <td>math：</td>
            <td>${math}</td>
        </tr>
        <tr>
            <td>english：</td>
            <td>${english}</td>
        </tr>
    </table>
</body>

</body>
</html>