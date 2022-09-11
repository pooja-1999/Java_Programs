<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page import="java.sql.*" %>
	<%@ page import="java.io.*" %> 
	<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
<h3>Result</h3>
<form method =post>
<table border="1">
<%
String Ans1=request.getParameter("ans1"); %>
<%
String Ans2=request.getParameter("ans2"); %>
<%
String Ans3=request.getParameter("ans3"); %>
<%
String Ans4=request.getParameter("ans4"); %>
<%
String Ans5=request.getParameter("ans5"); %> 
<tr> 
<tr>
<td>QuestionNo.</td>
<td>Question</td>
<td>Option1</td>
<td>Option2</td>
<td>Option3</td>
<td>Option4</td>
<td><p style="color:green;">Answer</p></td>

</tr>
<%

try {

String connectionURL = "jdbc:mysql://localhost:3306/quizes";

Connection connection = null;

Statement statement = null;

ResultSet rs = null;

Class.forName("com.mysql.jdbc.Driver").newInstance();

connection = DriverManager.getConnection(connectionURL, "root", "root");

statement = connection.createStatement();

String QueryString = "SELECT QuestionNo, Question, qoption1, qoption2, qoption3,qoption4,qanswer FROM quiztable WHERE Quizid='Q01'";
rs = statement.executeQuery(QueryString);
%>

<%
ArrayList<String> al = new ArrayList<String>()
%>
<% 
int score = 0; %>
<% 
while (rs.next()) {
%>
<TR>
<TD><%=rs.getString(1)%></TD>
<TD><%=rs.getString(2)%></TD>
<TD><%=rs.getString(3)%></TD>
<TD><%=rs.getString(4)%></TD>
<TD><%=rs.getString(5)%></TD>
<TD><%=rs.getString(6)%></TD>
<TD><p style="color:green;"><%=rs.getString(7) %></p></TD>
<%al.add(getString(7)); %>

</TR>
<% } %>
</TABLE>
<br></br>
<h3>RESULT</h3>

<br>
<h3>Answer for Question No.1</h3>
<% if (Ans1.equals(al.get(0))) 
	{out.println("Correct Answer");
	score = 10+score;}
else{out.println("Wrong Answer");}
%>

<br>
<h3>Answer for Question No.2</h3>
<% if (Ans2.equals(al.get(1))) 
	{out.println("Correct Answer");
	score = 10+score;}
else{out.println("Wrong Answer");}
%>
<br>
<h3>Answer for Question No.3</h3>
<% if (Ans3.equals(al.get(2))) 
	{out.println("Correct Answer");
	score = 10+score;}
else{out.println("Wrong Answer");}
%>
<br>
<h3>Answer for Question No.4</h3>
<% if (Ans4.equals(al.get(3))) 
	{out.println("Correct Answer");
	score = 10+score;}
else{out.println("Wrong Answer");}
%>
<br>
<h3>Answer for Question No.5</h3>
<% if (Ans5.equals(al.get(4))) 
	{out.println("Correct Answer");
	score = 10+score;}
else{out.println("Wrong Answer");}
%>
<h2>Your Total Score = </h2><%=score %>
<%




rs.close();
statement.close();
connection.close();
} catch (Exception ex) {
%>

<%
out.println("Unable to connect to database.");
}
%>




</form>




</body>
</html>