package assignments;

public class Ass3_empgrp {

	public static void main(String[] args) {
		//Create object of Employees class
		As3_Employee obj = new As3_Employee();
		
		//Access the data and store in arrays
		String[] employeeNames = new String[3];
		employeeNames[0] = obj.employeeName1;
		employeeNames[1] = obj.employeeName2;
		employeeNames[2] = obj.employeeName3;

		int[] employeeIDs = new int[3];
		employeeIDs[0] = obj.employeeID1;
		employeeIDs[1] = obj.employeeID2;
		employeeIDs[2] = obj.employeeID3;

		//Print the data
		System.out.println("EmpolyeeName " +employeeNames[0] +   "  EmployeeId : " + employeeIDs[0]);
		System.out.println("EmpolyeeName " +employeeNames[1] +   "  EmployeeId : " + employeeIDs[1]);
		System.out.println("EmpolyeeName " +employeeNames[2] +   "  EmployeeId : " + employeeIDs[2]);
	
	}

}