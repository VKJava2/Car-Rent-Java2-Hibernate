<%@ page import="lv.javaguru.java2.domain.Car" %>
<%@ page import="lv.javaguru.java2.domain.Motorcycle" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Car found</title>
</head>
<body>

<%
  Motorcycle motorcycle = (Motorcycle)request.getAttribute("model");
  if(motorcycle != null) {
%>
<h1>Car found!!!</h1>
<ul>
  <li><%=motorcycle.getMake()%></li>
  <li><%=motorcycle.getModel()%></li>
  <li><%=motorcycle.getEngineTypeByStrokes()%></li>
</ul>
<%}
else
{%>
<h1>Error occured</h1><%
  }
%>

</body>
</html>
