<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Feedback</title>
</head>
<body>
<h1>Student Feedback Form</h1>

<form action="student" method="post">

<input type="number" name="ecno" placeholder="Enter your EC number" required>
<br>

<input type="text" name="studentname" placeholder="Enter your student name" required>
<br>

<textarea name="studentfeedback" placeholder="Enter your feedback" required></textarea>
<br>

<button type="submit">Submit Feedback</button>
</form>

</body>
</html>