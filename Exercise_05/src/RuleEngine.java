
public class RuleEngine {
	static Double totalMarks = 0.0, percentage = 0.0, SumofCoursesMaxMarks; 
	static Integer no_of_courses;

	public static void generateResult(StudentBatch batch) {
		
		//looping through each student of a batch
		for (int stud = 0; stud < batch.students.length; stud++) {
			SumofCoursesMaxMarks = 0.0; // Initialized to zero for each student
			totalMarks = 0.0; 			// Initialized to zero for each student
			
			//looping through each course for a student of a batch
			for (int cours = 0; cours < batch.students[stud].courses.length; cours++) {
				totalMarks = totalMarks + batch.students[stud].getMarks(batch.students[stud].courses[cours]);
				SumofCoursesMaxMarks = SumofCoursesMaxMarks + batch.students[stud].courses[cours].marks;
			}

			if (percentage >= 40.0) {
				batch.students[stud].isPass = true;
			} else {
				batch.students[stud].isPass = false;
			}

			/*
			 System.out.println("Name of Student : " + batch.students[stud].name);
			 System.out.println("Sum of marks scored in each course : " + totalMarks);
			 System.out.println("Sum of maximum marks of all Courses : " +
			 SumofCoursesMaxMarks); percentage = totalMarks / SumofCoursesMaxMarks * 100;
			 System.out.println("Percentage : " + percentage);
			 System.out.println("Pass : " + batch.students[stud].isPass);
			 System.out.println();
			 */

		}
	}
}
