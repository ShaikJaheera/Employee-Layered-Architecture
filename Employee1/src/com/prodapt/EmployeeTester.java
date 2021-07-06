package com.prodapt;

import java.util.Scanner;

import com.prodapt.dao.EmployeeDAO;
import com.prodapt.dao.EmployeeDAOImpl;
import com.prodapt.dto.EmployeeEntity;
import com.prodapt.service.EmployeeService;
import com.prodapt.service.EmployeeServiceImpl;

public class EmployeeTester {

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAOImpl();
		EmployeeService service = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		int ch = 0;

		try {
			do {
				System.out.println("1.Insert Data\n" + "2.Display data\n" + "3.update the data\n"
						+ "4.Delete the data\n" + "5.Exit\n");
				ch = sc.nextInt();
				switch (ch) {
				case 1:
					EmployeeEntity entity = new EmployeeEntity();
					System.out.println("Please enter the id :");
					entity.setId(sc.nextInt());
					System.out.println("Please enter the name :");
					entity.setName(sc.next());
					System.out.println("Please enter the age :");
					entity.setAge(sc.nextInt());
					System.out.println("Please enter the salary :");
					entity.setSalary(sc.nextInt());
					System.out.println("Please enter the designation :");
					entity.setDesignation(sc.next());
					service.create(entity);
					break;
				case 2:
					int c=0;
					do {
						System.out.println("1.Get all details\n" + "2.Get Details of employee by id\n"
								+ "3.Get Details of employee by name\n" + " Enter your choice:\n");
						ch = sc.nextInt();
						switch (c) {
						case 1:
							System.out.println("Details of employee are :");
							service.getAllEmpDetails();
							break;
						case 2:
							System.out.println("Enter the id of the employee you want to display");
							int id = sc.nextInt();
							service.getEmployeeById(id);
							break;
						case 3:
							System.out.println("Enter the name of the employee you want to display");
							String name = sc.next();
							service.getEmployeeByEmail(name);
						default:
							System.out.println("Please enter a correct choice....");
							break;
						}
					} while (c != 3);
				case 3:
					EmployeeEntity emp = new EmployeeEntity();
					System.out.println("Enter the employee id you want to update");
					emp.setId(sc.nextInt());
					System.out.println("Enter the age you want to update");
					emp.setAge(sc.nextInt());
					service.updateEmployeeDetails(emp);
					break;
				case 4:
					int choice = 0;
					do {
						System.out.println(
								"1.Delete employee by ID\n" + "2.Delete employee by name\n" + " Enter your choice:\n");
						ch = sc.nextInt();
						switch (choice) {
						case 1:
							System.out.println("Enter the id of the employee you want to delete :");
							int id = sc.nextInt();
							service.deleteEmployeeById(id);
							break;
						case 2:
							System.out.println("Enter the name of the employee you want to delete");
							String name = sc.next();
							service.deleteEmployeeByName(name);
							break;
						default:
							System.out.println("Please enter a correct choice....");
							break;
						}
					} while (choice != 2);
					break;
				default:
					System.out.println("Please enter a correct choice!");
					break;
				}

			} while (ch != 4);

		} catch (

		Exception e) {
			System.out.println(e);
			e.printStackTrace();

		}
	}
}