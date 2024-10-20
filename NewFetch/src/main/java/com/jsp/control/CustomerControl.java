package com.jsp.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.NoResultException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.CustomerConfig;
import com.jsp.dao.CustomerDao;
import com.jsp.dto.Customer;

public class CustomerControl {
	ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfig.class);
	CustomerDao cdao = context.getBean(CustomerDao.class);
	
	
	public List<Customer> allCust(){
		List<Customer> customerss = cdao.fetchEveryone();
		List<Customer> customers = new ArrayList<Customer>();
		Customer cu = null;
		
		try {
			for(Customer c:customerss) {
				cu = new Customer();
				cu.setEmail(c.getEmail());
				cu.setGender(c.getGender());
				cu.setName(c.getName());
				cu.setPassword(c.getPassword());
				cu.setId(c.getId());
				cu.setPhone(c.getPhone());
				cu.setAge(c.getAge());
				
				customers.add(cu);
			}
		}catch(NoResultException e) {
			e.printStackTrace();
		}
		return customers;
	}
	
	public Customer findforUpdate(int id) {
		Customer c = null;
		
		Customer cu = cdao.findCustomerById(id);
		
		if(cu!=null) {
			c = new Customer();
			c.setEmail(cu.getEmail());
			c.setGender(cu.getGender());
			c.setName(cu.getName());
			c.setPassword(cu.getPassword());
			c.setPhone(cu.getPhone());
			c.setAge(cu.getAge());
		}
		
		return c;
	}
	
	public double sumOfAge() {
		List<Integer> agelist = cdao.avarageAge();
		double sum = 0;
		if(agelist!=null) {
			for(Integer i:agelist) {
				sum=sum+i;
			}
			return sum;
		}
		return 0;
	}
	
	public double avgOfAge() {
		List<Integer> agelist = cdao.avarageAge();
		double sum = 0;
		int count = 0;
		double emptyval = 0;
		double average = 0;

		if(agelist.isEmpty()) {
			return emptyval;
		}else {
			for(Integer i:agelist) {
				sum = sum + i;
				count++;
			}
			
			return sum/count;
		}
	}
   public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfig.class);
	CustomerDao cdao = context.getBean(CustomerDao.class);
	System.out.println("1.Save Customer");
	
	Scanner sc = new Scanner(System.in);
	int op = sc.nextInt();
	switch(op) {
	case 1:{
		System.out.println("Enter the customer details");
		Customer cu = new Customer();
		cu.setName(sc.next());
		cu.setGender(sc.next());
		cu.setPassword(sc.next());
		cu.setPhone(sc.nextLong());
		cu.setEmail(sc.next());
		
		cu = cdao.saveCustomer(cu);
		if(cu!=null) {
			System.out.println("Customer saved with id "+cu.getId() );
		}else {
			System.out.println("Server error");
		}
	}break;
	
	case 2:{
		
		Customer cu = cdao.findCustomerById(1);
		
		if(cu!=null) {
			System.out.println(cu.getName());
		}else {
			System.out.println("Doesn't exist");
		}
		
	}break;
	
	case 3:{
		List<Integer> ages = cdao.avarageAge();
		int sum = 0;
		int count = 0;
		for(Integer i:ages) {
			sum = sum + i;
			count++;
		}
		System.out.println(sum);
		System.out.println(sum/count);
	}break;
	}
}
}
