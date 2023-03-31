package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		List<Department> list = new ArrayList<>();

		System.out.println("\n=== TEST 1: Department insert =====");
		Department newDepartment = new Department(null, "Home appliances");
		depDao.insert(newDepartment);
		System.out.println("Inserted! New Id = " + newDepartment.getId());

		System.out.println("\n=== TEST 2: Department findById =====");
		newDepartment = depDao.findById(3);
		System.out.println(newDepartment);

		System.out.println("\n=== TEST 3: Department update =====");
		newDepartment = depDao.findById(1);
		newDepartment.setName("Cars");
		depDao.update(newDepartment);
		System.out.println("Update Completed! ");

		System.out.println("\n=== TEST 4: department findAll =====");
		list = depDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 5: department delete =====");
		System.out.println("Enter id for delete test:");
		int id = sc.nextInt();
		depDao.deleteById(id);
		sc.close();
		System.out.println("\n=== TEST 6: department findAll =====");
		list = depDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
	}

}
