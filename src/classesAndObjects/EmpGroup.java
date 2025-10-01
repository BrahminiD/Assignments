package classesAndObjects;

public class EmpGroup {
	
	// Arrays to store employee names and IDs
    String[] employeeNames;
    int[] employeeIDs;
    
    public static void main(String[] args) {
    
    	Employee emp=new Employee();
    

    	String[] employeeNames = new String[] { emp.empName1, emp.empName2, emp.empName3 };
        int[]  employeeIDs = new int[] { emp.empID1, emp.empID2, emp.empID3 };
		
        System.out.println("Employee List:");
        for (int i = 0; i < employeeNames.length; i++) {
            System.out.println("Employee Name: " + employeeNames[i] + ", Employee ID: " + employeeIDs[i]);

        }
    
    }

}
