<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>

<%

        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        
        if (name == null || name.equals("") || pwd == null || pwd.equals("")) {
                response.sendRedirect("Sessionhandling5.jsp?error=1");
        } else {
                
                session.setAttribute("name", name);
                response.sendRedirect("Dashboard5.jsp");
                
        }
%>

</body>
</html>