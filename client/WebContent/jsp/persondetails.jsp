<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Patient List</h1>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Middle Name</th>
			<th>Last Name</th>
			<th>Age</th>
			<th>DOB</th>
			<th>Phone No</th>
			<th>Address</th>
			<th>City</th>
			<th>State</th>
			<th>Country</th>
			<th>Type Of Diagnosis</th>
			<th>Consulation Dept</th>
			<th>Doctor Name</th>
			<th>Medications</th>
			<th>Report Summary</th>
			<th>Next Consultation Date</th>

			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="person" items="${list}">
			<tr>
				<td>${person.id}</td>
				<td>${person.firstName}</td>
				<td>${person.middleName}</td>
				<td>${person.lastName}</td>
				<td>${person.age}</td>
				<td>${person.dob}</td>
				<td>${person.phoneno}</td>
				<td>${person.address}</td>
				<td>${person.city}</td>
				<td>${person.state}</td>
				<td>${person.country}</td>
				<td>${person.typeofdiagnosis}</td>
				<td>${person.consulationdept}</td>
				<td>${person.doctorname}</td>
				<td>${person.medications}</td>
				<td>${person.reportsummary}</td>
				<td>${person.nextconsulationdate}</td>


				<td><a href="editperson/${person.id}">Edit</a></td>
				<td><a href="deleteperson/${person.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="/HealthcareProject_Client/entryaddperson.do">Add New
		Patient</a>

</body>
</html>