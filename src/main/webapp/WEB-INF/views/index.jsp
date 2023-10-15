<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Spring Boot Application</title>
</head>
<body>
    <form class="layout" action="/book/insert" method="post">
        <input name="bookSerial" type="text"/>

        <button type="submit">작성</button>
    </form>
</body>
</html>