<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/style1.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="userInfo">
<table>

	<tr>
	<td><h3>First Name </h3>${user.firstName}<br></td>
	<td><h3>Last Name  </h3>${user.lastName}<br></td>
	</tr>
	
	<tr>
	<td><h3>User Name </h3>${user.userName}<br></td>
	<td><h3>Gender </h3>${user.gender}<br></td>
	</tr>
	
	<tr>
	<td><h3>Phone Number</h3>${user.contactinfo.phoneNumber}<br></td>
	<td><h3>Email</h3>${user.contactinfo.email}<br></td>
	</tr>
	
	<tr>
	<td><h3>LinkedIn URL </h3>${user.contactinfo.linkedInUrl}<br></td>
	<td><h3>Social Security Number</h3>${user.privateinfo.ssn}<br></td>
	</tr>
	
	<tr>
	<td><h3>Credit Card Number </h3>${user.privateinfo.ccn}<br></td>
	<td><h3>Date of Birth </h3>${user.privateinfo.dob}<br></td>
	</tr>
	
	</table>
	<!--  First Name :<h3>${user.firstName}</h3><br>
	Last Name:<h3>${user.lastName}</h3><br>
	User Name:<h3>${user.userName}</h3><br>
	Gender:<h3>${user.gender}</h3><br>
	
	Phone Number:<h3>${user.contactinfo.phoneNumber}</h3><br>
	Email:<h3>${user.contactinfo.email}</h3><br>
	LinkedIn URL:<h3>${user.contactinfo.linkedInUrl}</h3><br>
	
	Social Security Number:<h1>${user.privateinfo.ssn}</h1><br>
	Credit Card Number:<h1>${user.privateinfo.ccn}</h1><br>
	Date of Birth:<h1>${user.privateinfo.dob}</h1><br>-->
	
	</div>
</body>
</html>