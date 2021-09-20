
public class ClientApp {
	
	public static void main(String[] args) {
		StudentBatch batch = new StudentBatch();
		
		Course[] list1 = {
			new Course("cs101", "Data Structures and Algo", 10, 100.0),
			new Course("cs102", "Object Oriented Concepts", 10, 100.0), 
			new Course("cs103", "Operating Systems", 10, 100.0)
		};
		Course[] list2 = {new Course(), new Course(), new Course()}; 
		Course[] list3 = {new Course(), new Course(), new Course()}; 
		
		Student s1 = new Student("s1", 22, list1);
		Student s2 = new Student("s2", 2, list1);
		Student s3 = new Student("s3", 27, list1);
		Student s4 = new Student("s4", 44, list1);
		Student s5 = new Student("s5", 13, list1);

		// adding marks to each student s1's courses
		s1.setMarks(s1.courses[0], 50.00);
		s1.setMarks(s1.courses[1], 50.00);
		s1.setMarks(s1.courses[2], 50.00);
		
		// adding marks to each student s2's courses
		s2.setMarks(s2.courses[0], 30.00);
		s2.setMarks(s2.courses[1], 30.00);
		s2.setMarks(s2.courses[2], 30.00);
		
		// adding marks to each student s3's courses
		s3.setMarks(s3.courses[0], 40.00);
		s3.setMarks(s3.courses[1], 40.00);
		s3.setMarks(s3.courses[2], 40.00);
		
		// adding marks to each student s4's courses
		s4.setMarks(s4.courses[0], 60.00);
		s4.setMarks(s4.courses[1], 60.00);
		s4.setMarks(s4.courses[2], 60.00);
		
		Student[] studentList = {s1, s2, s3, s4, s5};
		
		batch.students = studentList;
		
		RuleEngine.generateResult(batch);
		
		batch.printResult();
	}

}
