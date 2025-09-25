package language.basics; //in which package currently we are working  

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class HelloWrold {  //HelloWrold is the current file name
	//public is open access
public static void main(String[] args) throws FileNotFoundException {//starting point
	
	//main is called it as main method in java it is starting point of the program 
	   //public  is access modifier 
	//Print Statement in java 
		System.out.println("Hello, World!");
		
		
		//print the info and stay on the same line
		System.out.print("Hello");
		System.out.print("World");
		
		//print the formatted content 
		System.out.printf("Abinav is completed m.tech , emp id is 1234 and visa ststua is :true");
		System.out.println();
		System.out.printf("joythi is completed b.tech, emp id is  2351 and visa status is :false");
		System.out.println();
		System.out.printf("%s is completed m.sc, emp id is %d and visa status is:%b", "Brahmini",1236,true);
		System.out.println();
		
		//print the error message in java
		System.err.print("There is Error in Line :42");
		System.out.println();
		
		//print in logs
		Logger logger= Logger.getLogger("SampleLOgs");
		logger.info("Currently Line 49 is Executing");
		logger.warning("There is a waring at Line 50");
		
		//print the logs into text file for exporting the logs
		PrintWriter logs=new PrintWriter("C:\\Automationtraning\\JavaTraining\\Logs.txt");
		logs.println("Line 57 is excuted");
		logs.println("Line 58 is completed");
		logs.close();
		
	}//ending point of the instruction 
 
}
