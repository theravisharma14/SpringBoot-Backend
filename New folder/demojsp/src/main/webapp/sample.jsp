<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%-- Jsp program--%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Message</title>
</head>
<body>
<h3><%out.println("\nHello World!");
	for(int i=0;i<5;i++)
	{
		out.println(i*2);
	}
	
%></h3>
<h2>Declaration Tag</h2>


<%--Declaration Tag--%>


<%! int data =50; %>

<h3><%="Value of the variable: "+data %></h3>

<%--Method Declaration --%>

<h2>Method Declaration</h2>
<%! int cube(int n)
{return n*n*n;
} %>
<h3><%="Cube of 3: "+cube(3) %></h3>

</body>
</html>