<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Details</title>
</head>
<body>
    <h1>Employee Form</h1>
    <form action="submitEmployee" method="post">
        <label for="id">Employee ID:</label>
        <input type="text" id="id" name="id" required><br><br>
        
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        
        <label for="salary">Salary:</label>
        <input type="number" id="salary" name="salary" required><br><br>
        
        <label for="gender">Gender:</label>
        <select id="gender" name="gender">
            <option value="Male">Male</option>
            <option value="Female">Female</option>
            <option value="Other">Other</option>
        </select><br><br>
        
        <button type="submit">Submit</button>
    </form>
</body>
</html>

</body>
</html>