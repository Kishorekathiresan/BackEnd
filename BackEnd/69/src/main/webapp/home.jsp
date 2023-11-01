<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hospital Appointment Booking</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f7f7f7;
            margin: 0;
            padding: 0;
        }

        h2 {
            text-align: center;
            color: #333;
            margin-top: 30px;
        }

        form {
            text-align: center;
        }

        .button-container {
            display: flex;
            justify-content: center;
            margin-top: 30px;
        }

        .button-container button {
            padding: 10px 20px;
            font-size: 16px;
            margin: 10px;
            background-color: #007BFF;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .button-container button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h2>Book an Appointment</h2>
    <form>
        <div class="button-container">
            <button type="submit" formaction="/doctorlogin">Book with a Doctor</button>
            <button type="submit" formaction="/receptionistlogin">Contact Reception</button>
            <button type="submit" formaction="/administratorlogin">Administrator Access</button>
        </div>
    </form>
</body>
</html>
