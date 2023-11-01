<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
    <h1>Currency Detail</h1>
    <form action="ConvertedValue" method="post">
        <label>From Currency:</label>
        <select name="sourceCurrency">
            <option value="INR">INR</option>
            <option value="EUR">EUR</option>
            <option value="USD">USD</option>
            <option value="JPY">YEN</option>
        </select>
        <br>
		<label>To Currency:</label>
        <select name="targetCurrency">
            <option value="INR">INR</option>
            <option value="EUR">EUR</option>
            <option value="USD">USD</option>
            <option value="JPY">YEN</option>
        </select>
        <br>
        <label>Amount:</label>
        <input type="text" name="amount" required>
        <br>
        <input type="submit" value="Convert"><br>
    </form>
</body>
</html>