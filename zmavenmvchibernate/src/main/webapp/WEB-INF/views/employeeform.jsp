<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="aqua">
<form  action="/zmavenmvchibernate/employees/save" method="POST">
<table border="2">
<tr>
	<td></td>
	<td><input type="hidden" name="empId" value="${employee.id}" /></td>
</tr>
<tr>
	<td>Employee Name</td>
	<td><input type="text" name="empName" value="${employee.employeeName}" /></td>
</tr>
<tr>
	<td>Employee Address</td>
	<td><input type="text" name="empAddress" value="${employee.employeeAddress}"/></td>
</tr>
<tr>
	<td>Employee Phone</td>
	<td><input type="text" name="empPhone" value="${employee.employeePhone}"/></td>
</tr>
<tr>
	<td>Employee Salary</td>
	<td><input type="text" name="empSalary" value="${employee.employeeSalary}"/></td>
</tr>
<tr>
	<td><input type="submit" value="Save Record" /></td>
	<td><input type="reset" value="ReSet..." /></td>
</tr>
</table>
</form>
</body>
</html>