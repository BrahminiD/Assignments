package assignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ass9_conditionalstatements {
               static class Employee {
            	   
		        String name;
		        double baseSalary;
		        double experience;
		        double rating;

		        Employee(String name, double baseSalary, double experience, double rating) {
		            this.name = name;
		            this.baseSalary = baseSalary;
		            this.experience = experience;
		            this.rating = rating;
		        }
		    }

		    public static void main(String[] args) {
		        List<Employee> employees = Arrays.asList(
		            new Employee("Alice Johnson", 75000.0, 5.1, 4.2),
		            new Employee("Bob Smith", 68000.0, 3.2, 3.8),
		            new Employee("Carol Davis", 82000.0, 7.1, 4.5),
		            new Employee("David Brown", 90000.0, 10.2, 2.5),
		            new Employee("Eva Green", 60000.0, 2.4, 3.5)
		        );

		        Map<String, Double> hikePercentages = new HashMap<>();

		        for (Employee emp : employees) {
		            double variablePayPercent;
		            double bonus;

		            if (emp.rating >= 4.0) {
		                variablePayPercent = 15.0;
		                bonus = 1500;
		            } else if (emp.rating >= 3.0  && emp.rating<4) {
		                variablePayPercent = 10.0;
		                bonus = 1200;
		            } else {
		                variablePayPercent = 3.0;
		                bonus = 300;
		            }

		            double reward = emp.experience >= 5.0 ? 5000 : 0;
		            double hike = (emp.baseSalary * (variablePayPercent / 100.0)) + bonus + reward;
		            double hikePercentage = (hike / emp.baseSalary) * 100.0;

		            hikePercentages.put(emp.name, hikePercentage);
		        }

		        // Print the results
		        for (Map.Entry<String, Double> entry : hikePercentages.entrySet())
		        {
		        System.out.println("print details of employee hikes");
		        System.out.println(entry);
		        }
			

		      
		        }
		    }
		
