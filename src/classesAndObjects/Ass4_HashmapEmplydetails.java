package classesAndObjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ass4_HashmapEmplydetails {

	public static void main(String[] args) {


		
		 System.out.println("============Map - HashMap============");
		 
		  Map<String,String> employee1 = new HashMap<String,String>();
		  employee1.put("Employee ID","E001");
		  employee1.put("Name","Alice Green");
		  employee1.put("Age", "Thirty");
		  employee1.put("Gender","FeMale");
		  employee1.put("Department","Enginnering");
		  employee1.put("Position","Software Engineer");
		  employee1.put("Salary","75K Pounds");
		  employee1.put("Email","alice@example.com");
		  employee1.put("PAN Number","SDF6543210");
		
		  System.out.println(employee1);
		  System.out.println("Size : " + employee1.size());

		  
		  
		  System.out.println("============Map - HashMap============");
			 
		  Map<String,String> employee2 = new HashMap<String,String>();
		  employee2.put("Employee ID","E002");
		  employee2.put("Name","Bob Johnson");
		  employee2.put("Age", "Thirty Five");
		  employee2.put("Gender","Male");
		  employee2.put("Department","Marketing");
		  employee2.put("Position","Marketeing Manager");
		  employee2.put("Salary","85K Pounds");
		  employee2.put("Email","bob@example.com");
		  employee2.put("PAN Number","REW6543211");
		
		  System.out.println(employee2);
		  System.out.println("Size : " + employee2.size());
		  
		  
		  System.out.println("============Map - HashMap============");
			 
		  Map<String,String> employee3 = new HashMap<String,String>();
		  employee3.put("Employee ID","E003");
		  employee3.put("Name","Carol White");
		  employee3.put("Age", "Twenty Eight");
		  employee3.put("Gender","FeMale");
		  employee3.put("Department","Sales");
		  employee3.put("Position","Sales Executive");
		  employee3.put("Salary","65K Pounds");
		  employee3.put("Email","carol@example.com");
		  employee3.put("PAN Number","TYR6543212");
		
		  System.out.println(employee3);
		  System.out.println("Size : " + employee3.size());


		  
		  List<Map<String,String>> employeeNames = new ArrayList<Map<String,String>>();
	       employeeNames.add(employee1);
	       employeeNames.add(employee2);
	       employeeNames.add(employee3);
	      
	       System.out.println("EmployeeNames : " + employeeNames);
	       
	
	
	}

}
