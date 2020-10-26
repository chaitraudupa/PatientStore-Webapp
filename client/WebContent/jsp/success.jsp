<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>
	<h2>Successfully Registered!!!</h2>
	<table>

		<tr>
			<td>First Name :</td>
			<td>${person.firstName}</td>
		</tr>
		<tr>
			<td>Middle Name :</td>
			<td>${person.middleName}</td>
		</tr>
		<tr>
			<td>Last Name :</td>
			<td>${person.lastName}</td>
		</tr>
		<tr>
			<td>Age :</td>
			<td>${person.age}</td>
		</tr>
		<tr>
			<td>DOB :</td>
			<td>${person.dob}</td>
		</tr>
		<tr>
			<td>Phone No :</td>
			<td>${person.phoneno}</td>
		</tr>
		<tr>
			<td>Address:</td>
			<td>${person.address}</td>
		</tr>
		<tr>
			<td>City :</td>
			<td>${person.city}</td>
		</tr>
		<tr>
			<td>State :</td>
			<td>${person.state}</td>
		</tr>
		<tr>
			<td>Country :</td>
			<td>${person.country}</td>
		</tr>
		<tr>
			<td>Type Of Diagnosis :</td>
			<td>${person.typeofdiagnosis}</td>
		</tr>
		<tr>
			<td>Consultation Dept :</td>
			<td>${person.consulationdept}</td>
		</tr>
		<tr>
			<td>Doctor Name :</td>
			<td>${person.doctorname}</td>
		</tr>
		<tr>
			<td>Medications :</td>
			<td>${person.medications}</td>
		</tr>
		<tr>
			<td>Report Summary :</td>
			<td>${person.reportsummary}</td>
		</tr>
		<tr>
			<td>Next Consultation Date :</td>
			<td>${person.nextconsulationdate}</td>
		</tr>

		<tr>
			<td colspan="2"><input type="submit" value="view" /></td>
		</tr>
	</table>
</body>
</html>