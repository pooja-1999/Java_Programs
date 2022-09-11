<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Password</title>
</head>
<body>

<form method="POST">

		<div align="center">
		<h4>Enter Login Details to update password</h4>
			<table>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="userName" /></td>
				</tr>
				<tr>
					<td>Old Password</td>
					<td><input type="password" name="oldpassword" /></td>
				</tr>
				<tr>
					<td>New Password</td>
					<td><input type="password" name="newpassword" /></td>
				</tr>
				<tr>
					<td>Access Token</td>
					<td><input type="text" name="token" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</table>
			<div style="color: red">${error}</div>

		</div>
	</form>
</body>
</html>