package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ass4_HashmapStudentdetails {

	public static void main(String[] args) {

		System.out.println("============Map - HashMap Student Details============");
		 
		  Map<String,String> studentDetails = new HashMap<String,String>();
		  studentDetails.put("name","John Doe");
		  studentDetails.put("Age","Twenty");
		  studentDetails.put("Gender","Male");
		  studentDetails.put("Roll Number","SBA12345");
		  studentDetails.put("Grade","A++");
		  studentDetails.put("Major","Computer Science");
		  studentDetails.put("GPA","A3.8");
		  studentDetails.put("Email","john@exam");
		  studentDetails.put("PAN Number","SDF6543210");
		  studentDetails.put("Adress","123 Elm St");
		  System.out.println(studentDetails);
		  System.out.println("Size : " + studentDetails.size());
		  
		  
		  System.out.println("============Map - HashMap============");
			 
		  Map<String,String> studentDetails1 = new HashMap<String,String>();
		  studentDetails1.put("name","Jane Smith");
		  studentDetails1.put("Age","Twenty One");
		  studentDetails1.put("Gender","Female");
		  studentDetails1.put("Roll Number","SBA12346");
		  studentDetails1.put("Grade","B+");
		  studentDetails1.put("Major","Mathematices");
		  studentDetails1.put("GPA","A3.5");
		  studentDetails1.put("Email","jane@exam");
		  studentDetails1.put("PAN Number","REW6543211");
		  studentDetails1.put("Adress","456 Oak St");
		  System.out.println(studentDetails1);
		  System.out.println("Size : " + studentDetails1.size());
		  
		  
		  System.out.println("============Map - HashMap============");
			 
		  Map<String,String> studentDetails2 = new HashMap<String,String>();
		  studentDetails2.put("name","Mike Brown");
		  studentDetails2.put("Age","Twenty Two");
		  studentDetails2.put("Gender","Male");
		  studentDetails2.put("Roll Number","SBA12347");
		  studentDetails2.put("Grade","A+");
		  studentDetails2.put("Major","Physics");
		  studentDetails2.put("GPA","A3.9");
		  studentDetails2.put("Email","mike@exam");
		  studentDetails2.put("PAN Number","TYR6543212");
		  studentDetails2.put("Adress","789 Pine St");
		  System.out.println(studentDetails2);
		  System.out.println("Size : " + studentDetails2.size());

		  
		  List<Map<String,String>> studentList = new ArrayList<Map<String,String>>();
		 
		  studentList.add(studentDetails);
		  studentList.add(studentDetails1);
		  studentList.add(studentDetails2);
		  
		  System.out.println("StudentList : " + studentList);
		  
	
		  
		  System.out.println("============Map - HashMap  Employee Details============");
			 
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
		  
		  
		  System.out.println("============Map - HashMap ============");
			 
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
	       
	
	
	       
	       System.out.println("============Map - HashMap Product Details============");
			 
			  Map<String,String> Product1 = new HashMap<String,String>();
			  Product1.put("Product ID","P001");
			  Product1.put("Name","Laptop");
			  Product1.put("Category", "Electronics");
			  Product1.put("Price","12K Pounds");
			  Product1.put("Stock Quantity","Not Available");
			  Product1.put("Supplier","Tech Supplies");
			  Product1.put("Warrnty","2 years");
			  Product1.put("Rating","4.5 Stars");
			  Product1.put("Manufacturing Date","Aug 2023");
			  Product1.put("Expiry Date","Aug 2028");
			
			  System.out.println(Product1);
			  System.out.println("Size : " + Product1.size());

			  
			  

				 System.out.println("============Map - HashMap============");
				 
				  Map<String,String> Product2 = new HashMap<String,String>();
				  Product2.put("Product ID","P002");
				  Product2.put("Name","Desk Chair");
				  Product2.put("Category", "Furniture");
				  Product2.put("Price","150K Pounds");
				  Product2.put("Stock Quantity","Two");
				  Product2.put("Supplier","Office Depost");
				  Product2.put("Warrnty","1 years");
				  Product2.put("Rating","4 Stars");
				  Product2.put("Manufacturing Date","Sep 2024");
				  Product2.put("Expiry Date","N/A");
				
				  System.out.println(Product2);
				  System.out.println("Size : " + Product2.size());
			  
				  System.out.println("============Map - HashMap============");
					 
				  Map<String,String> Product3 = new HashMap<String,String>();
				  Product3.put("Product ID","P003");
				  Product3.put("Name","Coffee Maker");
				  Product3.put("Category", "Kitchen");
				  Product3.put("Price","75K Pounds");
				  Product3.put("Stock Quantity","Two Hundred");
				  Product3.put("Supplier","KitchenWorld");
				  Product3.put("Warrnty","6 months");
				  Product3.put("Rating","4.2 Stars");
				  Product3.put("Manufacturing Date","Jan 2025");
				  Product3.put("Expiry Date","Jan2027");
				
				  System.out.println(Product3);
				  System.out.println("Size : " + Product3.size());
			  


			  
			  List<Map<String,String>> ProductNames = new ArrayList<Map<String,String>>();
		       ProductNames.add(Product1);
		       ProductNames.add(Product2);
		       ProductNames.add(Product3);
		      
		       System.out.println("ProductNames : " + ProductNames);
		       
	
		    // To access all data of studentList,empList,productList are mapped under Map(HashMap)

				Map<String, List<Map<String, String>>> data = new HashMap<String, List<Map<String, String>>>();
				data.put("StudentData", studentList);
				data.put("EmployeeData", employeeNames);
				data.put("ProductData", ProductNames);
				System.out.println("All Data List :" + data);
				System.out.println("***********************************************************");
				System.out.println("Supplier Name of 2nd row of ProductData: "+ data.get("ProductData").get(1).get("Supplier"));
	
	}

}
