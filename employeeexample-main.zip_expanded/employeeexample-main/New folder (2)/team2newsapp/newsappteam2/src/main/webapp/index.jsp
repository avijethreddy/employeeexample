<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RECENT</title>
</head>
<body>
<div>
<div>
<form action="adduser" method="post">
<h2>Enter Employee Details</h2>
<p>User ID : <input type="text" placeholder="User ID" name="userId"></p>
<p>User Name : <input type="text" placeholder="User Name" name="userName"></p>
<p>Email : <input type="email" placeholder="Email" name="email"></p>
<p>Password : <input type="password" placeholder="password" name="passWord"></p>
<p>active : <input type="boolean" placeholder="active" name="active"></p>
<p>roles : <input type="text" placeholder="role" name="roles"></p>

<button type="submit">Save Employee</button>
</form>
</div>
</div>
</body>
</html>