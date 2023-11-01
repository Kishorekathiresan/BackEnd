<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Doctor Login</title>
</head>
<body>
    <h2>Doctor Login</h2>
 
    <form action="/receptionistlogin" method="post">
        <div>
            <label for="username">Username:</label>
            <input type="text" id="username" name="user" required>
        </div>
        <div>
            <label for="password">Password:</label>
            <input type="password" id="password" name="pass" required>
        </div>
        <div>
            <button type="submit">Login</button>
        </div>
    </form>
 
    
</body>
</html>