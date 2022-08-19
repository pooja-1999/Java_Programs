<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Details</title>
</head>
<body>
<%
  if (request.getParameter("error") != null)
          out.println("<b>Your product details are invalid. Enter Again.</b><br>");
%>

<form action="ProductInfoDet" method="post">
  Product ID: <input type="text" name="id" id="id" maxlength=10><br>
  Product Name: <input type="text" name="name" id="name" maxlength="40"><br>
  Product Price: <input type="text" name="price" id="price" maxlength="10"><br>
  <button>Submit</button>
</form>
</body>
</html>