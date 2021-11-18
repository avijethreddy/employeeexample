<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Employee</title>
</head>
<body>


<div>
<form action="addemployee" method="post">

<h2>Enter Employee Details</h2>
<p>Employee ID : <input type="text" placeholder="Employee ID" name="employeeId"></p>
<p>Name : <input type="text" placeholder="Employee Name" name="employeeName"></p>
<p>Email : <input type="email" placeholder="Email" name="email"></p>
<p>Birth Date : <input type="date" placeholder="Birth Date" name="dob"></p>
<button type="submit">Save Employee</button>

</form>

</div>

<div>
<form action="search" method="get">
<input type="text" name="idtxt" placeholder="Enter Employee ID">
<button type="submit">Search</button>
</form>

</div>

</body>
</html>