<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Главная</title>
</head>
<body>
<div>
    <a href="<c:url value='/index'/>">Гланая</a>
    <a href="<c:url value='/create'/>">Создать</a>
    <a href="<c:url value='/users'/>">Пользователи</a>
</div>
<div>
    <form action="<c:url value="/filter"/> " method="post">
        <input type="text" name="tag" placeholder="tag">
        <button type="submit">Найти</button>
    </form>
</div>
<div>
    <table>
        <thead>
        <tr>
            <td>id</td>
            <td>text</td>
            <td>tag</td>
            <td>author</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${messages}" var="message">
        <tr>
            <td><c:out value="${message.id}"/></td>
            <td><c:out value="${message.text}"/></td>
            <td><c:out value="${message.tag}"/></td>
            <td><c:out value="${message.author}"/></td>
        </tr>
        </tbody>
        </c:forEach>
    </table>
</div>
</body>
</html>