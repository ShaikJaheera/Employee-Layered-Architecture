package com.prodapt.service;

import java.sql.SQLException;
import java.util.List;

import com.prodapt.dao.EmployeeDAO;
import com.prodapt.dao.EmployeeDAOImpl;
import com.prodapt.dto.EmployeeEntity;



public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDAO dao=new EmployeeDAOImpl();

	@Override
	public void create(EmployeeEntity en) throws SQLException {
		dao.createConncetion();
		int a=dao.insertDetails(en);
		
		if(a>0) {
			 System.out.println("Your value has been successfully inserted...");
		 }else {
			 System.out.println("Values have not been inserted");
		 }
		dao.closeConnection();
	}

	@Override
	public void getAllEmpDetails() throws SQLException {
		dao.createConncetion();
		List<EmployeeEntity> displayAllDetails = dao.displayAllDetails();
		System.out.println(displayAllDetails);
		dao.closeConnection();
	}

	@Override
	public EmployeeEntity getEmployeeById(int id) throws SQLException {
		dao.createConncetion();
		EmployeeEntity entity = dao.getById(id);
		System.out.println(entity);
		dao.closeConnection();
		return entity;
	}

	@Override
	public void getEmployeeByEmail(String name) throws SQLException {
		dao.createConncetion();
		EmployeeEntity entity = dao.getByEmail(name);
		System.out.println(entity);
		dao.closeConnection();
	}

	@Override
	public int updateEmployeeDetails(EmployeeEntity emp) throws SQLException {
		dao.createConncetion();
		int updateDetails = dao.updateDetails(emp);
		dao.closeConnection();
		return updateDetails;
	}

	@Override
	public int deleteEmployeeById(int id) throws SQLException {
		dao.createConncetion();
		int count=dao.deleteEmployeeById(id);
		dao.closeConnection();
		return count;
	}

	@Override
	public int deleteEmployeeByName(String email) throws SQLException {
		dao.createConncetion();
		int em=dao.deleteEmployeeByName(email);
		dao.closeConnection();
		return em;
	}

	@Override
	public void create(EmployeeEntity en) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EmployeeEntity getEmployeeById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateEmployeeDetails(EmployeeEntity emp) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEmployeeDetails1(EmployeeEntity emp) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
}