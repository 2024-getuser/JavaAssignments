package javaAssignment;

public class Testemployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.set_Id(-9);
		emp.set_Name("Akhil");
		emp.set_Salary(2400.90);
		System.out.println("Employee ID : " + emp.get_Id());
		System.out.println("Employee Name : " + emp.get_Name());
		System.out.println("Employee Salary : " + emp.get_Salary());
	}

}
