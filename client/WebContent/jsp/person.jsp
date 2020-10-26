<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal Info Page</title>
</head>
<body>
	<center>
		<h1>Personal Info Page</h1>
	</center>
	<form:form method="post" modelAttribute="user"
		action="/HealthcareProject_Client/processaddperson.do">
		<table>
			<tr>
				<td>First Name:</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td>Middle Name:</td>
				<td><form:input path="middleName" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td>DOB:</td>
				<td><form:input path="dob" /></td>
			</tr>
			<tr>
				<td>Phone No:</td>
				<td><form:input path="phoneno" /></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><form:input path="city" /></td>
			</tr>
			<tr>
				<td>State:</td>
				<td><form:input path="state" /></td>
			</tr>
			<tr>
				<td>Country:</td>
				<td><form:input path="country" /></td>
			</tr>
			<tr>
				<td>Type Of Diagnosis:</td>
				<td><form:input path="typeofdiagnosis" /></td>
			</tr>
			<tr>
				<td>Consulation Dept:</td>
				<td><form:input path="consulationdept" /></td>
			</tr>
			<tr>
				<td>Doctor Name:</td>
				<td><form:input path="doctorname" /></td>
			</tr>
			<tr>
				<td>Medications:</td>
				<td><form:input path="medications" /></td>
			</tr>
			<tr>
				<td>Report Summary:</td>
				<td><form:input path="reportsummary" /></td>
			</tr>
			<tr>
				<td>Next Consultation Date:</td>
				<td><form:input path="nextconsulationdate" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save Changes" /></td>
			</tr>
		</table>

	</form:form>
</body>
</html>