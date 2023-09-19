<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Supermarket</title>
</head>
<body>
<h1>Supermarket</h1>
<form action="NoServlet" method="get">
    Username: <br>
    <input type="text" placeholder="Please enter your username" name="userName" id = "userName" required>
    <br>
    Item name <br>
    <input type="text" placeholder="Enter your quantity" name = "quan" id="quan">
    <br>

    <label>Item Name </label> <br>
    <select name = "item" id="item">
        <option value="apple">APPLE</option>
        <option value="orange">ORANGE</option>
        <option value = "mango">MANGO</option>
    </select>
    <br>
    <p>Membership type: </p>
    <input type="radio" id="Silver" name="mem" value="Silver">
    <label for="Silver">Silver</label><br>
    <input type="radio" id="Gold" name="mem" value="Gold">
    <label for="Gold">Gold</label><br>
    <input type="radio" id="Platinum" name="mem" value="Platinum">
    <label for="Platinum">Platinum</label>
    <br>
    <button type="submit">Register</button>
</form>
</body>
</html>
