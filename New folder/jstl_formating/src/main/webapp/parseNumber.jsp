<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
<f:view>
<h3>The fmt:parseNumber tag Example is:</h3>  
  
<c:set var="Amount" value="786.970" />  
  	<%-- print the number of var Amount --%>
    <fmt:parseNumber var="j" type="number" value="${Amount}" />  
    <p><i>Amount is:</i>  <c:out value="${j}" /></p>  
  
  <%-- print the integer number of var Amount --%>
  
    <fmt:parseNumber var="j" integerOnly="true" type="number" value="${Amount}" />  
    <p><i>Amount is:</i>  <c:out value="${j}" /></p>  


</f:view>
</body>
</html>