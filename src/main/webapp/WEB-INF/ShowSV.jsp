<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/8/2021
  Time: 9:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sách sinh viên</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">


    <h2>Show Student</h2>
    <a href="/create" class="btn btn-success">Create</a>
    <br>
    <form action="/find" method="get">
        <input type="text" placeholder="Enter the id you want to find" name ="findName">
        <input type="text" hidden name="action" value="findName">
        <button type="submit" class="btn btn-info">Find by name</button>
    </form>
    <br>
    <br>
    <br>
    <table class="table" border="2px">
        <thead>
        <tr>
            <th>id</th>
            <th>Name Student</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Address</th>
            <th>Class</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${ListStudent}" var="student" varStatus="loop">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.phone}</td>
                <td>${student.email}</td>
                <td>${student.address}</td>
                <td>${student.classroom}</td>
                <td><a href="/edit?index=${loop.index}" class="btn btn-warning">Edit</a></td>
                <td><a href="/delete?index=${loop.index}" class="btn btn-danger">Delete</a></td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>
</body>
</html>
