<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Зарегистрированные пользователи</title>
</head>
<body>
<div>
    <a href="<c:url value='/index'/>">Гланая</a>
</div>
<div>
    <table>
        <thead>
        <tr>
            <td>Имя</td>
            <td>Роль</td>
            <td>Редактировать</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${users}" var="user">
        <tr>
            <td><c:out value="${user.username}"/></td>
            <td><c:out value="${user.authority.authority}"/></td>
            <td>
                <a href="<c:url value='/users/edit?id=${user.id}'/>">
                    *
                </a>
            </td>
        </tr>
        </tbody>
        </c:forEach>
    </table>
</div>
</body>
</html>