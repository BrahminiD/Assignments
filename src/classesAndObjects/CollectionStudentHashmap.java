package classesAndObjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionStudentHashmap {

	public static void main(String[] args) {


		System.out.println("....Hash Map...");
		
    Map<String,String> emp1=new HashMap<String,String>();
    
    emp1.put("name", "Bhanu");
    emp1.put("Age", "28");
    emp1.put("Gender", "Female");
    emp1.put("oll Number", "12Tec516");
    emp1.put("Grade", "B");
    emp1.put("Major", "CSE");
    emp1.put("GPA","B2");
    emp1.put("Email", "bhanu@email.com");
    emp1.put("PAN ", "CPCE&899");
    emp1.put("Address", "Gnt");
    
    System.out.println(emp1);
	  System.out.println("Size : " + emp1.size());
    
    
 Map<String,String> emp2=new HashMap<String,String>();
    
    emp2.put("name", "anu");
    emp2.put("Age", "28");
    emp2.put("Gender", "male");
    emp2.put("oll Number", "12Tec518");
    emp2.put("Grade", "A");
    emp2.put("Major", "ME");
    emp2.put("GPA","B3");
    emp2.put("Email", "anu@email.com");
    emp2.put("PAN ", "PECE&899");
    emp2.put("Address", "nrt");
    
    System.out.println(emp2);
	  System.out.println("Size : " + emp2.size());
	  
	  Map<String,String> emp3=new HashMap<String,String>();
	    
	    emp3.put("name", "Hanu");
	    emp3.put("Age", "58");
	    emp3.put("Gender", "male");
	    emp3.put("oll Number", "12Tec515");
	    emp3.put("Grade", "A");
	    emp3.put("Major", "ME");
	    emp3.put("GPA","A3");
	    emp3.put("Email", "Hanu@email.com");
	    emp3.put("PAN ", "DECE&899");
	    emp3.put("Address", "cpt");
	    
	    System.out.println(emp3);
		  System.out.println("Size : " + emp3.size());
    
		  List<Map<String,String>> empnames=new ArrayList<Map<String,String>>();
		  empnames.add(emp1);
		  empnames.add(emp2);
		  empnames.add(emp3);
		  
		  System.out.println("employee details " +empnames);
		  
	System.out.println("...HashMap......");
	
	
	
	
Map<String,String> prod1=new HashMap<String,String>();
	
	prod1.put("Name", "LG");
	prod1.put("warranty", "1 year");
	prod1.put("company", "UST");
	prod1.put("version", "5.0");
	prod1.put("log", "present");
	prod1.put("price", "50k");
	prod1.put("manf", "Sec 2023");
	
	System.out.println(prod1);
	System.out.println("size" +prod1.size());
	
Map<String,String> prod2=new HashMap<String,String>();
	
	prod2.put("Name", "HP");
	prod2.put("warranty", "2 year");
	prod2.put("company", "UST");
	prod2.put("version", "6.0");
	prod2.put("log", "present");
	prod2.put("price", "70k");
	prod2.put("manf", "Aug 2023");
	
	System.out.println(prod2);
	System.out.println("size" +prod2.size());
	
Map<String,String> prod3=new HashMap<String,String>();
	
	prod3.put("Name", "Lenovo");
	prod3.put("warranty", "3 year");
	prod3.put("company", "Intel");
	prod3.put("version", "12.0");
	prod3.put("log", "present");
	prod3.put("price", "60k");
	prod3.put("manf", "Dec 2023");
	
	System.out.println(prod3);
	System.out.println("size" +prod3.size());
	
	
	List<Map<String,String>> prodtdetails=new ArrayList<Map<String,String>>();
	prodtdetails.add(prod1);
	prodtdetails.add(prod2);
	prodtdetails.add(prod3);
	
	System.out.println("Product details " +prodtdetails);
	
	
	
	
	
	
	
	
	}

}
