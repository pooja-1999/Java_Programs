<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
	<%@ page import="java.io.*" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Quiz</title>
</head>
<body>
<h3>Quiz</h3>
<form action="result.jsp"  method =post>
<table border="1">
<tr>
<td>QuestionNo.</td>
<td>Question</td>
<td>Option1</td>
<td>Option2</td>
<td>Option3</td>
<td>Option4</td>
<td>EnterAnswer</td>
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

String QueryString = "SELECT QuestionNo, Question, qoption1, qoption2, qoption3,qoption4 FROM quiztable WHERE Quizid='Q01'";
rs = statement.executeQuery(QueryString);
%>

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
<TD><input type="text" name="answer" /></TD>
</TR>
<% } %>
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
</TABLE>


<br></br>
<h3>Enter the options for each questions</h3>
Eg:(a) JAVA (Copy Paste Your Answer)
<br>
<h3>Answer for Question No.1</h3>
<input type="text" name="ans1" />
<br>
<h3>Answer for Question No.2</h3>
<input type="text" name="ans2" />
<br>
<h3>Answer for Question No.3</h3>
<input type="text" name="ans3" />
<br>
<h3>Answer for Question No.4</h3>
<input type="text" name="ans4" />
<br>
<h3>Answer for Question No.5</h3>
<input type="text" name="ans5" />
<br></br>
<input type="submit" value="Submit" />
</form>




</body>
</html>