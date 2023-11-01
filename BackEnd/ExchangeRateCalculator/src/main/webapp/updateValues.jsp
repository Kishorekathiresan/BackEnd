<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Exchange Rate</title>
</head>
<body>
    <h1>Update Exchange Rate</h1>
    <form action="/updateValues" method="post">
        <label for="sourceCurrency">Source Currency:</label>
        <input type="text" id="sourceCurrency" name="sourceCurrency" required><br>

        <label for="targetCurrency">Target Currency:</label>
        <input type="text" id="targetCurrency" name="targetCurrency" required><br>

        <label for="rate">Exchange Rate:</label>
        <input type="text" id="rate" name="rate" required><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
