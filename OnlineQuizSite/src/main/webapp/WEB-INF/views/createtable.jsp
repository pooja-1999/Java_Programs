<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Creating Quiz</title>
</head>
<body>
<h2>Questions Available</h2>
<table border="1">
<tr>
<td>QuestionId</td>
<td>Question</td>
<td>Option1</td>
<td>Option2</td>
<td>Option3</td>
<td>Option4</td>
<td>Answer</td>
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

String QueryString = "SELECT * from questiontable";
rs = statement.executeQuery(QueryString);
%>

<%
while (rs.next()) {
%>
<TR>
<TD><%=rs.getInt(1)%></TD>
<TD><%=rs.getString(2)%></TD>
<TD><%=rs.getString(3)%></TD>
<TD><%=rs.getString(4)%></TD>
<TD><%=rs.getString(5)%></TD>
<TD><%=rs.getString(6)%></TD>
<TD><%=rs.getString(7)%></TD>
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

<h3>Enter Quiz ID:</h3>
<br>
<input type="text" name="quizid" />
<br></br>
<h3>Enter Quiz Name:</h3>
<br>
<input type="text" name="quizname" />
<br></br>
<h3>Enter the selected question Ids</h3>
<input type="text" name="qid1" />
<input type="text" name="qid2" />
<input type="text" name="qid3" />
<input type="text" name="qid4" />
<input type="text" name="qid5" />
<br></br>
<input type="submit" value="Submit" />


</body>
</html>