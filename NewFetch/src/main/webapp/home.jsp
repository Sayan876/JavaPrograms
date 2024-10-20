<%@page import="com.jsp.control.CustomerControl"%>
<%@page import="com.jsp.dto.Customer"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.dao.CustomerDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fetching page</title>
</head>
<body>
  <%CustomerControl ccdao = new CustomerControl(); 
    double sumage = ccdao.sumOfAge();
    double avgage = ccdao.avgOfAge();
  %>
  <h1>All Customers</h1>
  <h2>Sum of everyone's age <%=sumage %></h2>
  <h2>Average of everyone's age <%=avgage %> </h2>
  <h2><a href="create.jsp">Add more customers</a></h2>
  
  <table border="1">
  <thead>
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Email</th>
      <th>Age</th>
      <th>Gender</th>
      <th>Phone</th>
      <th>Action</th>
    </tr>
  </thead>
  <tbody>
      <% CustomerControl cdao = new CustomerControl();
         List<Customer> list = cdao.allCust();
         
         for(Customer c:list)
         {%>
        	 <tr>
        	   <td><%=c.getId() %></td>
        	   <td><%=c.getName() %></td>
        	   <td><%=c.getEmail() %></td>
        	   <td><%=c.getAge() %></td>
        	   <td><%=c.getGender() %></td>
        	   <td><%=c.getPhone() %></td>
        	   <td><button><a href="UpdateCustomer.jsp?id=<%=c.getId()%>">Edit</a></button>
        	   <button><a href="deletes?id=<%=c.getId()%>">Delete</a></button></td>
        	   
        	 </tr>
         <%}
      %>
  </tbody>
  
  </table>
</body>
</html>