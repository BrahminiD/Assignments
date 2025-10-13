package assignments;

public class As2_ArrayPra1 {

	public static void main(String[] args) {

		// 3D array
		// 5 semester 2 values subjects and marks 6 subjects

		String stuData[][][] = new String[5][2][6];
		// Sem1
		// Subjects details
		stuData[0][0][0] = "Mathematics I";
		stuData[0][0][1] = "Physics";
		stuData[0][0][2] = "Chemistry";
		stuData[0][0][3] = "Computer Programming";
		stuData[0][0][4] = "Engineering Drawing";
		stuData[0][0][5] = "Basic Electrical Eng";

//Status(Marks) details
		stuData[0][1][0] = "Pass(78)";
		stuData[0][1][1] = "Pass(85)";
		stuData[0][1][2] = "Fail(21)";
		stuData[0][1][3] = "Pass(74)";
		stuData[0][1][4] = "Pass(88)";
		stuData[0][1][5] = "Pass(79)";

//Sem2
		// Subjects details
		stuData[1][0][0] = "Mathematics II";
		stuData[1][0][1] = "Mechanics";
		stuData[1][0][2] = "Environmental Sci";
		stuData[1][0][3] = "Basic Electronics";
		stuData[1][0][4] = "Engineering Physics";
		stuData[1][0][5] = "Engineering Graphics";

//Status(Marks) details
		stuData[1][1][0] = "Pass(82)";
		stuData[1][1][1] = "Pass(77))";
		stuData[1][1][2] = "Pass(93)";
		stuData[1][1][3] = "Fail(19)";
		stuData[1][1][4] = "Fail(24)";
		stuData[1][1][5] = "Pass(90)";

//Sem3
		// Subjects details
		stuData[2][0][0] = "Data Structures";
		stuData[2][0][1] = "Discrete Mathematics";
		stuData[2][0][2] = "Digital Electronics";
		stuData[2][0][3] = "Operating Systems";
		stuData[2][0][4] = "Signals and Systems";
		stuData[2][0][5] = "Object-Oriented Prog.";

//Status(Marks) details
		stuData[2][1][0] = "Pass(88)";
		stuData[2][1][1] = "Pass(81)";
		stuData[2][1][2] = "Pass(76)";
		stuData[2][1][3] = "Fail(32)";
		stuData[2][1][4] = "Pass(85)";
		stuData[2][1][5] = "Pass(78)";

//Sem4
		// Subjects details
		stuData[3][0][0] = "Algorithms";
		stuData[3][0][1] = "Computer Networks";
		stuData[3][0][2] = "Database Systems";
		stuData[3][0][3] = "Microprocessors";
		stuData[3][0][4] = "Communication Eng.";
		stuData[3][0][5] = "Software Engineering";

//Status(Marks) details
		stuData[3][1][0] = "Pass(91)";
		stuData[3][1][1] = "Pass(73)";
		stuData[3][1][2] = "Fail(19))";
		stuData[3][1][3] = "Pass(80))";
		stuData[3][1][4] = "Pass(76))";
		stuData[3][1][5] = "Pass(87)";

//Sem5
		// Subjects details
		stuData[4][0][0] = "Probability Stats";
		stuData[4][0][1] = "Machine Learning";
		stuData[3][0][2] = "Compiler Design";
		stuData[4][0][3] = "Theory of Computation";
		stuData[4][0][4] = "Embedded Systems";
		stuData[4][0][5] = "BComputer Graphics";

//Status(Marks) details
		stuData[4][1][0] = "Pass(86)";
		stuData[4][1][1] = "Pass(88)";
		stuData[4][1][2] = "Pass(84)";
		stuData[4][1][3] = "Pass(95)";
		stuData[4][1][4] = "Pass(73)";
		stuData[4][1][5] = "Pass(90)";

		// Print Semester 2 Subject 4 and Subject 5 names.
		System.out.println("Semester 2 Subject 4 :" + stuData[1][0][3]);
		System.out.println("Semester 2 Subject 5 :" + stuData[1][0][4]);

		// Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		System.out.println("Semester 4 Subject 3 :" + stuData[3][1][2]);
		System.out.println("Semester 4 Subject 6 :" + stuData[3][1][5]);

	}

}
