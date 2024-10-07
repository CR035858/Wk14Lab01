<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="aqua">
<form>
<a href="/zmavenmvchibernate/employees/add">Add Employee</a>
<table border="2">
<tr><th>Employee Name</th><th>Employee Address</th><th>Employee Phone</th><th>Employee Salary</th><th>Action1</th><th>Action2</th></tr>
<c:forEach items="${employees}" var="employee">
<tr>

	<td>${employee.employeeName}</td>
	<td>${employee.employeeAddress}</td>
	<td>${employee.employeePhone}</td>
	<td>${employee.employeeSalary}</td>
	<td>
		<a href="/zmavenmvchibernate/employees/update?empId=${employee.id}">update</a>
	</td>
	<td>
		<a href="/zmavenmvchibernate/employees/delete?empId=${employee.id}">delete</a>	
	</td>
</tr>
</c:forEach>
</table>
</form>
</body>
</html>