<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Profile</title>
</head>
<body>
<h1>Student Profile</h1>
<form action="NoServlet" method="get">
    Username: <br>
    <input type="text" placeholder="Please enter your username" name="userName" id = "userName" required>
    <br>
    Registration Number: <br>
    <input type="text" placeholder="Enter your registration number" name = "regno" id="regno">
    <br>

    <label>Gender: </label> <br>
    <select name = "gender" id="gender">
        <option value="male">MALE</option>
        <option value="female">FEMALE</option>
    </select>
    <br>
    <p>Please select your programme: </p>
    <input type="radio" id="CSE" name="programme" value="CSE">
    <label for="CSE">CSE</label><br>
    <input type="radio" id="IT" name="programme" value="IT">
    <label for="IT">IT</label><br>
    <input type="radio" id="ECE" name="programme" value="ECE">
    <label for="ECE">ECE</label>
    <br>
    <button type="submit">Register</button>
</form>
</body>
</html>


