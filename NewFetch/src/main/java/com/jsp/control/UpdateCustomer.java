package com.jsp.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.CustomerConfig;
import com.jsp.dao.CustomerDao;
import com.jsp.dto.Customer;
@WebServlet("/updatecustomer")
public class UpdateCustomer extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfig.class);
		CustomerDao cdao = context.getBean(CustomerDao.class);
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		int id = Integer.parseInt(req.getParameter("id"));
		String email = req.getParameter("email");
		long phone = Long.parseLong(req.getParameter("phone"));
		int age = Integer.parseInt(req.getParameter("age"));
		
		
		
		Customer cu = new Customer();
		
		cu.setEmail(email);
		cu.setGender(gender);
		cu.setId(id);
		cu.setName(name);
		cu.setPassword(password);
		cu.setPhone(phone);
		cu.setAge(age);
		
		cu = cdao.updateCustomer(cu);
		HttpSession session = req.getSession();
		if(cu!=null) {
		     resp.sendRedirect("home.jsp");	
		}else {
			resp.sendRedirect("Failed.jsp");
		}
	}

}
