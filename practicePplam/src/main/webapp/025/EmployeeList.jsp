<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 18/12/2566
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Employee List</title>
</head>
<body>
<h1>Employee Management</h1>

<form action="EmployeeSearchServlet" method="post">
    <label for="searchField">Enter name: </label>
    <input type="text" name="searchField" id="searchField" placeholder="Type here...">
    <input type="submit" value="SUBMIT">
    <a href="./EmployeeAdd.jsp">&nbsp;<input type="button" value="ADD EMPLOYEE"></a>
</form>
    <p> ${message}</p>

    <c:forEach items="${employees}" var="employees" varStatus="loop">
        <li>
            ID: ${employees.id} <br/>
        </li>
        <li>
            FirstName: ${employees.firstName} <br>
        </li>
        <li>
            LastName: ${employees.lastName}
        </li>
        <form action="EmployeeRemove" method="post">
            <input type="submit" value="REMOVE">
        </form>
        <br/>
    </c:forEach>
    <hr/>

</body>
</html>
