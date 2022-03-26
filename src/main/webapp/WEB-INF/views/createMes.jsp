<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Создание Message</title>
</head>
<body>
<div>
    <a href="<c:url value='/index'/>">Гланая</a>
</div>
<div>
    <form action="<c:url value="/save"/> " method="post">
        <input type="text" name="text" placeholder="Введите сообщение"/>
        <input type="text" name="tag" placeholder="tag">
        <button type="submit">Добавить</button>
    </form>
</div>
</body>
</html>