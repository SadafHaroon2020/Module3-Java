<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Form</title>
</head>
<body>

<!-- a).Header Message saying that it is a user form.
b). form with the input fields below:
c). First Name
d). Last Name
e). User Name
f). Gender (radio button type)
g). Phone Number
h). Email
i). LinkedIn URL
j). Social Security Number
k). Credit Card Number
l). Date of Birth -->
	<form action = "process-form" method= "post" modelAttribute="form">
		First Name 			   : <input type="text" name="firstName"/><br>
		Last Name 			   : <input type="text" name="lastName"/><br>
		User Name			   : <input type="text" name="userName"/><br>
		Gender<br><input type="radio" name="gender" value="male"/>Male<br>
				  <input type="radio" name="gender" value="female"/>Female<br>
		Phone Number 		   : <input type="text" name="contactinfo.phoneNumber"/><br>
		Email				   : <input type="text" name="contactinfo.email"/><br>	
		LinkedIn URL	 	   : <input type="text" name="contactinfo.linkedInUrl"/><br>
		Social Security Number : <input type="text" name="privateinfo.ssn"/><br>
		Credit Card Number 	   : <input type="text" name="privateinfo.ccn"/><br>
		Date of Birth	       : <input type="date" name="privateinfo.dob"/><br>
		
		<input type="submit" value="submit" name="button"/><br>
	</form>

</body>
</html>