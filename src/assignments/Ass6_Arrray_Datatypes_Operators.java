package assignments;

public class Ass6_Arrray_Datatypes_Operators {

	public static void main(String[] args) {

		String[] studentNames = new String[3];
		studentNames[0] = "Suresh";
		studentNames[1] = "Mahesh";
		studentNames[2] = "Naresh";

		int[] marks = new int[3];
		marks[0] = 75;
		marks[1] = 80;
		marks[2] = 82;

		// String[][] studentDetails= {{"Suresh","75"},{"Mahesh","80"},{"Naresh","82"}};

		int[] updatedMark = new int[marks.length];
		for (int i = 0; i < marks.length; i++) {
			updatedMark[i] = marks[i];
			updatedMark[i] += 10;
		}

		int sum = 0;
		for (int mark : updatedMark) {
			sum += mark;
		}
		double avgMarks = (double) sum / updatedMark.length;

		System.out.println("......Student Names.......");
		for (String names : studentNames) {
			System.out.println(names);
		}

		System.out.println("..........Original Marks:.........");
		for (int mark : marks) {
			System.out.println(mark);
		}

		System.out.println(".....Updated Marks (after adding 10)....");
		for (int mark : updatedMark) {
			System.out.println(mark);
		}

		System.out.println("Average Marks: " + avgMarks);
	}

}
