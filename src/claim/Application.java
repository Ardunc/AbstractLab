package claim;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		Student s1 = new Student();
		Employee e1 = new Employee();
		
		double telPhoneBill = s1.calculatePhoneBill(120.5);
		double empPhoneBill = e1.calculatePhoneBill(120.5);
		
//		System.out.println(telPhoneBill);
//		System.out.println(empPhoneBill);
		
		
		Person p1 = new Student();
		Person p2 = new Employee();
		
//		p1.calculatePhoneBill(120.5);
//		p2.calculatePhoneBill(120.5);
		
		s1.setFirstName("Alex");
		s1.setLastName("Duncan");
		e1.setFirstName("Nick");
		e1.setLastName("Curtin");
		p1.setFirstName("Derek");
		p1.setLastName("Cebula");
		p2.setFirstName("Sean");
		p2.setLastName("Reedy");
		
		Person[] pArray = new Person[] {s1, e1, p1, p2};

		for(int i = 0; i < pArray.length; i++) {
			
			System.out.println(pArray[i].getFirstName() + " " + pArray[i].getLastName());
			System.out.println("Taxes: $" + pArray[i].taxes(120.5));
		}
		
		List<Student> studentsMain = new ArrayList<Student>();
		List<Employee> employeesMain = new ArrayList<Employee>();
		
		studentsMain.add(s1);
		studentsMain.add((Student) p1);
		employeesMain.add(e1);
		employeesMain.add((Employee) p2);
		
		School primary = new School();
		
		primary.employees.addAll(employeesMain);
		primary.students.addAll(studentsMain);
	}

}
