package com.jsp.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.CustomerConfig;
import com.jsp.dao.CustomerDao;
import com.jsp.dto.Customer;

@WebServlet("/deletes")
public class DeleteCustomer extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfig.class);
		CustomerDao cdao = context.getBean(CustomerDao.class);
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		Customer c = cdao.deleteCustomer(id);
		
		if(c!=null) {
			resp.sendRedirect("home.jsp");
		}else {
			resp.sendRedirect("Failed.jsp");
		}
	}

}
