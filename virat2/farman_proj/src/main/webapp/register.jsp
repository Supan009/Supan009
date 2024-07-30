<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="register" method="post">
    <label for="name">Name:</label><br>
    <input type="text" id="name" name="name" required><br>
    
    <label for="address">Address:</label><br>
    <input type="text" id="address" name="address" required><br>
    
    <label for="email">Email:</label><br>
    <input type="email" id="email" name="email" required><br>
    
    <label for="username">Username:</label><br>
    <input type="text" id="username" name="username" required><br>
    
    <label for="password">Password:</label><br>
    <input type="password" id="password" name="password" required><br>
    
    <label>Gender:</label><br>
    <input type="radio" id="male" name="gender" value="male" required>
    <label for="male">Male</label><br>
    <input type="radio" id="female" name="gender" value="female">
    <label for="female">Female</label><br>
    <input type="radio" id="other" name="gender" value="other">
    <label for="other">Other</label><br>
    
    <label>Courses:</label><br>
    <input type="checkbox" id="course1" name="courses[]" value="course1">
    <label for="course1">Course 1</label><br>
    <input type="checkbox" id="course2" name="courses[]" value="course2">
    <label for="course2">Course 2</label><br>
    <input type="checkbox" id="course3" name="courses[]" value="course3">
    <label for="course3">Course 3</label><br>
    
    <input type="submit" value="Submit">
    <input type="reset" value="Reset">
</form>

</body>
</html>