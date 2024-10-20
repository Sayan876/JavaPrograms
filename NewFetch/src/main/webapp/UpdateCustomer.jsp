<%@page import="com.jsp.dto.Customer"%>
<%@page import="com.jsp.control.CustomerControl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Customer Form</title>
</head>
<body>

<% int id = Integer.parseInt(request.getParameter("id")); 
   CustomerControl cdao = new CustomerControl();
   Customer c = cdao.findforUpdate(id);
%>
  <form action="updatecustomer" method="post">
      <input  value="<%=id%>" name="id">
      <input placeholder="Enter the name" name="name" value="<%=c.getName()%>">
      <input placeholder="Enter age" name="age" value="<%=c.getAge()%>">
      <input readonly name="email" value="<%=c.getEmail()%>">
      <input placeholder="Enter the new phone number" name="phone" value="<%=c.getPhone()%>">
      <input placeholder="Enter new password" name="password" value="<%=c.getPassword()%>">
      <input placeholder="Gender" name="gender" value="<%=c.getGender()%>">
      <input type="submit" value="Update" >
  
  </form>

</body>
</html>