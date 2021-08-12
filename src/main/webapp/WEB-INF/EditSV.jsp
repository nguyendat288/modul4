<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/8/2021
  Time: 9:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Student</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Table Edit Student</h2>
    <form method="post">
        <table class="table">
            <tbody>
            <tr>
                <td><input placeholder="Enter the id" name="id" value="${student1.id}" readonly></td>
                <td><input placeholder="Enter the name" name="name" value="${student1.name}"></td>
                <td><input placeholder="Enter the phone" name="phone" value="${student1.phone}"></td>
                <td><input placeholder="Enter the email" name="email" value="${student1.email}"></td>
                <td><input placeholder="Enter the address" name="address" value="${student1.address}"></td>
                <td><input placeholder="Enter the classroom" name="classroom" value="${student1.classroom}"></td>
            </tr>

            </tbody>
        </table>
        <button type="submit" class="btn btn-success">Edit Student</button>

    </form>
</div>
</body>
</html>
