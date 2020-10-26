<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal Info Page</title>
</head>
<body>
	<center>
		<h1>View Page</h1>
	</center>
	<form:form method="POST" modelAttribute="user">
		<table>
			<tr>
				<td>id:</td>
				<td><form:input value="${person.id}" path="id" /></td>
			</tr>
			<tr>
				<td colspan="2">
				<td><a href="editperson/${person.id}">Edit</a></td>
				</td>
			</tr>
		</table>

	</form:form>
</body>
</html>