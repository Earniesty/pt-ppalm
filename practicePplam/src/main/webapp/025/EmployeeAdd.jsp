<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 18/12/2566
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New Employee</title>
</head>
<body>
<h1>Add New Employee</h1>
<form action="AddServlet" method="post">
<label for="id">ID</label>
<input type="number" name="id" id="id" placeholder="" required ><br>
<label for="fname">FIRST NAME</label>
<input type="text" name="fname" id="fname" placeholder="" ><br>
<label for="lname">LAST NAME</label>
<input type="text" name="lname" id="lname" placeholder="" ><br>
<label for="ext">EXTENSION</label>
<input type="text" name="ext" id="ext" placeholder="" ><br>
<label for="email">EMAIL</label>
<input type="text" name="email" id="email" placeholder="" ><br>
<label for="offcode">OFFICE CODE</label>
<input type="text" name="offcode" id="offcode" placeholder="" ><br>
<label for="report">REPORT</label>
<input type="number" name="report" id="report" placeholder="" ><br>
<label for="job">JOB TITLE</label>
<input type="text" name="job" id="job" placeholder="" ><br>

    ${message}
    <input type="submit" value="SUBMIT">
    <a href="EmployeeListServlet"><input type="button" value="GO BACK"></a>
</form>
</body>
</html>
