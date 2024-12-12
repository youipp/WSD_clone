<%--
  Created by IntelliJ IDEA.
  User: dmltj
  Date: 2024-12-05
  Time: 오후 4:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        img, label{display: inline-block;}
        label{width: 130px;}
        button{background-color: blue; color: white; font-size: 15px}
    </style>
</head>
<body>
    <div style="width: 100%; text-align: center; padding-top: 100px">
        <img src="https://cdn-icons-png.flaticon.com/512/679/679821.png" height="250px" alt="wellcome">
        <br><br>
        <form method="post" action="loginOk">
            <div><label>User ID: </label><input type="text" name="userid" /></div>
            <div><label>Password: </label><input type="text" name="password" /></div>
            <button type="submit">login</button>
        </form>
    </div>
</body>
</html>
