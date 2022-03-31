<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Scriptlet Tag</h1>
<h3><%String name=request.getParameter("uname");
out.println("Welcome  "+name);
%></h3>

<h1>Expression Tag</h1>
<h3><%= "Welcome "+request.getParameter("uname") %>  </h3>

<%-- response.sendRedirect("https://www.google.com/search?q="+name);
--%>
</body>
</html>