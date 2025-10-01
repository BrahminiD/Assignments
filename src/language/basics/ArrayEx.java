package language.basics;

public class ArrayEx {

	public static void main(String[] args) {
		
		
		//1D Array
		
		//Syntax: when we know the values
		
		String empNames[]= {"John","Smith","David","Peter"};
		int empIds[]= {101,102,103,104};
		

          System.out.println("Employee name at index 2: " +empNames[2]);
          System.out.println("Employee ID at index 3: " +empIds[3]);

	//Syntax : When we don't know the values
          
	  String countries []=new String[5];
	  countries[0]="USA";
	  countries[1]="UK";
	  countries[2]="India";
	  countries[3]="Germany";
	  countries[4]="France";
	 // countries[5]="Canada";     //ArrayIndexOF Bounds Exception
	  
	
	//2D Array
	  
	  String empData[][]= {
			  
			  {"John","Smith"}, //project 1
			  {"David","Peter"},//project 2
			  {"Linda", "Alice"} //project 3
	  };
	  
	//print Linda
	 System.out.println("Employee Name at project 3: " +empData[2][0]); 
	
	//2d array syntax when we don't know the values( 2 projects and 3  employees in each project)
	
	//0//project 1:John,Smith,David
	//1//Project 2 :Peter,Linda,Alice
	 
	//project 1
	 String empData2[][]=new String[2][3];
	 empData2[0][0]="John";
	 empData2[0][1]="Smith";
	 empData2[0][2]="David";
	//project 2
	 empData2[1][0]="Peter";
	 empData2[1][1]="Linda";
	 empData2[1][2]="Alice";
	 
	
	
	// 3d Array When we don't know the values
	//2 companies , 3 projects in each company , 4 employees in each project
	
	 //company 1 //0 
	 //project 1:John,Smith,David,Peter
	 //project 2:Linda,Alice,Bob,Charile
	 //project 3:Tom,Jerry,Harry,Ron
	 
	 
	//company 2 //1 
		 //project 1:Sam,Max,Leo,Jack
		 //project 2:Mia,Zoe,Aya,Eva
		 //project 3:Kim,Lee,Jay,Kay
	 
	 
	 String empData3[][][]=new String[2][3][4];
	 
	 empData3[0][1][1]="Alice";
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

