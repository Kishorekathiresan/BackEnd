<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Choose Role</title>
</head>
<body>
    <h2>Choose Your Role</h2>
    <form>
        <div>
            <button type="submit" formaction="/doctorlogin">Doctor</button>
            <button type="submit" formaction="/receptionistlogin">Receptionist</button>
            <button type="submit" formaction="/administratorlogin">Administrator</button>
        </div>
    </form>
</body>
</html>
