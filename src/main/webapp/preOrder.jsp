<%@ page import="lv.javaguru.java2.domain.Motorcycle" %>
<%@ page import="java.util.Map" %>
<%@ page import="lv.javaguru.java2.domain.Accessory" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
    Map<String, Object> preOrderData = (Map<String, Object>)request.getAttribute("model");
    Motorcycle motorcycle = (Motorcycle)preOrderData.get("motorcycle");
    List<Accessory> accessories = (List<Accessory>)preOrderData.get("accessories");
    if(motorcycle != null) {
%>
<div style="width:250px; float:left; height:100px; border:1px solid #000; vertical-align: middle;text-align: center">
    <h2><%=motorcycle.getMake()%></h2>
    <h3><%=motorcycle.getModel()%></h3>
</div>

<div style="width:50px; float:left; height:100px">

</div>

<div style="width:250px; float:left; height:100px">
    <%for(Accessory accessory : accessories) { %>
    <div style="clear: left">
        <%=accessory.getAccessory()%>
    </div>
    <%}%>
</div>

<div style="height:15px; clear: left">

</div>

<div style="clear: left">
    <ul>
        <li><%=motorcycle.getProductionYear()%></li>
        <li><%=motorcycle.getEngineCapacity()%></li>
        <li><%=motorcycle.getFuelType()%></li>
        <li><%=motorcycle.getFuelConsumption()%></li>
        <li><%=motorcycle.getRentPrice()%></li>
        <li><%=motorcycle.getEngineTypeByStrokes()%></li>
        <li><%=motorcycle.getDriveType()%></li>
        <li><%=motorcycle.getMotorcycleType()%></li>
    </ul>
</div>

<%}%>
</body>
</html>
