<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<html>  
<head>  
<title>fmt:bundle Tag</title>  
</head>  
<body>  
  
<fmt:bundle basename="com.jstl_formating.Simple" prefix="colour.">  
   <fmt:message key="Violet"/><br/>  
   <fmt:message key="Indigo"/><br/>  
  <fmt:message key="Blue"/><br/>  
  
</fmt:bundle>  
  
</body>  
</html>  