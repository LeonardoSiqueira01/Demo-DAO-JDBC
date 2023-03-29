package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		System.out.println("\n=== TEST 1: Department insert =====");
		Department newDepartment = new Department(null, "Home appliances");
		depDao.insert(newDepartment);
		System.out.println("Inserted! New Id = " + newDepartment.getId());
	}

}
