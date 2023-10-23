<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Spring Boot Application</title>
</head>
<body>
    <form class="layout" action="/book/insert" method="post">
        <input name="bookSerial" type="text"/>
        <input name="bookTitle" type="text"/>
        <button type="submit">작성</button>
    </form>

    <form class="layout" action="/book/update" method="post">
        <input name="bookSerial" type="text"/>
        <input name="bookTitle" type="text"/>
        <button type="submit">작성</button>
    </form>

    <form class="layout" action="/book/delete" method="post">
        <input name="bookSerial" type="text"/>
        <input name="bookTitle" type="text"/>
        <button type="submit">작성</button>
    </form>

    <form class="layout" action="/book/select" method="post">
            <button type="submit">조회</button>
    </form>

    <form class="layout" action="/book/detail" method="post">
        <input name="bookSerial" type="text"/>
        <button type="submit">작성</button>
    </form>


    <h1>게시판 목록</h1>
    <table style="border : 1px;">
        <tr>
            <th>게시글번호</th>
            <th>제목</th>
        </tr>
        <c:forEach var="book" items="${list}">
            <tr>
                <td>${book.bookSerial}</td>
                <td>${book.bookTitle}</td>
            </tr>
        </c:forEach>
    </table>

    <h1>게시판 상세</h1>
    <table style="border : 1px;">
        <tr>
            <th>게시글번호</th>
            <th>제목</th>
        </tr>
            <tr>
                <td>${book.bookSerial}</td>
                <td>${book.bookTitle}</td>
            </tr>
    </table>

</body>

<style>
  table {
    width: 100%;
    border: 1px solid #444444;
  }

  th, td {
      border: 1px solid #444444;
    }
</style>
</html>