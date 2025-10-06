package classesAndObjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ass4_HashmapProductDetails {

	public static void main(String[] args) {
	

		 System.out.println("============Map - HashMap============");
		 
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
	       
	

	}

}
