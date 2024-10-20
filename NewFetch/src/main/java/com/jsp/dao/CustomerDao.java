package com.jsp.dao;
import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.dto.Customer;



@Repository
public class CustomerDao {
    @Autowired
	private EntityManager manager;
    
    public Customer saveCustomer(Customer customer) {
    	EntityTransaction transaction = manager.getTransaction();
    	transaction.begin();
    	manager.persist(customer);
    	transaction.commit();
    	return customer;
    }
    
    public List<Customer> fetchEveryone() {
    	Query query = manager.createQuery("select c from Customer c");
    	return query.getResultList();
    }
    
    public Customer updateCustomer(Customer customer) {
    	EntityTransaction transaction = manager.getTransaction();
    	Customer dbcust = manager.find(Customer.class, customer.getId());
    	if(dbcust!=null) {
    		dbcust.setAge(customer.getAge());
    		dbcust.setEmail(customer.getEmail());
    		dbcust.setGender(customer.getGender());
    		dbcust.setName(customer.getName());
    		dbcust.setPassword(customer.getPassword());
    		dbcust.setPhone(customer.getPhone());
    		transaction.begin();
    		transaction.commit();
    		return dbcust;
    	}return null;
    }
    
    public Customer findCustomerById(int id) {
    	Query query = manager.createQuery("select c from Customer c where c.id=?1");
    	query.setParameter(1, id);
    	try {
    		return (Customer) query.getSingleResult();
    	}catch(NoResultException e){
    	    return null;
    	}
    }
    
    public Customer deleteCustomer(int id) {
    	Customer dbcust = manager.find(Customer.class, id);
    	if(dbcust!=null) {
    		EntityTransaction transaction = manager.getTransaction();
    		transaction.begin();
    		manager.remove(dbcust);
    		transaction.commit();
    		return dbcust;
    	}
    	
    	return null;
    	
    }
    
    public List<Integer> avarageAge() {
    	Query query = manager.createQuery("select c.age from Customer c");
    	return query.getResultList();
    }
}
