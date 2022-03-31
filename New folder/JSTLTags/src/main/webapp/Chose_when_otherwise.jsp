<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>

<%---- Set Tag     --%>
<c:set var="income" scope="session" value="${4000*4}"/>  

<%-- Out Tag --%>
<p>Your income is :<c:out value="${income}"/></p>  


<%-- Chose Tag --%>
<c:choose>  

<%-- When Tag --%>
    <c:when test="${income <= 1000}">  
       Income is not good. <br/>
    </c:when>  
    <c:when test="${income > 10000}">  
        Income is very good.<br/>
    </c:when>  
    
<%-- Otherwise Tag --%> 
    <c:otherwise>  
       Income is undetermined...  
    </c:otherwise>  
</c:choose>





</body>
</html>